package com.yskj.service;

import java.util.List;

public interface IGenerator8NumberService<T> {
	
    public int deleteByPrimaryKey(Integer cId);

    public int insert(T record);

    public int insertSelective(T record);

    public List<T> selectAll();

    public T selectByPrimaryKey(Integer cId);
    
    public T selectByCode(String cNumber);

    public int updateByPrimaryKeySelective(T record);

    public int updateByPrimaryKey(T record);

}
