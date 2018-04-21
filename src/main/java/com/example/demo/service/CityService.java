package com.example.demo.service;

import com.example.demo.util.RequestUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/19 22:22
 */
@Service
public class CityService {
    public Object getCityInfo(String ip) {
        String result = "";
        String getUrl = "http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=json&ip="+ip;
        System.out.println(getUrl);
        Map requestHeader = new HashMap();
        requestHeader.put("Content-Type", "text/html;charset=UTF-8");
        try {
            result = RequestUtils.getGetResponseMess(getUrl, null, requestHeader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);
        return result;
    }

    public Object getWeatherInfo(String city) {
        String result = "";
        String getUrl = "https://www.sojson.com/open/api/weather/json.shtml";
        Map requestHeader = new HashMap();
        requestHeader.put("Content-Type", "text/html;charset=UTF-8");
        Map requestParam = new HashMap();
        requestParam.put("city", city);
        try {
            result = RequestUtils.getGetResponseMess(getUrl, requestParam, requestHeader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);
        return result;
    }
}
