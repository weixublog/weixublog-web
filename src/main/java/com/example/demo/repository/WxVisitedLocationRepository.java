package com.example.demo.repository;

import com.example.demo.entity.WxVisitedLocation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/23 19:37
 */
public interface WxVisitedLocationRepository extends JpaRepository<WxVisitedLocation, Integer> {
    WxVisitedLocation findByCityAndProvinceAndCountry(String city,String province,String country);
}
