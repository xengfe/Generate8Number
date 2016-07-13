package com.yskj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CrmDeviceCodeMapper<T> {
    int deleteByPrimaryKey(String cId);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(String cId);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
	
	List<T> selectAll();
	
	T selectByCode(String cNumber);
	
    List<T> queryTByPageSize(@Param(value = "startRow") int startRow,@Param(value = "pageSize") int pageSize);
}