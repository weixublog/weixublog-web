package com.example.demo.controller;

import com.example.demo.entity.WxBlogInfo;
import com.example.demo.entity.WxWords;
import com.example.demo.helper.DataHelper;
import com.example.demo.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/26 22:19
 */
@Controller
@RequestMapping("/words")
public class WordsController {

    @Autowired
    private WordsService wordsService;


    /**
     *  获取所有文字信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getWordsList", method = RequestMethod.GET)
    public List<WxWords> getWordsList() {
        List<WxWords>  wxWordsList = wordsService.getWordsList();
        return wxWordsList;
    }

    /**
     *  添加一条文字信息
     * @param words 文字信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addWords", method = RequestMethod.POST)
    public DataHelper getBlogById(WxWords words, HttpServletRequest request) {
        DataHelper dataHelper = wordsService.addWordsInfo(words,request);
        return dataHelper;
    }

}
