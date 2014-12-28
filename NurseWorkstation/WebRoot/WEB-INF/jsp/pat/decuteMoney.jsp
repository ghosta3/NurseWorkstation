<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageHeader">
<p>每日划价：</p>
<form onsubmit="return navTabSearch(this);" action="pat/decuteMoneyDay" method="post">
<div class="searchBar">

  <p>病人姓名：
  <input type="text" name="patName"/>
  </p>
  <p>主治医生：
    <input type="text" name="workName"/><input type="submit" value="查询" />
  </p>
  </div>
  
</form>
<p>&nbsp;</p>
</div>
<hr/>
<div class="pageContent">
<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="demo_page4.html" target="navTab"><span>添加</span></a></li>
			<li><a class="delete" href="pat/dcMoney.action?drugId=%{drug.drugId}&&patId=%{#dm.nursePat.patId}&&consumMoney=%{drug.drugPrice+listBegin[#st.index].nurseBed.hospitalBedlevel.levelPrice}" target="ajaxTodo" title="确定要划价吗?"><span>划价</span></a></li>
			<li><a class="edit" href="demo_page4.html?uid={sid_user}" target="navTab"><span>修改</span></a></li>
			<li class="line">line</li>
			<li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" targetType="navTab" title="实要导出这些记录吗?"><span>导出EXCEL</span></a></li>
		</ul>
</div>
<table id="advlist" class="table" width="100%">
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
 	<tr>
		<td><s:property value="#dm.nursePat.patName" /></td>
		<td><s:property value="#dm.nurseWork.workName" /></td>
		<td><s:a target="dialog" href="pat/drugDetail.action?drugId=%{drug[#st.index].drugId}">药物详细</s:a></td>
		<td><s:property value="%{drug[#st.index].drugPrice}"/> </td>
		<td><s:property value="%{listBegin[#st.index].nurseBed.hospitalBedlevel.levelPrice}" /></td>
		<td><s:a href="pat/dcMoney.action?drugId=%{drug.drugId}&&patId=%{#dm.nursePat.patId}&&consumMoney=%{drug[#st.index].drugPrice+listBegin[#st.index].nurseBed.hospitalBedlevel.levelPrice}">划价</s:a></td>
 	</tr>
 	</s:iterator>
  </tbody>
</table>
</div>