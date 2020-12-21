package com.cn.lp.dao;
import com.cn.lp.entity.Swfitentity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
@Mapper
public interface SwfitDao {
        /**
         * 查询列表
         * @return
         */
    @Autowired
        Swfitentity findUserByName(@Param("userName") String userName);



    }


