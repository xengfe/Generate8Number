package com.yskj.service;

import java.util.List;

public interface IQrCodeListService<T> {

	int deleteByPrimaryKey(String cId);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(String cId);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);

	List<T> selectAll();
	
	public List<T> queryTByPageSize(int row,int page);

	T selectByCode(String cNumber);

}
