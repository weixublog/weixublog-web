package com.example.demo.controller;

import com.example.demo.entity.WxPoemInfoEntity;
import com.example.demo.entity.WxWebsiteInfoEntity;
import com.example.demo.service.PoemInfoService;
import com.example.demo.service.WebsiteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/21 9:25
 */
@Controller
@RequestMapping("/website")
public class WebsiteInfoController {

    @Autowired
    private WebsiteInfoService websiteInfoService;

    @ResponseBody
    @RequestMapping(value = "/getInUsedWebsite", method = RequestMethod.GET)
    public WxWebsiteInfoEntity getInUsedWebsite() {
        return websiteInfoService.getInUsedWebsiteInfo();
    }

}
