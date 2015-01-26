package cn.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * SysPosition entity. @author MyEclipse Persistence Tools
 */

public class SysPosition implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nameCn;
	private String nameEn;
	private Set<SysEmployee> sysEmployees = new HashSet<SysEmployee>();

	// Constructors

	/** default constructor */
	public SysPosition() {
	}

	/** full constructor */
	public SysPosition(Long id, String nameCn, String nameEn,
			Set<SysEmployee> sysEmployees) {
		super();
		this.id = id;
		this.nameCn = nameCn;
		this.nameEn = nameEn;
		this.sysEmployees = sysEmployees;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameCn() {
		return this.nameCn;
	}

	public void setNameCn(String nameCn) {
		this.nameCn = nameCn;
	}

	public String getNameEn() {
		return this.nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public Set<SysEmployee> getSysEmployees() {
		return sysEmployees;
	}

	public void setSysEmployees(Set<SysEmployee> sysEmployees) {
		this.sysEmployees = sysEmployees;
	}

}