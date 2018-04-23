package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Objects;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/22 15:25
 */
@Entity
@Table(name = "wx_blog_tag", schema = "WEIXU_BLOG")
public class WxBlogTag {
    private int blogTagId;
    private WxBlogInfo blogInfo;
    private String blogTagContent;

    @Id
    @Column(name = "blog_tag_id")
    public int getBlogTagId() {
        return blogTagId;
    }

    public void setBlogTagId(int blogTagId) {
        this.blogTagId = blogTagId;
    }

    @JsonBackReference
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="blog_id")
    public WxBlogInfo getBlogInfo() {
        return blogInfo;
    }

    public void setBlogInfo(WxBlogInfo blogInfo) {
        this.blogInfo = blogInfo;
    }

    @Basic
    @Column(name = "blog_tag_content")
    public String getBlogTagContent() {
        return blogTagContent;
    }

    public void setBlogTagContent(String blogTagContent) {
        this.blogTagContent = blogTagContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WxBlogTag wxBlogTag = (WxBlogTag) o;
        return blogTagId == wxBlogTag.blogTagId &&
                Objects.equals(blogInfo, wxBlogTag.blogInfo) &&
                Objects.equals(blogTagContent, wxBlogTag.blogTagContent);
    }

    @Override
    public int hashCode() {

        return Objects.hash(blogTagId, blogInfo, blogTagContent);
    }
}
