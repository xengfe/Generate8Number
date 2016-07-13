package com.yskj.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yskj.dao.NodeMapper;
import com.yskj.service.INodeService;

@Service("nodeService")
public class NodeServiceImp<T> implements INodeService<T>{

	@Resource
	private NodeMapper<T> nodeDao;
	@Override
	public int save(T t) {
		this.nodeDao.insert(t);
		return 0;
	}

	@Override
	public T query(Long id) {
		return this.nodeDao.selectByPrimaryKey(id);
	}

	@Override
	public int update(T t) {
		this.nodeDao.updateByPrimaryKey(t);
		return 0;
	}

	@Override
	public int delete(Long id) {
		this.nodeDao.deleteByPrimaryKey(id);
		return 0;
	}

	@Override
	public List<T> queryTopNodes() {
		return this.nodeDao.queryTopNodes();
	}

	@Override
	public List<T> queryChildNodes(String pname) {
		return this.nodeDao.queryChildNodes(pname);
	}


}
