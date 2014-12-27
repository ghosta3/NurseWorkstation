package com.neusoft.common.domain;

import java.util.HashSet;
import java.util.Set;


/**
 * 药物信息表对应实体类
 * @author Ghost
 */

public class NurseDrug  implements java.io.Serializable {

     private String drugId;
     private String drugName;
     private Double drugPrice;

    public NurseDrug() {
    }

    public NurseDrug(String drugName) {
        this.drugName = drugName;
    }
    
    public NurseDrug(String drugName, Double drugPrice) {
        this.drugName = drugName;
        this.drugPrice = drugPrice;
    }

    public String getDrugId() {
        return this.drugId;
    }
    
    public void setDrugId(String drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return this.drugName;
    }
    
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Double getDrugPrice() {
        return this.drugPrice;
    }
    
    public void setDrugPrice(Double drugPrice) {
        this.drugPrice = drugPrice;
    }

}