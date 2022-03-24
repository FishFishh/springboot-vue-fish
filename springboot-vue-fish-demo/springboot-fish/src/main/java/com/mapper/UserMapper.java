package com.mapper;

import com.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper//mapper类 DAO层
@Repository
public interface UserMapper {
    List<User> findAll();
    List<User> selectAll();
}