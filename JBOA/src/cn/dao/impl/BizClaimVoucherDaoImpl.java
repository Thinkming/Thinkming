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
			 * Criteria��hibernate�ṩ��һ��API
			 * ʹ��Criteria��HQL������ʵ�ַ�ҳ������ʹ�õ���Criteria
			 * ��ҳ��ѯ���б�����������
			 * */
			List<BizClaimVoucher> list = this.getSession().createCriteria(BizClaimVoucher.class)  //Ҫ��ѯ�ı�
					.add(Restrictions.isNotNull("id"))	//������Ϊ��
					.addOrder(Order.asc("id"))			//����������������(desc������)
					.setFirstResult(1)					//���ô���һ������ʼ��ѯ����keyֵΪ0����ʼ��
					.setMaxResults(5).list();			//����ÿһҳ��ʾ�Ķ���ĸ���
			
			return list;
			
	}

}
