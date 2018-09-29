package com.mm.demo.dao;

import com.mm.demo.domain.City;
import org.apache.ibatis.annotations.Param;

public interface CityDao {
    City findByName(@Param("cityName") String cityName);
}
