package com.first.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 黄小爷
 * @description
 */
@RestController
public class TestController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @RequestMapping("sql")
    public Integer test(){
        Integer integer = jdbcTemplate.queryForObject("select count(*) from employee", Integer.class);
        return integer;
    }
}
