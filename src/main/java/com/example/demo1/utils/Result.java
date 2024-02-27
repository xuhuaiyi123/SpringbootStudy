package com.example.demo1.utils;

import java.util.HashMap;
import java.util.Map;

public class Result {
    private String message;
    private Boolean success;
    private Integer code;
    private Map<String,Object> data=new HashMap<>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    private Result(){}

    public static Result ok(){
        Result result=new Result();
        result.setSuccess(true);
        result.setMessage("成功");
        result.setCode(ResultCode.SUCCESS);
        return result;
    }

    public static Result error(){
        Result result=new Result();
        result.setSuccess(false);
        result.setMessage("失败");
        result.setCode(ResultCode.ERROR);
        return result;
    }

    public Result data(String key, Object value){
        this.data.put(key,value);
        return this;
    }
    public Result data(Map<String,Object> map){
        this.data.putAll(map);
        return this;
    }
}
