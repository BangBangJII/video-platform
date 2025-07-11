package com.example.bilibili.domain;

import java.util.Date;
import java.util.List;

public class FollowingGroup {
    private Long id;
    private Long userId;
    private String name;
    private String type;
    private Date createTime;
    private Date updateTime;
    private List<UserInfo> followingUserInfoList;
    private Integer count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<UserInfo> getFollowingUserInfoList() {
        return followingUserInfoList;
    }

    public void setFollowingUserInfoList(List<UserInfo> followingUserInfoList) {
        this.followingUserInfoList = followingUserInfoList;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
