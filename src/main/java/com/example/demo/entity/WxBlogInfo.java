package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/22 15:21
 */
@Entity
@Table(name = "wx_blog_info", schema = "WEIXU_BLOG")
public class WxBlogInfo {
    private int blogId;
    private String blogTitle;
    private String blogDesc;
    private Timestamp blogCreatedDate;
    private Integer blogVisitedTime;
    private Integer blogWriter;
    private String blogImageUrl;
    private String blogContentUrl;
    private int blogStatus;
    private int blogAuth;
    private String blogAddr;
    private Set<WxBlogTag> tagList;

    @Id
    @Column(name = "blog_id")
    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    @Basic
    @Column(name = "blog_title")
    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    @Basic
    @Column(name = "blog_desc")
    public String getBlogDesc() {
        return blogDesc;
    }

    public void setBlogDesc(String blogDesc) {
        this.blogDesc = blogDesc;
    }

    @Basic
    @Column(name = "blog_created_date")
    public Timestamp getBlogCreatedDate() {
        return blogCreatedDate;
    }

    public void setBlogCreatedDate(Timestamp blogCreatedDate) {
        this.blogCreatedDate = blogCreatedDate;
    }

    @Basic
    @Column(name = "blog_visited_time")
    public Integer getBlogVisitedTime() {
        return blogVisitedTime;
    }

    public void setBlogVisitedTime(Integer blogVisitedTime) {
        this.blogVisitedTime = blogVisitedTime;
    }

    @Basic
    @Column(name = "blog_writer")
    public Integer getBlogWriter() {
        return blogWriter;
    }

    public void setBlogWriter(Integer blogWriter) {
        this.blogWriter = blogWriter;
    }

    @Basic
    @Column(name = "blog_image_url")
    public String getBlogImageUrl() {
        return blogImageUrl;
    }

    public void setBlogImageUrl(String blogImageUrl) {
        this.blogImageUrl = blogImageUrl;
    }

    @Basic
    @Column(name = "blog_content_url")
    public String getBlogContentUrl() {
        return blogContentUrl;
    }

    public void setBlogContentUrl(String blogContentUrl) {
        this.blogContentUrl = blogContentUrl;
    }

    @Basic
    @Column(name = "blog_status")
    public int getBlogStatus() {
        return blogStatus;
    }

    public void setBlogStatus(int blogStatus) {
        this.blogStatus = blogStatus;
    }

    @Basic
    @Column(name = "blog_auth")
    public int getBlogAuth() {
        return blogAuth;
    }

    public void setBlogAuth(int blogAuth) {
        this.blogAuth = blogAuth;
    }

    @Basic
    @Column(name = "blog_addr")
    public String getBlogAddr() {
        return blogAddr;
    }

    public void setBlogAddr(String blogAddr) {
        this.blogAddr = blogAddr;
    }

    @OneToMany(cascade={CascadeType.ALL},mappedBy="blogInfo")
    public Set<WxBlogTag> getTagList() {
        return tagList;
    }
    public void setTagList(Set<WxBlogTag> tagList) {
        this.tagList = tagList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WxBlogInfo that = (WxBlogInfo) o;
        return blogId == that.blogId &&
                blogStatus == that.blogStatus &&
                blogAuth == that.blogAuth &&
                Objects.equals(blogTitle, that.blogTitle) &&
                Objects.equals(blogDesc, that.blogDesc) &&
                Objects.equals(blogCreatedDate, that.blogCreatedDate) &&
                Objects.equals(blogVisitedTime, that.blogVisitedTime) &&
                Objects.equals(blogWriter, that.blogWriter) &&
                Objects.equals(blogImageUrl, that.blogImageUrl) &&
                Objects.equals(blogContentUrl, that.blogContentUrl) &&
                Objects.equals(blogAddr, that.blogAddr);
    }

    @Override
    public int hashCode() {

        return Objects.hash(blogId, blogTitle, blogDesc, blogCreatedDate, blogVisitedTime, blogWriter, blogImageUrl, blogContentUrl, blogStatus, blogAuth, blogAddr);
    }
}
