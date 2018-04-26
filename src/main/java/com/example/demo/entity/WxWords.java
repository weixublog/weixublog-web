package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/26 22:18
 */
@Entity
@Table(name = "wx_words", schema = "WEIXU_BLOG" )
public class WxWords {
    private int wordsId;
    private String wordsContent;
    private String wordsSource;
    private String wordsTag;
    private String createdBy;
    private String createdAddr;
    private Date createdDate;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "words_id")
    public int getWordsId() {
        return wordsId;
    }

    public void setWordsId(int wordsId) {
        this.wordsId = wordsId;
    }

    @Basic
    @Column(name = "words_content")
    public String getWordsContent() {
        return wordsContent;
    }

    public void setWordsContent(String wordsContent) {
        this.wordsContent = wordsContent;
    }

    @Basic
    @Column(name = "words_source")
    public String getWordsSource() {
        return wordsSource;
    }

    public void setWordsSource(String wordsSource) {
        this.wordsSource = wordsSource;
    }

    @Basic
    @Column(name = "words_tag")
    public String getWordsTag() {
        return wordsTag;
    }

    public void setWordsTag(String wordsTag) {
        this.wordsTag = wordsTag;
    }

    @Basic
    @Column(name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "created_addr")
    public String getCreatedAddr() {
        return createdAddr;
    }

    public void setCreatedAddr(String createdAddr) {
        this.createdAddr = createdAddr;
    }

    @Basic
    @Column(name = "created_date")
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WxWords wxWords = (WxWords) o;
        return wordsId == wxWords.wordsId &&
                Objects.equals(wordsContent, wxWords.wordsContent) &&
                Objects.equals(wordsSource, wxWords.wordsSource) &&
                Objects.equals(wordsTag, wxWords.wordsTag) &&
                Objects.equals(createdBy, wxWords.createdBy) &&
                Objects.equals(createdAddr, wxWords.createdAddr) &&
                Objects.equals(createdDate, wxWords.createdDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(wordsId, wordsContent, wordsSource, wordsTag, createdBy, createdAddr, createdDate);
    }

    @Override
    public String toString() {
        return "WxWords{" +
                "wordsId=" + wordsId +
                ", wordsContent='" + wordsContent + '\'' +
                ", wordsSource='" + wordsSource + '\'' +
                ", wordsTag='" + wordsTag + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdAddr='" + createdAddr + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
