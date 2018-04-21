package com.example.demo.controller;

import com.example.demo.entity.WxPoemInfoEntity;
import com.example.demo.service.PoemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/21 8:36
 */
@Controller
@RequestMapping("/poem")
public class PoemInfoController {

    @Autowired
    private PoemInfoService poemInfoService;
    @ResponseBody
    @RequestMapping(value = "/getInUsedPoem", method = RequestMethod.GET)
    public WxPoemInfoEntity getInUsedPoem() {
        return poemInfoService.getInUsedPoem();
    }
}
