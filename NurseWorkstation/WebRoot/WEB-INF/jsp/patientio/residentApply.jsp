<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<form id="pagerForm" method="post" action="demo_page1.html">
	<input type="hidden" name="status" value="">
	<input type="hidden" name="keywords" value="" />
	<input type="hidden" name="pageNum" value="1" />
	<input type="hidden" name="numPerPage" value="" />
	<input type="hidden" name="orderField" value="" />
</form>

<div class="pageHeader">
	<form onsubmit="return navTabSearch(this);" action="demo_page1.html" method="post">
	<div class="searchBar">
		<!--<ul class="searchContent">
			<li>
				<label>我的客户：</label>
				<input type="text"/>
			</li>
			<li>
			<select class="combox" name="province">
				<option value="">所有省市</option>
				<option value="北京">北京</option>
				<option value="上海">上海</option>
				<option value="天津">天津</option>
				<option value="重庆">重庆</option>
				<option value="广东">广东</option>
			</select>
			</li>
		</ul>
		-->
		<table class="searchContent">
			<tr>
				<td>
					身份证号码：<input type="text" name="keyword" />
				</td>
			</tr>
		</table>
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">检索</button></div></div></li>
			</ul>
		</div>
	</div>
	</form>
</div>
<div class="pageContent">
	<table class="table" width="100%" layoutH="112">
		<thead>
			<tr>
				<th>患者ID</th>
				<th>患者姓名</th>
				<th>性别</th>
				<th>身份证号</th>
				<th>科室</th>
				<th>部门</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="residentApplyList" id="jApply">
			<tr target="sid_user" rel="10">
				<td><s:property value="#jApply.nursePat.patId"/> </td>
				<td><s:property value="#jApply.nursePat.patName"/> </td>
				<td><s:property value="#jApply.nursePat.patSex"/> </td>
				<td><s:property value="#jApply.nursePat.patCertificate"/> </td>
				<td><s:property value="#jApply.officeDepartment.officName"/> </td>
				<td><s:property value="#jApply.officeDepartment.deptName"/> </td>
				<s:if test='#jApply.resState=="0"'>
				<td>
					未住院
				</td>
				<td><a href="patientio/residentBegin?residentApply.patId=<s:property value='#jApply.nursePat.patId' />" width="800" target="dialog">登记住院</a></td>
				</s:if>
				<s:else>
				<td>
					已住院
				</td>
				<td>已住院不可登记</td>
				</s:else>
			</tr>
			</s:iterator>
		</tbody>
	</table>
	<div class="panelBar">
		<div class="pages">
			<span>显示</span>
			<select class="combox" name="numPerPage" onchange="navTabPageBreak({numPerPage:this.value})">
				<option value="20">20</option>
				<option value="50">50</option>
				<option value="100">100</option>
				<option value="200">200</option>
			</select>
			<span>条，共${totalCount}条</span>
		</div>
		
		<div class="pagination" targetType="navTab" totalCount="200" numPerPage="20" pageNumShown="10" currentPage="1"></div>

	</div>
</div>


