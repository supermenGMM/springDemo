package com.mm.test.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc()
//@WebMvcTest(controllers = FoodControllerTest.class)
public class FoodControllerTest {

    @Autowired
    private MockMvc mvc;

    @Before
    public void up() {

        assertNotNull(mvc);
    }
    @Test
    public void find() throws Exception {

        mvc.perform(MockMvcRequestBuilders.get("/find"))
                //返回问200
                .andExpect(MockMvcResultMatchers.status().isOk())
                //返回内容为abd
                .andExpect(MockMvcResultMatchers.content().string("abd"));
    }

    @Test
    public void add() throws Exception {

    }

    @Test
    public void del() {
    }

    @Test
    public void update() {
    }


    @Test
    public void find1() {
    }
}