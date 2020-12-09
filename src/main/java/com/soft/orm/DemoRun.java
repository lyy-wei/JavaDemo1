package com.soft.orm;

import com.soft.bean.Classes;
import com.soft.bean.UserInfo;
import com.soft.mapper.ClassesMapper;
import com.soft.mapper.UserMapper;
import com.soft.utils.MybatisUtil;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class DemoRun {

    public static void main(String[] args) {

        SqlSession session = MybatisUtil.getInstance().getSqlSession();
        ClassesMapper classesMapper = session.getMapper(ClassesMapper.class);
//        UserInfo info = new UserInfo();
//        info.setId(5);
//        info.setPassword("888");
//        info.setSex("男");
//        info.setEducation("大专");
//        info.setPhone("18888888888");
//        userMapper.addUser(info);
//        List<UserInfo> userInfos = userMapper.findAll(info);
//        List list = new ArrayList();
//        list.add(1);
//        list.add(4);
//        List<UserInfo> userInfos = userMapper.findIn(list);
//        RowBounds rb = new RowBounds(0, 3);
        List<UserInfo> us = classesMapper.findAllUser2();
        session.commit();
        session.close();
//        for (UserInfo userInfo : userInfos) {
//            System.out.println(userInfo.getUserName());
//        }

    }
}