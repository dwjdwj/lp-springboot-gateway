package com.cn.lp.service;
import com.cn.lp.entity.Swfitentity;

import java.util.List;
public interface SwfitService {
        /**
         * 查询用户
         * @param Swfitentity
         */
        Swfitentity findUserByName(String userName);

    }


