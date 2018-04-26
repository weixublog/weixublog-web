package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/23 19:36
 */
@Entity
@Table(name = "wx_visited_location", schema = "WEIXU_BLOG")
public class WxVisitedLocation {
    private int locationId;
    private String country;
    private String province;
    private String city;
    private int visitedTime;

    @Id
    @Column(name = "location_id")
    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "visited_time")
    public int getVisitedTime() {
        return visitedTime;
    }

    public void setVisitedTime(int visitedTime) {
        this.visitedTime = visitedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WxVisitedLocation that = (WxVisitedLocation) o;
        return locationId == that.locationId &&
                visitedTime == that.visitedTime &&
                Objects.equals(country, that.country) &&
                Objects.equals(province, that.province) &&
                Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {

        return Objects.hash(locationId, country, province, city, visitedTime);
    }
}
