package com.example.demo.helper;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author 黄腾
 * @Date 2017/12/24-13:53
 * @function
 */
@Component
@Data
public class DataHelper<T> {
    private  boolean status;
    private  String messager;
    private  T data;

}
