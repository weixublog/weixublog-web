package com.example.demo.service;

import com.example.demo.entity.CityInfo;
import com.example.demo.entity.WxWords;
import com.example.demo.helper.DataHelper;
import com.example.demo.repository.WordsRepository;
import com.example.demo.util.DataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/26 22:20
 */
@Service
public class WordsService {

    @Autowired
    private CityService cityService;

    @Autowired
    private WordsRepository wordsRepository;

    public DataHelper addWordsInfo(WxWords words, HttpServletRequest request) {

        DataHelper dataHelper=new DataHelper();

        if(words == null){
            dataHelper.setStatus(false);
            dataHelper.setMessage(DataUtils.FAIL);
            return dataHelper;
        }
        CityInfo cityInfo =  cityService.getCurrentCityInfo(request);
        String createdAddr = cityInfo.getProvince()+ " " +cityInfo.getCity();
        words.setCreatedAddr(createdAddr);
        words.setCreatedDate(new Date());

        wordsRepository.save(words);
        return dataHelper;

    }

    public List<WxWords> getWordsList() {
        List<WxWords> wxWordsList = wordsRepository.findAll();
        return wxWordsList;
    }
}
