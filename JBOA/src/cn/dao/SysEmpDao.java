package cn.dao;

import java.util.List;

import cn.entity.SysEmployee;

public interface SysEmpDao {
	public List<SysEmployee> Login(SysEmployee EmpCondition);
}
