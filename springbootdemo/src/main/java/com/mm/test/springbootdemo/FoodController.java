package com.mm.test.springbootdemo;

import com.mm.test.dao.FoodResposity;
import com.mm.test.enums.MessageEnum;
import com.mm.test.pojo.ControllerResult;
import com.mm.test.pojo.Food;
import com.mm.test.service.FoodSerice;
import com.mm.test.util.ControllerResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
public class FoodController implements CommandLineRunner
{
    private static Logger logger = LoggerFactory.getLogger(FoodController.class);
    @Resource(name = "foodRepository")
    private FoodResposity foodResposity;

    @Autowired
    private FoodSerice foodSerice;
    /**
     * 添加加入校验。并且通过对象传递
     * @param food
     * @param bindingResult
     * @return
     */
    @PostMapping(value = "/add")
    public ControllerResult add(@Valid Food food, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            logger.info(bindingResult.getFieldError().getField()+","+bindingResult.getFieldError().getDefaultMessage());
            return ControllerResultUtil.errorResult(MessageEnum.FIELD_ERROR.getCode(),bindingResult.getFieldError().getField()+","+bindingResult.getFieldError().getDefaultMessage());
        }

        Food save = foodResposity.save(food);
        return ControllerResultUtil.successResult(save.toString());
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
        Food food = foodResposity.findById(id).orElse(null);
        foodSerice.gettGradeByAge(food.getNum());
        return food;
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
