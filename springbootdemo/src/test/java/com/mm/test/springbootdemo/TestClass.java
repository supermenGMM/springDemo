package com.mm.test.springbootdemo;

import org.junit.Test;

import java.sql.*;

public class TestClass
{
    //我么要执行创建表的DDl语句
    static String creatsql = "CREATE TABLE pepole("
            + "name varchar(10) not null,"
            + "age int(4) not null"
            + ")charset=utf8;";
    @Test
    public void test() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.4.208:3306/zhaomeng", "root", "root");
        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("SELECT  * from student");

        long l = statement.executeLargeUpdate(creatsql);
        System.out.println(l);
    }
}
