package com.mm.demo.dao;

import com.mm.demo.domain.City;
import org.apache.ibatis.annotations.Param;

public interface CityDao {
    City fingByName(@Param("cityName") String cityName);
}
