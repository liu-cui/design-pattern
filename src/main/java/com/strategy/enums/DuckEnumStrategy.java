package com.strategy.enums;

import org.springframework.util.StringUtils;

/**
 * @author liucui
 */

public enum DuckEnumStrategy {
    MOLLARDDUCK("mollardDuck", "1"),
    MODELDUCK("modelDuck", "2");

    private String code;
    private String name;
    DuckEnumStrategy(){}

    DuckEnumStrategy(String name, String code){
        this.name = name;
        this.code = code;
    }

    public static String getClassNameByCode(String code){
        String name = "";
        if(StringUtils.hasText(code)){
            return name;
        }

        for(DuckEnumStrategy d : DuckEnumStrategy.values()){
            if(d.code.equalsIgnoreCase(code)){
                name = d.name;
                break;
            }
        }
        return name;
    }

    public String getCode(){
        return code;
    }

    public String getName(){
        return name;
    }

}
