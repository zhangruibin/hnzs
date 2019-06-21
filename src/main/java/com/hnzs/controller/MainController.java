package com.hnzs.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * @ClassName MainController
 * @Description TODO 主接口控制类
 * @Author Administrator
 * @Date 2019/6/20 15:07
 * @Version
 */
@Api(value = "主页接口列表")
@RequestMapping(value = "/")
@Controller
@Slf4j
public class MainController {
    @GetMapping("main")
    public String testMain(HashMap<String, Object> map) {
        map.put("hello", "欢迎进入HTML页面");
        return "view/main/index";
    }
    @GetMapping("/main2")
    public String testMain2(HashMap<String, Object> map) {
        map.put("hello", "欢迎进入HTML页面");
        return "/main/index";
    }
}
