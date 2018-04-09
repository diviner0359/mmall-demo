package com.mmall.common;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

/**
 * Created by Diviner on 2017/12/31.
 */
@Data
public class ResultWrapper<T> implements Serializable {
    private ResponseCode status;
    private T data;
}
