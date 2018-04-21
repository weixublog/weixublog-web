package com.example.demo.repository;

import com.example.demo.entity.WxWebsiteInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/21 9:27
 */
public interface WebsiteInfoRepository extends JpaRepository<WxWebsiteInfoEntity, Integer> {

    WxWebsiteInfoEntity findByWebsiteStatus(String websiteStatus);
}
