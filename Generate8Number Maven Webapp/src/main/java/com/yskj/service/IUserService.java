package com.yskj.service;

import java.util.List;



public interface IUserService<T> {
	
	
	public void save(T user);
	public void delete(int userId);
	public void update(T user);
	public T getUserById(int userId);
	public T getUserByParemeter(String username,String password);
	public List<T> getAllUser();
	public List<T> getUserByPage(int startRow, int pageSize);
	
}
