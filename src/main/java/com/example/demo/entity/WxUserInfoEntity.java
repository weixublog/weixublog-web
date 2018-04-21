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
@Table(name = "wx_user_info", schema = "WEIXU_BLOG" )
public class WxUserInfoEntity {
    private int userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private Integer userAge;
    private String userSex;
    private String userAddr;
    private String userAvatar;
    private int userAuth;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_email")
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "user_password")
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "user_age")
    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Basic
    @Column(name = "user_sex")
    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Basic
    @Column(name = "user_addr")
    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    @Basic
    @Column(name = "user_avatar")
    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    @Basic
    @Column(name = "user_auth")
    public int getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(int userAuth) {
        this.userAuth = userAuth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WxUserInfoEntity that = (WxUserInfoEntity) o;
        return userId == that.userId &&
                userAuth == that.userAuth &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userEmail, that.userEmail) &&
                Objects.equals(userPassword, that.userPassword) &&
                Objects.equals(userAge, that.userAge) &&
                Objects.equals(userSex, that.userSex) &&
                Objects.equals(userAddr, that.userAddr) &&
                Objects.equals(userAvatar, that.userAvatar);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, userName, userEmail, userPassword, userAge, userSex, userAddr, userAvatar, userAuth);
    }
}
