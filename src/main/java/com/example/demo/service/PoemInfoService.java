package com.example.demo.service;

import com.example.demo.entity.WxPoemInfoEntity;
import com.example.demo.repository.PoemInfoRepository;
import com.example.demo.util.DataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/21 8:57
 */
@Service
public class PoemInfoService {

    @Autowired
    PoemInfoRepository poemInfoRepository;

    public WxPoemInfoEntity getInUsedPoem() {
        String poemStatus = DataUtils.STATUS_INUSE;
        return poemInfoRepository.findByPoemStatus(poemStatus);
    }
}
