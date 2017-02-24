package com.ssm.entity;

import java.util.Date;

public class User {
    private Long userId;

    private String userName;

    private Integer userAge;

    private String userSex;

    private String userPhone;

    private String userAddress;

    private String userRank;

    private Date userBirthday;

    private String userLoginSite;

    private String userLoginIp;

    private String userLoginClient;

    private Date userRegisterDate;

    private Date userLatelyLoginTime;

    private String userRetain;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserRank() {
        return userRank;
    }

    public void setUserRank(String userRank) {
        this.userRank = userRank == null ? null : userRank.trim();
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserLoginSite() {
        return userLoginSite;
    }

    public void setUserLoginSite(String userLoginSite) {
        this.userLoginSite = userLoginSite == null ? null : userLoginSite.trim();
    }

    public String getUserLoginIp() {
        return userLoginIp;
    }

    public void setUserLoginIp(String userLoginIp) {
        this.userLoginIp = userLoginIp == null ? null : userLoginIp.trim();
    }

    public String getUserLoginClient() {
        return userLoginClient;
    }

    public void setUserLoginClient(String userLoginClient) {
        this.userLoginClient = userLoginClient == null ? null : userLoginClient.trim();
    }

    public Date getUserRegisterDate() {
        return userRegisterDate;
    }

    public void setUserRegisterDate(Date userRegisterDate) {
        this.userRegisterDate = userRegisterDate;
    }

    public Date getUserLatelyLoginTime() {
        return userLatelyLoginTime;
    }

    public void setUserLatelyLoginTime(Date userLatelyLoginTime) {
        this.userLatelyLoginTime = userLatelyLoginTime;
    }

    public String getUserRetain() {
        return userRetain;
    }

    public void setUserRetain(String userRetain) {
        this.userRetain = userRetain == null ? null : userRetain.trim();
    }
}