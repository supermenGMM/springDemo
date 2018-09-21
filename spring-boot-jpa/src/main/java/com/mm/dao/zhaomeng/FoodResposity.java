package com.mm.dao.zhaomeng;

import com.mm.domain.zhaomeng.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "foodRepository")
public interface FoodResposity extends JpaRepository<Food,Integer> {
}
