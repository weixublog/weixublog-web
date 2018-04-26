package com.example.demo.service;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.CityInfo;
import com.example.demo.entity.WxVisitedLocation;
import com.example.demo.repository.WxVisitedLocationRepository;
import com.example.demo.util.IpUtil;
import com.example.demo.util.RequestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
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

    @Autowired
    WxVisitedLocationRepository wxVisitedLocationRepository;

    public Object getCityInfo(String ip) {
        String result = "";
        String getUrl = "http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=json&ip=" + ip;
        System.out.println(getUrl);
        Map requestHeader = new HashMap();
        requestHeader.put("Content-Type", "text/html;charset=UTF-8");
        try {
            result = RequestUtils.getGetResponseMess(getUrl, null, requestHeader);
            CityInfo cityInfo = JSON.parseObject(result,CityInfo.class);
            WxVisitedLocation location = wxVisitedLocationRepository.findByCityAndProvinceAndCountry(cityInfo.getCity(),cityInfo.getProvince(),cityInfo.getCountry());
            if(location == null){
                location = new WxVisitedLocation();
                location.setCity(cityInfo.getCity());
                location.setCountry(cityInfo.getCountry());
                location.setProvince(cityInfo.getProvince());
                location.setVisitedTime(1);
                wxVisitedLocationRepository.save(location);
            }else{
                location.setVisitedTime(location.getVisitedTime()+1);
                wxVisitedLocationRepository.save(location);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    public CityInfo getCurrentCityInfo(HttpServletRequest request){

        String ip = IpUtil.getIpAddr(request);

        if(IpUtil.LOCAL_ADDRESS.equals(ip)) {
            ip = "";
        }
        String result = "";
        String getUrl = "http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=json&ip=" + ip;
        System.out.println(getUrl);
        Map requestHeader = new HashMap();
        requestHeader.put("Content-Type", "text/html;charset=UTF-8");

        try {
            result = RequestUtils.getGetResponseMess(getUrl, null, requestHeader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        CityInfo cityInfo = JSON.parseObject(result,CityInfo.class);
        return cityInfo;
    }
}
