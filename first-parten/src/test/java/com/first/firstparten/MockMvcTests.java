package com.first.firstparten;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author 黄小爷
 * @description
 */
@SpringBootTest
@AutoConfigureMockMvc
public class MockMvcTests {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void MockMvcTest() throws Exception {
        mockMvc.perform(
                //发送请求
                MockMvcRequestBuilders.get("/hcl").contentType(MediaType.ALL)
                .accept(MediaType.ALL)//期望返回的类型
        ).andExpect(MockMvcResultMatchers.status().isOk())

                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void test1(){
        jdbcTemplate.queryForObject("SELECT count(*) from `employee`",Integer.class);

        };
}
