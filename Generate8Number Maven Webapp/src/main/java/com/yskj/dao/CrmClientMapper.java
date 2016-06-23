package com.yskj.dao;

import com.yskj.pojo.CrmClient;

public interface CrmClientMapper {
    int insert(CrmClient record);

    int insertSelective(CrmClient record);
}