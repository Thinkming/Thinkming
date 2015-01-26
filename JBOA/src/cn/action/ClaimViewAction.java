package cn.action;

import java.util.List;
import java.util.Map;

import cn.biz.BizClaimViewBiz;
import cn.entity.BizClaimVoucher;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ClaimViewAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BizClaimViewBiz viewbiz;
	
	
	
	@Override
	public String execute() throws Exception {
		
		List<BizClaimVoucher> list= viewbiz.ShowView();
		System.out.println("id is"+list.get(0).getId());
		if(list.size()>0){
			return SUCCESS;
		}
		
		return INPUT;
	}

	public BizClaimViewBiz getViewbiz() {
		return viewbiz;
	}

	public void setViewbiz(BizClaimViewBiz viewbiz) {
		this.viewbiz = viewbiz;
	}

}
