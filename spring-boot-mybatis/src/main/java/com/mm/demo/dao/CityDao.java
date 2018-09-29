package com.mm.demo.dao;

import com.mm.demo.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CityDao {
//    @Select("select * from city where city_name =#{citname}")
    City fingByName(@Param("cityName") String cityName);
}
