package com.example.demo.controller;

import com.example.demo.entity.WxBlogInfo;
import com.example.demo.helper.DataHelper;
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

    /**
     *
     * @param page 博客页数
     * @param size 博客每页显示数
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getBlogList", method = RequestMethod.GET)
    public Page<WxBlogInfo> getBlogList(@RequestParam(defaultValue = "0", required = false) Integer page,
                                        @RequestParam(defaultValue = "4", required = false) Integer size) {
        Pageable pageable = new PageRequest(page, size);
        Page<WxBlogInfo> wxBlogInfos = blogInfoService.getBlogInfoList(pageable);
        return wxBlogInfos;
    }

    /**
     * 博客ID
     * @param blogId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getBlogById", method = RequestMethod.GET)
    public WxBlogInfo getBlogById(Integer blogId) {
        WxBlogInfo wxBlogInfo = blogInfoService.getBlogById(blogId);
        return wxBlogInfo;
    }

    /**
     * 博客ID
     * @param blogId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/incrBlogVisitedTime", method = RequestMethod.GET)
    public DataHelper incrBlogVisitedTime(Integer blogId) {
        DataHelper dataHelper = blogInfoService.incrBlogVisitedTime(blogId);
        return dataHelper;
    }
}
