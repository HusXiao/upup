package com.neusoft.dao;

import com.neusoft.entity.Admin;

public interface AdminDao {

	boolean addOneAdmin(Admin admin);

	Admin selectOneAdmin(Admin admin);

	boolean judgeAdmin(Admin admin);
	
}