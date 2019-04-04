package com.sfx.wisdomagriculture.utils;

import com.sfx.wisdomagriculture.exception.BusinessException;

import java.util.Collection;

/**
 * @author SFX
 * 检查工具类
 */
public class CheckUtil {


    /**
     * 非空检查
     * @param object
     * @throws Exception
     */
    public static void isNull(Object object)throws Exception{
        if (object==null){
            throw new BusinessException("数据不能为空");
        }
        if (object instanceof String && ((String) object).length()==0){
            throw new BusinessException("数据不能为空");
        }
        if (object instanceof Collection && ((Collection) object).size()==0){
            throw new BusinessException("数据不能为空");
        }
    }


    public static void attributeIsNull(Object object,String attribute[]){
        Class obj=object.getClass();

    }



}
