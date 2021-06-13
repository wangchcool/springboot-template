package com.example.springboottemplate.common.constants;

/**
 * @author 30号男朋友
 * @ClassName: ResultCodeEnum
 * @Description: TODO
 * @date 2021年06月13日 3:24 上午
 */
public enum ResultStatusEnum {

    SUCCESS("00000", "成功"),

    ERROR("A0001", "服务器错误"),

    TEST_EXCEPTION("B0001", "异常测试");

    private final String statusCode;
    private final String statusInfo;

    ResultStatusEnum(String statusCode, String statusInfo) {
        this.statusCode = statusCode;
        this.statusInfo = statusInfo;
    }

    public String code () {
        return this.statusCode;
    }

    public String info () {
        return this.statusInfo;
    }
}
