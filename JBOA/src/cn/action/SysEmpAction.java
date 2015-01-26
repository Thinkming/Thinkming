package cn.action;



import java.util.Map;

import cn.biz.SysEmpBiz;
import cn.entity.SysEmployee;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SysEmpAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysEmployee employee;

	private SysEmpBiz biz;

	@Override
	public String execute() throws Exception {

		SysEmployee sysemp = biz.Login(employee);

		if (sysemp != null) {
       
			Map<String, Object> session=ActionContext.getContext().getSession();
			session.put("sysemp", sysemp);
                  		
			return SUCCESS;
		} else {
			return INPUT;
		}

	}

	public SysEmpBiz getBiz() {
		return biz;
	}

	public void setBiz(SysEmpBiz biz) {
		this.biz = biz;
	}

	public SysEmployee getEmployee() {
		return employee;
	}

	public void setEmployee(SysEmployee employee) {
		this.employee = employee;
	}
}
