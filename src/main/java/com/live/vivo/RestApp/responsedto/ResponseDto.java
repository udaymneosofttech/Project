package com.live.vivo.RestApp.responsedto;

public class ResponseDto<T> {
    private T data;
    private Integer code;
    private T appMessage;



    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getAppMessage() {
        return this.appMessage;
    }

    public void setAppMessage(T appMessage) {
        this.appMessage = appMessage;
    }


}

