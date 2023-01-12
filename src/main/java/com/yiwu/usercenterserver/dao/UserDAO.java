package com.yiwu.usercenterserver.dao;

import com.yiwu.usercenterserver.domain.User;
import org.springframework.stereotype.Repository;

/**
 * UserDAO继承基类
 */
public interface UserDAO extends MyBatisBaseDao<User, Long> {
}