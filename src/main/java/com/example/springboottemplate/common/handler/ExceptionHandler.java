package com.example.springboottemplate.common.handler;

import com.example.springboottemplate.common.constants.ResultStatusEnum;
import com.example.springboottemplate.common.models.BusinessException;
import com.example.springboottemplate.common.models.ResultModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 30号男朋友
 * @ClassName: ExceptionHandler
 * @Description: Controller层异常转换处理
 * @date 2021年06月13日 4:47 上午
 */
@ControllerAdvice
public class ExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultModel<Object> handle(Exception e) {
        if (e instanceof BusinessException) {
            BusinessException businessException = (BusinessException) e;
            return ResultModel.isUnsuccessful(businessException.getCode(), businessException.getInfo());
        }else {
            logger.info("未知异常" + e.toString());
            return ResultModel.isUnsuccessful(ResultStatusEnum.ERROR.code(), ResultStatusEnum.ERROR.info());
        }
    }

}
