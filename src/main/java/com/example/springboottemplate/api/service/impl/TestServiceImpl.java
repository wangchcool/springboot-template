package com.example.springboottemplate.api.service.impl;

import com.example.springboottemplate.api.service.TestService;
import com.example.springboottemplate.common.constants.ResultStatusEnum;
import com.example.springboottemplate.common.models.BusinessException;
import org.springframework.stereotype.Service;

/**
 * @author 30号男朋友
 * @ClassName: TestServiceImpl
 * @Description: TODO
 * @date 2021年06月13日 5:28 上午
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test(String param) {
        if ("ok".equals(param)) {
            return "testing successful";
        } else {
            throw new BusinessException(ResultStatusEnum.TEST_EXCEPTION);
        }
    }
}
