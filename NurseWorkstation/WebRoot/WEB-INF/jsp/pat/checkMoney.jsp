<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<div class="pageHeader">
<p>余额查询：</p>
<!-- onsubmit="return navTabSearch(this);" -->
<form onsubmit="return navTabSearch(this);" method="post" action="pat/checkLeftMoney">
  病人姓名: <input type="text" name="patName" /><br/><br/>
  病房号&nbsp;&nbsp;: <input type="text" name="roomId" /><br/><br/>
  床位号&nbsp;&nbsp;: <input type="text" name="bedId"/><br/><br/>
<!--   开始日期: <input type="text" /> ------ 结束日期: <input type="text" /><br/><br/> -->
  
 <input type="submit" value="查询"/>

 </form>
</div>
<p>&nbsp;</p>
<div id="check_money">
<hr/>
<div class="pageContent">

<table class="table">
  <thead>
			<tr>
				<th width="120">病人姓名</th>
				<th width="80">病房号</th>
				<th width="100">床位号</th>
				<th width="100">床位费</th>
				<th width="80">预交金</th>
				<th width="80">余额</th>
				<th width="80">查看详情</th>
			</tr>
  </thead>
  
  <tbody>
  	<s:iterator value="list" id="cost">
  		<tr>
  			<td><s:property value="#cost.nursePat.patName" /></td>
  			<td><s:property value="#cost.nurseBed.nurseRoom.roomInfo" /></td>
  			<td><s:property value="#cost.nurseBed.bedId" /></td>
  			<td><s:property value="#cost.nurseBed.hospitalBedlevel.levelPrice" /></td>
  			<td><s:property value="#cost.depoMoney" /></td>
  			<td><s:property value="#cost.leftMoney" /></td>
  			<td><s:a target="dialog" href="pat/checkMoneyDetail.action?patId=%{#cost.nursePat.patId}">查看详情</s:a></td>
  			<!-- <s:a href="updateOutOfDetails.action?id=%{#outof.id}"></s:a> -->
  		</tr>
  	</s:iterator>
  </tbody>
</table>
<p></p>
<!-- 
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
</table> -->
</div>

</div>
