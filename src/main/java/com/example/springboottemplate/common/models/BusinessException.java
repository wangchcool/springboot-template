package com.example.springboottemplate.common.models;

import com.example.springboottemplate.common.constants.ResultStatusEnum;

/**
 * @author 30号男朋友
 * @ClassName: BusinessException
 * @Description: 自定义异常
 * @date 2021年06月13日 4:39 上午
 */
public class BusinessException extends RuntimeException{
    private String code;
    private String info;

    public BusinessException (ResultStatusEnum statusEnum) {
        this.code = statusEnum.code();
        this.info = statusEnum.info();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "BusinessException{" +
                "code='" + code + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
