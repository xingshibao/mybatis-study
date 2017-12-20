package com.xsb.study.service;

import com.xsb.study.bean.UserBean;
import com.xsb.study.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @author shibao.xing
 * @since 2017-12-20 17:43
 */
public class UserService {

    /**
     * 执行sql语句有两种方式，第一种是selectOne/insert等，第二种是mapper的方式
     *
     * 命名解析：为了减少输入量，MyBatis 对所有的命名配置元素（包括语句，结果映射，缓存等）使用了如下的命名解析规则。
     * 完全限定名（比如“com.mypackage.MyMapper.selectAllThings”）将被直接查找并且找到即用。
     * 短名称（比如“selectAllThings”）如果全局唯一也可以作为一个单独的引用。如果不唯一，有两个或两个以上的相同名称（比如“com.foo.selectAllThings ”和“com.bar.selectAllThings”），那么使用时就会收到错误报告说短名称是不唯一的，这种情况下就必须使用完全限定名。
     */
    public UserBean getById_old(SqlSessionFactory sqlSessionFactory, int id) {
        try (final SqlSession sqlSession = sqlSessionFactory.openSession()) {
            UserBean userBean = sqlSession.selectOne("com.xsb.study.mapper.UserMapper.selectById", id);
            System.out.println("完全限定名 -> " + userBean);
            userBean = sqlSession.selectOne("selectById", id);
            System.out.println("短限定名 -> " + userBean);
            return userBean;
        }
    }

    /**
     * 执行sql的方式，mapper方式
     */
    public UserBean getById_mapper(SqlSessionFactory sqlSessionFactory, int id) {
        try (final SqlSession sqlSession = sqlSessionFactory.openSession()) {
            final UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            final UserBean userBean = userMapper.selectById(id);
            System.out.println(userBean);
            return userBean;
        }
    }
}
