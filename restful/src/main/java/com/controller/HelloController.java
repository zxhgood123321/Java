package com.controller;

import com.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody//一起等于restController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;
    @RequestMapping(value = {"/say/{id}","/hi"},method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id){
        return "id:" +id;
//        return  girlProperties.getCupSize();
//        return "index";
    }
}
