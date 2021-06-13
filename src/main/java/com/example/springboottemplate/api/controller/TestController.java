package com.example.springboottemplate.api.controller;

import com.example.springboottemplate.api.service.TestService;
import com.example.springboottemplate.common.models.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 30号男朋友
 * @ClassName: TestController
 * @Description: 交互测试
 * @date 2021年06月12日 3:31 上午
 */
@RestController
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("test")
    public ResultModel<Object> test(@RequestParam String tParam) {
        return ResultModel.isSuccessful(testService.test(tParam));
    }
}
