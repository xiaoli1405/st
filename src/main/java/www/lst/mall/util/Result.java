package www.lst.mall.util;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    //业务码，比如成功、失败、权限不足等code，可自行定义
    @ApiModelProperty("返回码")
    private int resultCode;
    @ApiModelProperty("返回信息")
    private String message;
    @ApiModelProperty("返回数据")
    private T data;

    public Result() {
    }

    public Result(int resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultCode=" + resultCode +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
