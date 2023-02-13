package org.example;


import lombok.Getter;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class NewClass {

    @Getter

    private Integer n1;

    @Getter
    private LinkedHashMap<BigDecimal, Boolean> name1;



    protected static String str;




    public NewClass (Integer n1){

    }

    private void setN1(Integer n1){
        if(n1 < -18){
            throw new RuntimeException("Error");

        }else{
           this.n1 = n1;
        }
    }
}
