package com.boot.service.impl;

import com.boot.domain.User;
import com.boot.mapper.UserMapper;
import com.boot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
  /*  @Resource
    private RedisTemplate<String, String> redisTemplate;
*/
    @Override
    public List<User> getUserList() {

//        String value = redisTemplate.set

        return userMapper.getUserList();
    }
}
