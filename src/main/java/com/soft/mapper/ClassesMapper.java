package com.soft.mapper;

import com.soft.bean.Classes;
import com.soft.bean.UserInfo;

import java.util.List;

public interface ClassesMapper {
    List<Classes> findAll();
    List<UserInfo> findAllUser();
    List<Classes> findUser();
    List<UserInfo> findAllUser2();
}