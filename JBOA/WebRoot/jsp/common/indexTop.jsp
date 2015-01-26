<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<div class="top">
	<div class="global-width">
		<img src="images/logo.gif" class="logo" />
	</div>
</div>

<div class="status">
	<div class="global-width">
		<span class="usertype">【登录角色：<s:property value="#session.sysemp.sysPosition.nameCn"/>】</span><s:property value="#session.sysemp.name"/>你好！欢迎访问青鸟办公管理系统！
	</div>
</div>
