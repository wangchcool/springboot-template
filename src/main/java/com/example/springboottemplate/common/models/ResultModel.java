package com.example.springboottemplate.common.models;

import com.example.springboottemplate.common.constants.ResultStatusEnum;

/**
 * @author 30号男朋友
 * @ClassName: ResultModel
 * @Description: TODO
 * @date 2021年06月13日 3:15 上午
 */
public class ResultModel<T> {
    private Boolean status;
    private String code;
    private String info;
    private T data;
    private Long time;

    public static ResultModel<Object> isSuccessful (Object data) {
        ResultModel<Object> resultModel = new ResultModel<>();
        resultModel.setStatus(true);
        resultModel.setCode(ResultStatusEnum.SUCCESS.code());
        resultModel.setInfo(ResultStatusEnum.SUCCESS.info());
        resultModel.setData(data);
        resultModel.setTime(System.currentTimeMillis());
        return resultModel;
    }

    public static ResultModel<Object> isSuccessful () {
        return isSuccessful(null);
    }

    public static  ResultModel<Object> isUnsuccessful (String resultCode, String resultInfo) {
        ResultModel<Object> resultModel = new ResultModel<>();
        resultModel.setStatus(false);
        resultModel.setCode(resultCode);
        resultModel.setInfo(resultInfo);
        resultModel.setTime(System.currentTimeMillis());
        return resultModel;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ResultModel{" +
                "status=" + status +
                ", code='" + code + '\'' +
                ", info='" + info + '\'' +
                ", data=" + data +
                ", time=" + time +
                '}';
    }
}
