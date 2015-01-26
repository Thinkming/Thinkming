<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<link href="<%=request.getContextPath() %>/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<script>
	$(function(){
			 //日期选择控件
		 	$("#startDate").click(function(){
				WdatePicker({dateFmt:'yyyy-MM-dd',maxDate:'#F{$dp.$D(\'endDate\')}',isShowClear:true, readOnly:true });
			});
			$("#endDate").click(function(){
				WdatePicker({dateFmt:'yyyy-MM-dd',minDate:'#F{$dp.$D(\'startDate\')}',isShowClear:true, readOnly:true });
			});
		});
   	function delVoucher(id){
   		if(!confirm('确定删除报单吗')) return;
   		
   		document.claimVoucherForm.action = "claimVoucher_deleteClaimVoucherById.action?claimVoucher.id="+id;
   		document.claimVoucherForm.submit();
   		
   	}
   	
</script>
<div class="action  divaction">
	<div class="t">报销单列表</div>
	<div class="pages">
		<div class="forms">
			 <s:form action="claimVoucher_searchClaimVoucher.action" name="queryForm">
	       		<label>报销单状态</label>
		       <label for="time">开始时间</label>
		       <s:textfield name="startDate" id="startDate" cssClass="nwinput"></s:textfield>
		       <label for="end-time">结束时间</label>
		       <s:textfield name="endDate" id="endDate" cssClass="nwinput"></s:textfield>
		       <input type="hidden" name="pageNo" value="1"/>
		 	   <input type="hidden" name="pageSize" value="5"/>
		       <s:submit cssClass="submit_01" value="查询"/>
	       </s:form>
	     </div>
	<!--增加报销单 区域 开始-->
	<s:form action="SearchClaimVoucherAction" name="claimVoucherForm">
		<table width="90%" border="0" cellspacing="0" cellpadding="0" class="list items">
	      <tr class="even">
	        <td>编号</td>
	        <td>填报日期</td>
	        <td>填报人</td>
	        <td>总金额</td>
	        <td>状态</td>
	        <td>待处理人</td>
	        <td>操作</td>
	      </tr>
	      <tr>
	      <s:iterator value="list" id="list">
	      <tr>
	      	<td><s:property value="#list.sysEmployeeByCreateSn.sn"/></td>
	      	<td><s:property value="#list.createTime"/></td>
	      	<td><s:property value="#list.sysEmployeeByCreateSn.name"/></td>
	      	<td><s:property value="#list.totalAccount"/></td>
	      	<td><s:property value="#list.status"/></td>
	      	<td><s:property value="#list.sysEmployeeByNextDealSn.name"/></td>
	      	<td>
	      		<a href="">增加</a>
	      		<a>删除</a>
	      		<a>修改</a>
	        	<a href="ClaimViewAction">查询</a>
	      	</td>
	      	</tr>
	      	<tr>
	      		<td><s:property value="#claim.id"/></td>
	      	</tr>
	      </s:iterator>
	 
	      <tr>
	        <td colspan="6" align="center">
		      	<c:import url="rollPage.jsp" charEncoding="UTF-8">
				<c:param name="formName" value="document.forms[0]"/>
				<c:param name="totalRecordCount" value="${pageSupport.totalCount}"/>
				<c:param name="totalPageCount" value="${pageSupport.totalPageCount}"/>
				<c:param name="currentPageNo" value="${pageSupport.currPageNo}"/>
  			</c:import> 
  		  	</td>
  		  </tr> 
	    </table>      
	   </s:form>  
	          <!--增加报销单 区域 结束-->
       </div>
      </div>