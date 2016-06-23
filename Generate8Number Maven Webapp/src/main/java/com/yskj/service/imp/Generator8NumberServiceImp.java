package com.yskj.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yskj.dao.CrmDeviceCodeMapper;
import com.yskj.service.IGenerator8NumberService;

@Service("generator8NumberService")
public class Generator8NumberServiceImp<T> implements IGenerator8NumberService<T>{

	@Resource
	private CrmDeviceCodeMapper<T> CrmDeviceCodeDao;
	
	@Override
	public int deleteByPrimaryKey(Integer cId) {
		return CrmDeviceCodeDao.deleteByPrimaryKey(cId);
	}

	@Override
	public int insert(T record) {
		return CrmDeviceCodeDao.insert(record);
	}

	@Override
	public int insertSelective(T record) {
		return CrmDeviceCodeDao.insertSelective(record);
	}

	@Override
	public List<T> selectAll() {
		return CrmDeviceCodeDao.selectAll();
	}

	@Override
	public T selectByPrimaryKey(Integer cId) {
		return CrmDeviceCodeDao.selectByPrimaryKey(cId);
	}

	@Override
	public int updateByPrimaryKeySelective(T record) {
		return CrmDeviceCodeDao.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(T record) {
		return CrmDeviceCodeDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public T selectByCode(String cNumber) {
		return CrmDeviceCodeDao.selectByCode(cNumber);
	}

	

}
