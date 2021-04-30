package com.example.mypic.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseBo<T> implements Serializable {
    public String responseCode;

    public String responseMsg;

    public T responseData;
}
