package cn.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * SysEmployee entity. @author MyEclipse Persistence Tools
 */

public class SysEmployee implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sn;
	private SysDepartment sysDepartment;
	private SysPosition sysPosition;
	private String name;
	private String password;
	private String status;
	private Set<BizClaimVoucher> bizClaimVouchersForNextDealSn = new HashSet<BizClaimVoucher>();
	private Set<BizClaimVoucher> bizClaimVouchersForCreateSn = new HashSet<BizClaimVoucher>();

	// Constructors

	/** default constructor */
	public SysEmployee() {
	}

	/** minimal constructor */
	public SysEmployee(SysDepartment sysDepartment, SysPosition sysPosition,
			String name, String password, String status) {
		this.sysDepartment = sysDepartment;
		this.sysPosition = sysPosition;
		this.name = name;
		this.password = password;
		this.status = status;
	}

	/** full constructor */
	public SysEmployee(SysDepartment sysDepartment, SysPosition sysPosition,
			String name, String password, String status,
			Set<BizClaimVoucher> bizClaimVouchersForNextDealSn, Set<BizClaimVoucher> bizClaimVouchersForCreateSn) {
		this.sysDepartment = sysDepartment;
		this.sysPosition = sysPosition;
		this.name = name;
		this.password = password;
		this.status = status;
		this.bizClaimVouchersForNextDealSn = bizClaimVouchersForNextDealSn;
		this.bizClaimVouchersForCreateSn = bizClaimVouchersForCreateSn;
	}

	// Property accessors

	public String getSn() {
		return this.sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public SysDepartment getSysDepartment() {
		return this.sysDepartment;
	}

	public void setSysDepartment(SysDepartment sysDepartment) {
		this.sysDepartment = sysDepartment;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<BizClaimVoucher> getBizClaimVouchersForNextDealSn() {
		return this.bizClaimVouchersForNextDealSn;
	}

	public void setBizClaimVouchersForNextDealSn(
			Set<BizClaimVoucher> bizClaimVouchersForNextDealSn) {
		this.bizClaimVouchersForNextDealSn = bizClaimVouchersForNextDealSn;
	}

	public Set<BizClaimVoucher> getBizClaimVouchersForCreateSn() {
		return this.bizClaimVouchersForCreateSn;
	}

	public void setBizClaimVouchersForCreateSn(Set<BizClaimVoucher> bizClaimVouchersForCreateSn) {
		this.bizClaimVouchersForCreateSn = bizClaimVouchersForCreateSn;
	}

	public SysPosition getSysPosition() {
		return sysPosition;
	}

	public void setSysPosition(SysPosition sysPosition) {
		this.sysPosition = sysPosition;
	}

}