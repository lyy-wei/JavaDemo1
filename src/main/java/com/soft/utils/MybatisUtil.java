package com.soft.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MybatisUtil {

    //mybatis配置文件路径
    private static final String CONFIG_PATH = "mybatis-config.xml";
    //SqlSessionFactory工厂对象
    private SqlSessionFactory sessionFactory = null;
    private SqlSession session = null;
    private static MybatisUtil instance = null;

    private MybatisUtil() {
        Reader reader = null;
        try {
            //把配置文件读取到IO流
            reader = Resources.getResourceAsReader(CONFIG_PATH);
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            session = sessionFactory.openSession(false);//打开事物，取消自动提交
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != reader) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //获取mybatisUtil单例
    public static synchronized MybatisUtil getInstance() {
        if(null == instance) {
            synchronized (MybatisUtil.class) {
                instance = new MybatisUtil();
            }
        }
        return instance;
    }

    public SqlSession getSqlSession() {
        return session;
    }

}