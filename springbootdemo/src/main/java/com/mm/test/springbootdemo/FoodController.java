package com.mm.test.springbootdemo;

import com.mm.test.dao.FoodResposity;
import com.mm.test.pojo.Food;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class FoodController implements CommandLineRunner
{
    @Resource(name = "foodRepository")
    private FoodResposity foodResposity;

    @PostMapping(value = "/add")
    private String add(@RequestParam String type, @RequestParam String name) {
        Food food = new Food();
        food.setName(name);
        food.setType(type);

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
