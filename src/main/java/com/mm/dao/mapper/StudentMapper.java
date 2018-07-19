package com.mm.dao.mapper;

import com.mm.pojo.Student;

import java.util.List;

public interface StudentMapper {
    /**
     * 添加用户
     * @param entity 实体
     * @return 添加id
     * @throws Exception
     */
    int add(Student entity) throws Exception;
    int delete(int id) throws Exception;
    int update(Student entity) throws Exception;
    Student get(int id) throws Exception;
    List<Student> list() throws Exception;
}
