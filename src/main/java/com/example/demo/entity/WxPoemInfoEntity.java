package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/21 8:54
 */
@Entity
@Table(name = "wx_poem_info", schema = "WEIXU_BLOG")
public class WxPoemInfoEntity {
    private int poemId;
    private String poemTitle;
    private String poemWriter;
    private String poemContent;
    private String poemDescribe;
    private Timestamp poemBirthday;
    private String poemBirthaddr;
    private String poemLeft;
    private String poemTop;
    private String poemStatus;

    @Id
    @Column(name = "poem_id")
    public int getPoemId() {
        return poemId;
    }

    public void setPoemId(int poemId) {
        this.poemId = poemId;
    }

    @Basic
    @Column(name = "poem_title")
    public String getPoemTitle() {
        return poemTitle;
    }

    public void setPoemTitle(String poemTitle) {
        this.poemTitle = poemTitle;
    }

    @Basic
    @Column(name = "poem_writer")
    public String getPoemWriter() {
        return poemWriter;
    }

    public void setPoemWriter(String poemWriter) {
        this.poemWriter = poemWriter;
    }

    @Basic
    @Column(name = "poem_content")
    public String getPoemContent() {
        return poemContent;
    }

    public void setPoemContent(String poemContent) {
        this.poemContent = poemContent;
    }

    @Basic
    @Column(name = "poem_describe")
    public String getPoemDescribe() {
        return poemDescribe;
    }

    public void setPoemDescribe(String poemDescribe) {
        this.poemDescribe = poemDescribe;
    }

    @Basic
    @Column(name = "poem_birthday")
    public Timestamp getPoemBirthday() {
        return poemBirthday;
    }

    public void setPoemBirthday(Timestamp poemBirthday) {
        this.poemBirthday = poemBirthday;
    }

    @Basic
    @Column(name = "poem_birthaddr")
    public String getPoemBirthaddr() {
        return poemBirthaddr;
    }

    public void setPoemBirthaddr(String poemBirthaddr) {
        this.poemBirthaddr = poemBirthaddr;
    }

    @Basic
    @Column(name = "poem_left")
    public String getPoemLeft() {
        return poemLeft;
    }

    public void setPoemLeft(String poemLeft) {
        this.poemLeft = poemLeft;
    }

    @Basic
    @Column(name = "poem_top")
    public String getPoemTop() {
        return poemTop;
    }

    public void setPoemTop(String poemTop) {
        this.poemTop = poemTop;
    }

    @Basic
    @Column(name = "poem_status")
    public String getPoemStatus() {
        return poemStatus;
    }

    public void setPoemStatus(String poemStatus) {
        this.poemStatus = poemStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WxPoemInfoEntity that = (WxPoemInfoEntity) o;
        return poemId == that.poemId &&
                Objects.equals(poemTitle, that.poemTitle) &&
                Objects.equals(poemWriter, that.poemWriter) &&
                Objects.equals(poemContent, that.poemContent) &&
                Objects.equals(poemDescribe, that.poemDescribe) &&
                Objects.equals(poemBirthday, that.poemBirthday) &&
                Objects.equals(poemBirthaddr, that.poemBirthaddr) &&
                Objects.equals(poemLeft, that.poemLeft) &&
                Objects.equals(poemTop, that.poemTop) &&
                Objects.equals(poemStatus, that.poemStatus);
    }

    @Override
    public int hashCode() {

        return Objects.hash(poemId, poemTitle, poemWriter, poemContent, poemDescribe, poemBirthday, poemBirthaddr, poemLeft, poemTop, poemStatus);
    }
}
