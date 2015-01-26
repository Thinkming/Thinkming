package cn.dao.impl;

import java.util.List;

import cn.dao.BaseDao;
import cn.dao.BizClaimViewDao;
import cn.entity.BizClaimVoucher;

public class BizClaimViewDaoImpl extends BaseDao implements BizClaimViewDao {

	public List<BizClaimVoucher> View() {
		
		/*
		 *查询所有的数据
		 */
		String hql="from BizClaimVoucher";
		List<BizClaimVoucher> list = this.getHibernateTemplate().find(hql);
		return list;
	}

}
