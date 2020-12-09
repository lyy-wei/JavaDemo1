package com.soft.mapper;

import com.soft.bean.UserInfo;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface UserMapper {
    void addUser(UserInfo userInfo);
    void deleteUserById(UserInfo userInfo);
    void updateUser(UserInfo userInfo);
    List<UserInfo> findAll(UserInfo userInfo);
    List<UserInfo> findIn(List list);
    List<UserInfo> findAll2(RowBounds rb);
}