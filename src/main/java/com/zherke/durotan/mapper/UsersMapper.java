package com.zherke.durotan.mapper;

import com.zherke.durotan.pojo.Users;
import com.zherke.durotan.util.MyMapper;

import java.util.List;

public interface UsersMapper extends MyMapper<Users> {
    /**
     * 查询用户列表
     * @return
     */
    List<Users> findUserByMapper();

    /**
     * 根据id查询用户
     * @param userId
     * @return
     */
    Users findUserById(Integer userId);
}