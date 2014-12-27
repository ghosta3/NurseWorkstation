package com.neusoft.common.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ghost
 * 床位等级表实体类
 */
public class HospitalBedlevel  implements java.io.Serializable {

     private Short levelId;
     private Double levelPrice;
     
    public HospitalBedlevel() {
    }

    /**
     * @param levelPrice MaxValue = 999.99
     */
    public HospitalBedlevel(Double levelPrice) {
        this.levelPrice = levelPrice;
    }

    public Short getLevelId() {
        return this.levelId;
    }
    
    /**
     * @param levelId [length = 2] 由序列自动生成
     */
    public void setLevelId(Short levelId) {
        this.levelId = levelId;
    }

    public Double getLevelPrice() {
        return this.levelPrice;
    }
    
    /**
     * @param levelPrice MaxValue = 999.99
     */
    public void setLevelPrice(Double levelPrice) {
        this.levelPrice = levelPrice;
    }
}