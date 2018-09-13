package com.mm.test.springbootdemo;

import com.mm.test.dao.FoodResposity;
import com.mm.test.pojo.Food;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
public class FoodController implements CommandLineRunner
{
    @Resource(name = "foodRepository")
    private FoodResposity foodResposity;

    /**
     * 添加加入校验。并且通过对象传递
     * @param food
     * @param bindingResult
     * @return
     */
    @PostMapping(value = "/add")
    public String add(@Valid Food food, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return bindingResult.getFieldError().getField()+","+bindingResult.getFieldError().getDefaultMessage();
        }
        Food save = foodResposity.save(food);
        return save.toString();
    }

    @DeleteMapping(value = "/del/{id}")
    public void del(@PathVariable int id) {
        Food food = new Food();
        food.setId(id);
        foodResposity.delete(food);
    }

    @PutMapping(value = "/update/{id}")
    public void update(@PathVariable Integer id, @RequestParam(value = "type",required = false) String type,
                       @RequestParam(value = "name",required = false)  String name) {
        Food one = foodResposity.getOne(id);
        one.setType(type);
        one.setName(name);
        foodResposity.save(one);
    }

    @GetMapping(value = "/find/{id}")
    public Food find(@PathVariable(value = "id") Integer id) {
        return foodResposity.findById(id).orElse(null);
    }

    @GetMapping(value = "/find")
    public List find() {
        return foodResposity.findAll();
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("food controller run ");
    }
}
