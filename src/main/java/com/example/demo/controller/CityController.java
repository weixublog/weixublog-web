package com.example.demo.controller;

import com.example.demo.service.CityService;
import com.example.demo.util.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * @author 未绪
 * @Date 2018/04/19-00:07
 * @function
 */
@Controller
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @ResponseBody
    @RequestMapping(value = "/getCityInfo", method = RequestMethod.GET)
    public Object getCityInfo(HttpServletRequest request) {
        String ip = IpUtil.getIpAddr(request);

        if(IpUtil.LOCAL_ADDRESS.equals(ip)) {
            ip = "";
        }
        return cityService.getCityInfo(ip);
    }

    @ResponseBody
    @RequestMapping(value = "/getWeatherInfo", method = RequestMethod.POST)
    public Object getWeatherInfo(String city) {
        System.out.println("city===="+city);
        return cityService.getWeatherInfo(city);
    }
}
