package com.coffeewx.core;

/**
 * 响应码枚举，参考HTTP状态码的语义
 */
public enum ResultCode {
    SUCCESS( 200, "SUCCESS" ),//成功
    FAILURE( 400, "FAILURE" ),//失败
    UNAUTHORIZED( 401, "未认证或Token失效" ),//未认证（签名错误、token错误）
    NOT_FOUND( 404, "接口不存在" ),//接口不存在
    INTERNAL_SERVER_ERROR( 500, "服务器内部错误" );//服务器内部错误

    private int code;
    private String desc;

    ResultCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
