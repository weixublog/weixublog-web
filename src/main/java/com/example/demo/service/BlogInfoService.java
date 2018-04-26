package com.example.demo.service;

import com.example.demo.entity.WxBlogInfo;
import com.example.demo.helper.DataHelper;
import com.example.demo.repository.BlogInfoRepository;
import com.example.demo.util.DataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/20 12:52
 */
@Service
public class BlogInfoService {

    @Autowired
    BlogInfoRepository blogInfoRepository;

    public WxBlogInfo addBlogInfo(WxBlogInfo blogInfo) {
        blogInfoRepository.save(blogInfo);
        return blogInfo;
    }

    public Page<WxBlogInfo> getBlogInfoList(Pageable pageable) {
        return blogInfoRepository.findAll(pageable);
    }

    public void deleteBlogInfo(Integer blogId) {
        blogInfoRepository.delete(blogId);
    }

    public WxBlogInfo getBlogById(Integer blogId) {
        return blogInfoRepository.findOne(blogId);
    }

    public DataHelper incrBlogVisitedTime(Integer blogId) {
        DataHelper dataHelper =new DataHelper();
        try{
            WxBlogInfo blogInfo = blogInfoRepository.findOne(blogId);
            blogInfo.setBlogVisitedTime(blogInfo.getBlogVisitedTime()+1);
            blogInfoRepository.save(blogInfo);
        } catch (RuntimeException e){
            dataHelper.setStatus(false);
            dataHelper.setMessage(DataUtils.FAIL);
        }
        return dataHelper;
    }
}
