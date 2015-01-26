package cn.dao.impl;

import java.util.List;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
//import org.hibernate.criterion.Projections;

import cn.dao.BaseDao;
import cn.dao.BizClaimVoucherDao;
import cn.entity.BizClaimVoucher;

public class BizClaimVoucherDaoImpl extends BaseDao implements BizClaimVoucherDao {
	
	public List<BizClaimVoucher> ShowAll() {
			/**
			 * Criteria是hibernate提供的一个API
			 * 使用Criteria和HQL都可以实现分页，这里使用的是Criteria
			 * 分页查询所有报销单的数据
			 * */
			List<BizClaimVoucher> list = this.getSession().createCriteria(BizClaimVoucher.class)  //要查询的表
					.add(Restrictions.isNotNull("id"))	//主键不为空
					.addOrder(Order.asc("id"))			//根据主键降序排列(desc是升序)
					.setFirstResult(1)					//设置从哪一个对象开始查询（从key值为0对象开始）
					.setMaxResults(5).list();			//设置每一页显示的对象的个数
			
			return list;
			
	}

}
