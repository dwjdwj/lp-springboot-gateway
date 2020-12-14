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

    //@Override
    public void createSwfit(Swfitentity swfit) {
        swfitDao.createSwfit(swfit);
    }

    //@Override
    public List<Swfitentity> findAllSwfit() {
        return swfitDao.findAllSwfit();
    }

    //@Override
    public void delSwfit(String id) {

    }

   // @Override
    public void updateSwfit(Swfitentity swfit) {

    }
}

