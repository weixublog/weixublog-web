package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 未绪
 * @Date 2017/12/31-21:48
 * @function
 */
@Entity
@Data
@Table(name ="wx_blog_info")
public class WxBlogInfo {
    @Id @Column(name = "blog_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer blogId;

    @Column(name ="blog_title")
    private String blogTitle;

    @Column(name ="blog_desc")
    private String blogDesc;

    @Column(name ="blog_addr")
    private String blogAddr;

    @Column(name ="blog_created_date")
    private Date blogCreatedDate;

    @Column(name ="blog_visited_time")
    private String blogVisitedTime;

    @Column(name ="blog_writer")
    private String blogWriter;

    @Column(name ="blog_image_url")
    private String blogImageUrl;

    @Column(name ="blog_content_url")
    private String blogContentUrl;

    @Column(name ="blog_status")
    private String blogStatus;

    @Column(name ="blog_auth")
    private String blogAuth;
}
