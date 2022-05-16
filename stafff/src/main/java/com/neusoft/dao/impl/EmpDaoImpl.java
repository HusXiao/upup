package com.neusoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neusoft.dao.EmpDao;
import com.neusoft.entity.Emp;
import com.neusoft.utils.DBUtils;

public class EmpDaoImpl implements EmpDao {

	private int id;

	@Override
	public boolean addEmp(Emp emp) {
		// TODO Auto-generated method stub
		Connection connection = DBUtils.getConnection();
		PreparedStatement ps = null;


		try {
			ps = connection.prepareStatement("INSERT INTO emps(name,deptname,sex,tel) VALUES(?,?,?,?)");
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getDeptname());
			ps.setString(3, String.valueOf(emp.getSex()));
			ps.setString(4, emp.getTel());
			int executeUpdate = ps.executeUpdate();
			return executeUpdate == 1 ? true : false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(connection, ps, null);
		}

		return false;
	}

	@Override
	public boolean delEmp(Integer id) {
		Connection connection = DBUtils.getConnection();
		PreparedStatement ps = null;


		try {
			ps = connection.prepareStatement("DELETE FROM emps WHERE id = ?");
			ps.setInt(1, id);
			int executeUpdate = ps.executeUpdate();
			return executeUpdate == 1 ? true : false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(connection, ps, null);
		}

		return false;
	}

	@Override
	public boolean updateEmp(Emp emp) {
		Connection connection = DBUtils.getConnection();
		PreparedStatement ps = null;


		try {
			ps = connection.prepareStatement("UPDATE emps SET name = ?,deptname = ?,sex = ?,tel = ? WHERE id = ?");
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getDeptname());
			ps.setString(3, String.valueOf(emp.getSex()));
			ps.setString(4, emp.getTel());
			ps.setInt(5, emp.getId());
			int executeUpdate = ps.executeUpdate();
			return executeUpdate == 1 ? true : false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(connection, ps, null);
		}

		return false;
	}

	/*
	 * 修改名字信息
	 */
	@Override
	public boolean updatename1(Emp emp) {
		Connection connection = DBUtils.getConnection();
		PreparedStatement ps = null;


		try {
			ps = connection.prepareStatement("UPDATE emps SET name = ? WHERE id = ?");
			ps.setInt(2, emp.getId());
			ps.setString(1, emp.getName());

			int executeUpdate = ps.executeUpdate();
			return executeUpdate == 1 ? true : false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(connection, ps, null);
		}

		return false;
	}

	// 修改部门名字
	@Override
	public boolean updatedeptname(Emp emp) {
		Connection connection = DBUtils.getConnection();
		PreparedStatement ps = null;


		try {
			ps = connection.prepareStatement("UPDATE emps SET deptname = ? WHERE id = ?");
			ps.setInt(2, emp.getId());
			ps.setString(1, emp.getName());

			int executeUpdate = ps.executeUpdate();
			return executeUpdate == 1 ? true : false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(connection, ps, null);
		}

		return false;
	}


	// 修改员工性别
	@Override
	public boolean updatesex(Emp emp) {
		Connection connection = DBUtils.getConnection();
		PreparedStatement ps = null;


		try {
			ps = connection.prepareStatement("UPDATE emps SET sex = ? WHERE id = ?");
			ps.setInt(2, emp.getId());
			ps.setString(1, String.valueOf(emp.getSex()));

			int executeUpdate = ps.executeUpdate();
			return executeUpdate == 1 ? true : false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(connection, ps, null);
		}

		return false;
	}


	// 修改员工联系方式

	@Override
	public boolean updatetel(Emp emp) {
		Connection connection = DBUtils.getConnection();
		PreparedStatement ps = null;


		try {
			ps = connection.prepareStatement("UPDATE emps SET tel = ? WHERE id = ?");
			ps.setInt(2, emp.getId());
			ps.setString(1, emp.getName());

			int executeUpdate = ps.executeUpdate();
			return executeUpdate == 1 ? true : false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(connection, ps, null);
		}

		return false;
	}


}


