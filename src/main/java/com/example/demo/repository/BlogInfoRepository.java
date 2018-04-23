package com.example.demo.repository;

import com.example.demo.entity.WxBlogInfo;
import com.example.demo.entity.WxPoemInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/20 12:53
 */
@Repository
public interface BlogInfoRepository extends JpaRepository<WxBlogInfo,Integer> {
    WxBlogInfo findByBlogId(String blogId);
}