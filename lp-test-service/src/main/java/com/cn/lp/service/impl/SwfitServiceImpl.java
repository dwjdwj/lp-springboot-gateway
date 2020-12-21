package com.cn.lp.service.impl;

import com.cn.lp.service.SwfitService;
import com.cn.lp.dao.SwfitDao;
import com.cn.lp.entity.Swfitentity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@Component
public class SwfitServiceImpl implements SwfitService {
    @Autowired
    SwfitDao swfitDao;
    @Override
    public Swfitentity findUserByName(String userName) {
        System.out.println("传入值："+userName);

        Swfitentity swift = swfitDao.findUserByName(userName);

        return  swift;
    }
}

