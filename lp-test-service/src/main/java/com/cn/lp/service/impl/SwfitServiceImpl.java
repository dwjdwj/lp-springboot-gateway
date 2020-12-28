package com.cn.lp.service.impl;

import com.cn.lp.service.SwfitService;
import com.cn.lp.mapper.SwfitMapper;
import com.cn.lp.entity.Swfitentity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SwfitServiceImpl implements SwfitService {
  @Autowired
   private SwfitMapper swfitMapper;
    @Override
    public Swfitentity findUserByName(String userName) {
        System.out.println("传入值："+userName);

        Swfitentity user = swfitMapper.findUserByName(userName);

        return  user;
//        return null;

    }
}
