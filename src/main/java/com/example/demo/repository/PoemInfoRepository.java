package com.example.demo.repository;

import com.example.demo.entity.WxBlogInfo;
import com.example.demo.entity.WxPoemInfoEntity;
import com.example.demo.entity.WxWebsiteInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/21 8:58
 */
public interface PoemInfoRepository  extends JpaRepository<WxPoemInfoEntity,Integer> {

    WxPoemInfoEntity findByPoemStatus(String poemStatus);
}
