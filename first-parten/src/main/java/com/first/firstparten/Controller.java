package com.first.firstparten;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.first.entity.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


/**
 * @author 黄小爷
 * @description
 */
@RestController
public class Controller {

    @Autowired
    MessageSource message;

    @RequestMapping("/hcl")
    public String method(){
        String message = this.message.getMessage("user.query.success", null, LocaleContextHolder.getLocale());
        return message;
    }
}