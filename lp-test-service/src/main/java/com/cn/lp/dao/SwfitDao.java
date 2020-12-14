package com.cn.lp.dao;
import com.cn.lp.entity.Swfitentity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
@Mapper
public interface SwfitDao {
        /**
         * 新增
         * @param
         */
        void  createSwfit(Swfitentity swfit);
        /**
         * 查询列表
         * @return
         */
        List<Swfitentity> findAllSwfit();

        /**
         * 删除
         * @param id
         */
        void delSwfit(String id);

        /**
         * 修改
         * @param
         */
        void updateSwfit(Swfitentity swfit);
    }


