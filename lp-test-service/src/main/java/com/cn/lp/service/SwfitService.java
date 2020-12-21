package com.cn.lp.service;
import com.cn.lp.entity.Swfitentity;

import java.util.List;
//@Service
public interface SwfitService {
        /**
         * 查询用户
         * @param Swfitentity
         */
        Swfitentity findUserByName(String userName);

    }


