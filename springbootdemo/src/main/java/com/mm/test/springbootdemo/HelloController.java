package com.mm.test.springbootdemo;

import com.mm.test.pojo.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Value("${name}")
    String name;

    @Value(("${age}"))
    String age;

    @Value("${content}")
    String content;


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {

        return "hello " + content;
    }

    @Resource(name = "person")
    private PersonProperties personProperties;
    @RequestMapping(value = "/say", method = RequestMethod.POST)
    public String say() {
        return personProperties.toString();
    }

    /**
     * 传参数
     */

    @RequestMapping(value = {"{id}/run","run/{id}"},method = RequestMethod.GET)
    public String run(@PathVariable(value = "id",required = false) String id) {
        return "Pao"+id;
    }
   @GetMapping(value = "jump")
    public String jump(@RequestParam(value = "id",required = false,defaultValue = "0") String id) {
        return "jump"+id;
    }
}
