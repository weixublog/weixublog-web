package com.example.demo.service;

import com.example.demo.entity.WxPoemInfoEntity;
import com.example.demo.entity.WxWebsiteInfoEntity;
import com.example.demo.repository.PoemInfoRepository;
import com.example.demo.repository.WebsiteInfoRepository;
import com.example.demo.util.DataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/21 9:26
 */
@Service
public class WebsiteInfoService {


    @Autowired
    WebsiteInfoRepository websiteInfoRepository;
    public WxWebsiteInfoEntity getInUsedWebsiteInfo() {
        String websiteStatus = DataUtils.STATUS_INUSE;
        return websiteInfoRepository.findByWebsiteStatus(websiteStatus);

    }
}
