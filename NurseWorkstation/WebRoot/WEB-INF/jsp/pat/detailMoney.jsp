<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<table class="table">
  <thead>
			<tr>
				<th width="120">病人姓名</th>
				<th width="80">消费日期</th>
				<th width="100">药物费</th>
				<th width="80">其他消费</th>
				<th width="80">该天总计</th>
			</tr>
  </thead>
  <tbody>
  	<s:iterator value="detail" id="de">
  		<tr>
  			<td><s:property value="#de.nursePat.patName" /></td>
  			<td><s:property value="#de.constTime" /></td>
  			<td><s:property value="#de.nurseDrug.drugPrice" /></td>
  			<td><s:property value="#de.otherCost" /></td>
  			<td><s:property value="#de.nurseDrug.drugPrice+#de.otherCost" /></td>
  		</tr>
  	</s:iterator>
  </tbody>
</table>