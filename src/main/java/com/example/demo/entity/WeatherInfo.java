package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/19 22:16
 */
@Data
public class WeatherInfo {
    private String city;        // 当前城市
    private String country;     // 当前国家
    private String province;    // 当前省份
    private Date date;          //当前日期
    private String humidity;    //湿度
    private String quality;     //天气质量
    private String sunrise;     //日出
    private String sunset;      //日落
    private String windDirection;//风向
    private String type;        //天气类型
    private String notice;      //建议
}
