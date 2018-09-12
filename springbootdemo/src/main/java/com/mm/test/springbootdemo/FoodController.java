package com.mm.test.springbootdemo;

import com.mm.test.dao.FoodResposity;
import com.mm.test.pojo.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.awt.FontDescriptor;

import java.util.List;

@RestController
public class FoodController {
    @Autowired
    private FoodResposity foodResposity;

    @PostMapping(value = "add")
    private String add(@RequestParam String type, @RequestParam String name) {
        Food food = new Food();
        food.setName(name);
        food.setType(type);

        Food save = foodResposity.save(food);
        return save.toString();
    }

    @DeleteMapping(value = "del/{id}")
    private void del(@PathVariable int id) {
        Food food = new Food();
        food.setId(id);
        foodResposity.delete(food);
    }

    @PutMapping(value = "update")
    private void update(@RequestParam int id, @RequestParam String type, @RequestParam String name) {
        Food one = foodResposity.getOne(id);
        one.setType(type);
        one.setName(name);
        foodResposity.save(one);
    }

    @GetMapping(value = "find/{id}")
    private Food find(@PathVariable Integer id) {
        return foodResposity.getOne(id);
    }

    @GetMapping(value = "find")
    private List find() {
        return foodResposity.findAll();
    }
}
