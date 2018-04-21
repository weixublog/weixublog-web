package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/21 8:55
 */
@Entity
@Table(name = "wx_website_info", schema = "WEIXU_BLOG")
public class WxWebsiteInfoEntity {
    private int websiteId;
    private String websiteName;
    private String githubAddr;
    private String csdnAddr;
    private String copyright;
    private String websiteCover;
    private String websiteStatus;

    @Id
    @Column(name = "website_id")
    public int getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(int websiteId) {
        this.websiteId = websiteId;
    }

    @Basic
    @Column(name = "website_name")
    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    @Basic
    @Column(name = "github_addr")
    public String getGithubAddr() {
        return githubAddr;
    }

    public void setGithubAddr(String githubAddr) {
        this.githubAddr = githubAddr;
    }

    @Basic
    @Column(name = "csdn_addr")
    public String getCsdnAddr() {
        return csdnAddr;
    }

    public void setCsdnAddr(String csdnAddr) {
        this.csdnAddr = csdnAddr;
    }

    @Basic
    @Column(name = "copyright")
    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    @Basic
    @Column(name = "website_cover")
    public String getWebsiteCover() {
        return websiteCover;
    }

    public void setWebsiteCover(String websiteCover) {
        this.websiteCover = websiteCover;
    }

    @Basic
    @Column(name = "website_status")
    public String getWebsiteStatus() {
        return websiteStatus;
    }

    public void setWebsiteStatus(String websiteStatus) {
        this.websiteStatus = websiteStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WxWebsiteInfoEntity that = (WxWebsiteInfoEntity) o;
        return websiteId == that.websiteId &&
                Objects.equals(websiteName, that.websiteName) &&
                Objects.equals(githubAddr, that.githubAddr) &&
                Objects.equals(csdnAddr, that.csdnAddr) &&
                Objects.equals(copyright, that.copyright) &&
                Objects.equals(websiteCover, that.websiteCover) &&
                Objects.equals(websiteStatus, that.websiteStatus);
    }

    @Override
    public int hashCode() {

        return Objects.hash(websiteId, websiteName, githubAddr, csdnAddr, copyright, websiteCover, websiteStatus);
    }
}
