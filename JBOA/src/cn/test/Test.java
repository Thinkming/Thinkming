package cn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.biz.BizClaimVoucherBiz;
import cn.biz.SysEmpBiz;
import cn.entity.SysEmployee;

public class Test {

	public static void main(String[] args) {
		test();
	}
	
	private static void login(){
		SysEmployee Emp = new SysEmployee();
		Emp.setSn("001");
		Emp.setPassword("123");
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		SysEmpBiz eb=(SysEmpBiz) ac.getBean("biz");
		System.out.println(eb.Login(Emp).getName());
	}
	
	private static void showList(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		BizClaimVoucherBiz eb=(BizClaimVoucherBiz) ac.getBean("bbiz");
		System.out.println(eb.ShowAll().get(0));
	
	}
	private static void test(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		BizClaimVoucherBiz eb=(BizClaimVoucherBiz) ac.getBean("bbiz");
		System.out.println(eb.ShowAll().get(0).getSysEmployeeByCreateSn().getName());
	}
}
