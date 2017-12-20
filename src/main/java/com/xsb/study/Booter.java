package com.xsb.study;

import com.xsb.study.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author shibao.xing
 * @since 2017-12-20 18:04
 */
public class Booter {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static UserService userService = new UserService();

    public static void main(String[] args) {
//        userService.getById_old(sqlSessionFactory, 1);
        userService.getById_mapper(sqlSessionFactory, 1);
    }
}
