package com.example.demo.controller;

import com.example.demo.entity.WxBlogInfo;
import com.example.demo.service.BlogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈有关博客部分的后台接口〉<br>
 *
 * @author 未绪
 * @time 2018/4/20 12:52
 */
@Controller
@RequestMapping("/blog")
public class BlogInfoController {

    @Autowired
    BlogInfoService blogInfoService;

    @ResponseBody
    @RequestMapping(value = "/getBlogList", method = RequestMethod.GET)
    public Page<WxBlogInfo> getBlogList(@RequestParam(defaultValue = "0", required = false) Integer page,
                                        @RequestParam(defaultValue = "4", required = false) Integer size) {
        Pageable pageable = new PageRequest(page, size);
        Page<WxBlogInfo> wxBlogInfos = blogInfoService.getBlogInfoList(pageable);
        return wxBlogInfos;
    }
}
