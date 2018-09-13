package com.mm.test.dao;

import com.mm.test.pojo.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository(value = "foodRepository")
public interface FoodResposity extends JpaRepository<Food,Integer> {
}
