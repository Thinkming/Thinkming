package cn.action;

import java.util.List;
import java.util.Map;


import cn.biz.BizClaimVoucherBiz;
import cn.entity.BizClaimVoucher;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SearchClaimVoucherAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BizClaimVoucherBiz bbiz;

	private List<BizClaimVoucher> list;
	
	private BizClaimVoucher claim;

	@Override
	public String execute() throws Exception {
		list = bbiz.ShowAll();
		if (list.size() > 0) {
			
			Map<String, Object> session=ActionContext.getContext().getSession();
			session.put("claim", claim);
			
			
			
			return SUCCESS;
		} else {
			return INPUT;
		}

	}
	
	public List<BizClaimVoucher> getList() {
		return list;
	}

	public void setList(List<BizClaimVoucher> list) {
		this.list = list;
	}

	public BizClaimVoucherBiz getBbiz() {
		return bbiz;
	}

	public void setBbiz(BizClaimVoucherBiz bbiz) {
		this.bbiz = bbiz;
	}

	public BizClaimVoucher getClaim() {
		return claim;
	}

	public void setClaim(BizClaimVoucher claim) {
		this.claim = claim;
	}
	

}
