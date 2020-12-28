package com.cn.lp.mapper;
import com.cn.lp.entity.Swfitentity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
//@Mapper
public interface SwfitMapper {

        /**
         * 查询列表
         * @return
         */

        Swfitentity findUserByName(@Param("userName") String userName);

    }


