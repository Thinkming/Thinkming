package cn.biz.impl;

import java.util.List;

import cn.biz.SysEmpBiz;
import cn.dao.SysEmpDao;
import cn.entity.SysEmployee;

public class SysEmpBizImpl implements SysEmpBiz {

	private SysEmpDao EmpDao;

	public SysEmpDao getEmpDao() {
		return EmpDao;
	}
	
	public void setEmpDao(SysEmpDao empDao) {
		EmpDao = empDao;
	}

	public SysEmployee Login(SysEmployee EmpCondition) {
		
		List<SysEmployee> list = EmpDao.Login(EmpCondition);
		
		if (list!=null) {
			
			return list.get(0);
		}
		else {
			return null;
		}
		
	}
}
