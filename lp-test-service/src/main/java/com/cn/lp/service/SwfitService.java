package com.cn.lp.service;
import com.cn.lp.entity.Swfitentity;

import java.util.List;
public interface SwfitService {
        /**
         * 新增用户
         * @param Swfitentity
         */
        public void createSwfit(Swfitentity swfit);
        /**
         * 查询用户列表
         * @return
         */
        public List<Swfitentity> findAllSwfit();

        /**
         * 删除用户
         * @param id
         */
        void delSwfit(String id);

        /**
         * 修改用户
         * @param Swfitentity
         */
        void updateSwfit(Swfitentity swfit);

    }


