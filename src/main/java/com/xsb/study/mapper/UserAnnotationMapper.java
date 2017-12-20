package com.xsb.study.mapper;

import com.xsb.study.bean.UserBean;
import org.apache.ibatis.annotations.Select;

/**
 * @author shibao.xing
 * @since 2017-12-20 17:58
 */
public interface UserAnnotationMapper {

    @Select("SELECT id, email, username AS userName, role_id AS roleId, password_hash AS passwordHash, confirmed FROM users WHERE id = #{id}")
    UserBean selectById(int id);
}
