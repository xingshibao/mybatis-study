package com.xsb.study.mapper;

import com.xsb.study.bean.UserBean;

/**
 * @author shibao.xing
 * @since 2017-12-20 17:51
 */
public interface UserMapper {

    UserBean selectById(int id);
}
