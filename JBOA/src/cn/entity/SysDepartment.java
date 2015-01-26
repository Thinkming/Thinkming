package cn.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * SysDepartment entity. @author MyEclipse Persistence Tools
 */

public class SysDepartment implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Set<SysEmployee> sysEmployees = new HashSet<SysEmployee>();
	private Set<BizClaimVoucherStatistics> bizClaimVoucherStatisticses = new HashSet<BizClaimVoucherStatistics>();

	// Constructors

	/** default constructor */
	public SysDepartment() {
	}

	/** minimal constructor */
	public SysDepartment(String name) {
		this.name = name;
	}

	/** full constructor */
	public SysDepartment(String name, Set<SysEmployee> sysEmployees,
			Set<BizClaimVoucherStatistics> bizClaimVoucherStatisticses) {
		this.name = name;
		this.sysEmployees = sysEmployees;
		this.bizClaimVoucherStatisticses = bizClaimVoucherStatisticses;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<SysEmployee> getSysEmployees() {
		return this.sysEmployees;
	}

	public void setSysEmployees(Set<SysEmployee> sysEmployees) {
		this.sysEmployees = sysEmployees;
	}

	public Set<BizClaimVoucherStatistics> getBizClaimVoucherStatisticses() {
		return this.bizClaimVoucherStatisticses;
	}

	public void setBizClaimVoucherStatisticses(Set<BizClaimVoucherStatistics> bizClaimVoucherStatisticses) {
		this.bizClaimVoucherStatisticses = bizClaimVoucherStatisticses;
	}

}