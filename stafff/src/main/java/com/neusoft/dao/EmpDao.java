package com.neusoft.dao;

import java.util.List;


import com.neusoft.entity.Emp;



public interface EmpDao {
	boolean addEmp(Emp emp);
		
	boolean delEmp(Integer id);
	
	boolean updateEmp(Emp emp);


	boolean updatename1(Emp emp);

	boolean updatedeptname(Emp emp);

	boolean updatesex(Emp emp);

	boolean updatetel(Emp emp);
}
