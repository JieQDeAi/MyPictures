package com.example.mypic.util;

import lombok.Data;

@Data
public class ResponseBo<T> {
    public String responseCode;

    public String responseMsg;

    public T responseData;
}
