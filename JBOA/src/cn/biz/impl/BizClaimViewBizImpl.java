package cn.biz.impl;

import java.util.List;

import cn.biz.BizClaimViewBiz;
import cn.dao.BizClaimViewDao;
import cn.entity.BizClaimVoucher;

public class BizClaimViewBizImpl implements BizClaimViewBiz {
	
	private BizClaimViewDao claimview;
	
	public List<BizClaimVoucher> ShowView() {
			List<BizClaimVoucher> list = claimview.View();
			if(list.size()>0){
				return list;
			}
			return null;
	}

	public BizClaimViewDao getClaimview() {
		return claimview;
	}

	public void setClaimview(BizClaimViewDao claimview) {
		this.claimview = claimview;
	}
	
	
	
}
