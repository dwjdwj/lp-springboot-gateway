package com.cn.lp.domain.fegin;

import lombok.Data;

import java.io.Serializable;

//引入lombak依赖
@Data
public class Swfitentity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String userName;

}
