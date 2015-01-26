package cn.biz.impl;

import java.util.List;

import cn.biz.BizClaimVoucherBiz;
import cn.dao.BizClaimVoucherDao;
import cn.entity.BizClaimVoucher;

public class BizClaimVoucherBizImpl implements BizClaimVoucherBiz {
	
	private BizClaimVoucherDao claimvoucher;	
	
	public List<BizClaimVoucher> ShowAll() {

		List<BizClaimVoucher> list = claimvoucher.ShowAll();
		if(list.size()>0){
			return list;
		}
		return null;
	}

	public BizClaimVoucherDao getClaimvoucher() {
		return claimvoucher;
	}

	public void setClaimvoucher(BizClaimVoucherDao claimvoucher) {
		this.claimvoucher = claimvoucher;
	}


}
