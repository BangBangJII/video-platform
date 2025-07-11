package com.example.bilibili.dao;

import com.example.bilibili.domain.FollowingGroup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FollowingGroupDao {
    FollowingGroup getByType(String type);
    FollowingGroup getById(Long id);
    List<FollowingGroup> getByUserId(Long userId);
    Integer addFlowingGroup(FollowingGroup flowingGroup);
    List<FollowingGroup> getUserFollowingGroups(Long userId);
}
