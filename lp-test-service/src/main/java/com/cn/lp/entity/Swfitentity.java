package com.cn.lp.entity;

import lombok.Data;
import org.springframework.boot.convert.DataSizeUnit;

import java.io.Serializable;

//引入lombak依赖
@Data
public class Swfitentity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String userName;

}
