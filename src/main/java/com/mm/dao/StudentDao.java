package com.mm.dao;

import com.mm.dao.mapper.StudentMapper;
import com.mm.pojo.Student;
import com.mm.tool.DBTools;
import org.apache.ibatis.session.SqlSession;

public class StudentDao {
    private SqlSession sqlSession;
    private StudentMapper studentMapper;

    public StudentDao() {
        sqlSession = DBTools.getSqlSession();
        studentMapper = sqlSession.getMapper(StudentMapper.class);
    }

    public int add(Student student) throws Exception {
        int result = studentMapper.add(student);
        sqlSession.commit();;
        return result;
    }

    public int delete(int id) throws Exception {
        int result = studentMapper.delete(id);
        sqlSession.commit();
        return result;
    }

    public int update(Student student) throws Exception {
        int result = studentMapper.update(student);
        sqlSession.commit();
        return result;
    }

    public Student get(int id) throws Exception {
        Student student = studentMapper.get(id);
        sqlSession.commit();
        return student;
    }


}
