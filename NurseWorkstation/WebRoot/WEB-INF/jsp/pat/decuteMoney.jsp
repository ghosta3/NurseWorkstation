<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageHeader">
<p>每日划价：</p>
<form method="post" action="pat/decuteMoneyDay" onsubmit="return navTabSearch(this)">
  <p>病人姓名：
  <input type="text" name="patName"/>
科室名称：
<input type="text" name="officeName"/>
  </p>
  <p>主治医生：
    <input type="text" name="workName"/>
    病房号：&nbsp;&nbsp;
    <input type="text" name="roomName"/>&nbsp;&nbsp;<input type="submit" value="查询" />
  </p>
</form>
<p>&nbsp;</p>
</div>
<hr/>
<table class="table">
<thead>
  <tr>
    <th >病人姓名</th>
    <!-- <th >科室名称</th> -->
    <th >主治医生</th>
    <!-- <th >医嘱日期</th> -->
    <th >药物详细</th>
    <th >药物总价</th>
    <th >床位费</th>
    <th >划价</th>
  </tr>
  </thead>
  <tbody>
 	<s:iterator value="listAdv" id="dm" status="st">
		<td><s:property value="#dm.nursePat.patName" /></td>
		<td><s:property value="#dm.nurseWork.workName" /></td>
		<td><s:a target="dialog" href="pat/drugDetail.action?drugName=%{drug.drugName}">药物详细</s:a></td>
		<td><s:property value="drug.drugPrice"/></td>
		<td><s:property value="%{listBegin[#st.index].nurseBed.hospitalBedlevel.levelPrice}" /></td>
		<td><s:a onsubmit="return navTabSearch(this);" href="pat/dcMoney.action?drugId=%{drug.drugId}&&patId=%{#dm.nursePat.patId}&&consumMoney=%{drug.drugPrice+listBegin[#st.index].nurseBed.hospitalBedlevel.levelPrice}">划价</s:a></td>
 	</s:iterator>
  </tbody>
</table>
<p>&nbsp;</p>
<hr/>
<p>&nbsp;</p>
<p>药物划价详细： </p>
<table class="table">
<thead>
  <tr>
    <th bgcolor="#f5f5f5" scope="col">药物名称</th>
    <th bgcolor="#f5f5f5" scope="col">用量</th>
    <th bgcolor="#f5f5f5" scope="col">价格</th>
  </tr>
  </thead>
  <tbody>
  <tr>
    <td>抗菌素</td>
    <td>20ml</td>
    <td>20.00元</td>
  </tr>
  <tr>
    <td>安乃近</td>
    <td>1片</td>
    <td>0.30元</td>
  </tr>
  </tbody>
</table>