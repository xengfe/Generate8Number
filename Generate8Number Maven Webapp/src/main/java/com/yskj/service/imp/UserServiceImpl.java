package com.yskj.service.imp;

import java.util.List;


import org.springframework.stereotype.Service;

import com.yskj.service.IUserService;

@Service("userService")  
public class UserServiceImpl<T> implements IUserService<T> {
	

	public UserServiceImpl() {
	}

	@Override
	public T getUserById(int userId) {
		return null;
	}

	@Override
	public void save(T user) {
	}

	@Override
	public void delete(int userId) {
		
	}

	@Override
	public void update(T user) {
		
	}

	@Override
	public T getUserByParemeter(String username, String password) {
		return null;
	}

	@Override
	public List<T> getAllUser() {
		return null;
	}

	@Override
	public List<T> getUserByPage(int startRow, int pageSize) {
		return null;
	}

	
	

}
