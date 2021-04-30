package com.example.mypic.serviceImpl;

import com.example.mypic.mapper.UserMapper;
import com.example.mypic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List getList() {
        return userMapper.getList();
    }
}
