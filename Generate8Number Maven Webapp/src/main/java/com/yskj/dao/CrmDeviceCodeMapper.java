package com.yskj.dao;

import com.yskj.pojo.CrmDeviceCode;
import com.yskj.pojo.CrmDeviceCodeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CrmDeviceCodeMapper<T> {
    int countByExample(CrmDeviceCodeExample example);

    int deleteByExample(CrmDeviceCodeExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectAll();

    T selectByPrimaryKey(Integer cId);
    
    T selectByCode(String cNumber);

    int updateByExampleSelective(@Param("record") CrmDeviceCode record, @Param("example") CrmDeviceCodeExample example);

    int updateByExample(@Param("record") CrmDeviceCode record, @Param("example") CrmDeviceCodeExample example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}