package cn.dao.impl;

import java.util.List;

import cn.dao.BaseDao;
import cn.dao.SysEmpDao;
import cn.entity.SysEmployee;

public class SysEmpDaoImpl extends BaseDao implements SysEmpDao{

	public List<SysEmployee> Login(SysEmployee EmpCondition) {
		String hql="from SysEmployee s where s.sn=? and s.password=?";
		List<SysEmployee> list = this.getHibernateTemplate().find(hql,new Object[]{EmpCondition.getSn(),EmpCondition.getPassword()});
		return list;
	}

}
