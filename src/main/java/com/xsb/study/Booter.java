package com.xsb.study;

import com.xsb.study.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

/**
 * @author shibao.xing
 * @since 2017-12-20 18:04
 */
public class Booter {

    private static final Logger logger = LoggerFactory.getLogger(Booter.class);

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
        printPlant();
        userService.getById_mapper(sqlSessionFactory, 1);
    }

    /**
     * 打印个小飞机，代表项目起来啦
     */
    private static void printPlant() {
        logger.info("--------------------------------------------------------------------------------");
        logger.info("|                                      |                                       |");
        logger.info("|                                --====|====--                                 |");
        logger.info("|                                      |                                       |");
        logger.info("|                                                                              |");
        logger.info("|                                  .-'''''-.                                   |");
        logger.info("|                                .'_________'.                                 |");
        logger.info("|                               /_/_|__|__|_\\_\\                                |");
        logger.info("|                              ;'-._       _.-';                               |");
        logger.info("|         ,--------------------|    `-. .-'    |--------------------,          |");
        logger.info("|          ``''--..__    ___   ;       '       ;   ___    __..--''``           |");
        logger.info("|                    `'-// \\\\.._\\             /_..// \\\\- '`                    |");
        logger.info("|                       \\\\_//    '._       _.'      \\\\_//                      |");
        logger.info("--------------------------------------------------------------------------------");
    }
}
