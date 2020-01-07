package cn.controller;


import cn.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@CrossOrigin
@Controller
public class asd {

    @Autowired
    private testService testService;

    @ResponseBody
    @RequestMapping("/asd")
    public Integer post(Integer d){
        int c=1;
    return testService.aa(c);
    }
}
