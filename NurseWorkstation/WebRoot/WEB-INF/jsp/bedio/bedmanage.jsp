<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- <form id="pagerForm" method="post" action="demo_page1.html">
	<input type="hidden" name="status" value="${param.status}">
	<input type="hidden" name="keywords" value="${param.keywords}" />
	<input type="hidden" name="pageNum" value="1" />
	<input type="hidden" name="numPerPage" value="${model.numPerPage}" />
	<input type="hidden" name="orderField" value="${param.orderField}" />
</form>

 --%>
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
					科室号：<input type="text" name="keyword" />
				</td>
				<td>
					房间号：<input type="text"/>
				</td>
				<td>
					病床号：<input type="text" />
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
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="nurseBed/showadd.action" target="dialog"><span>添加</span></a></li>
			<li><a class="delete" href="nurseBed/delete.action?nurseBed.bedId={nurseBed_id}" target="ajaxTodo" title="确定要删除吗?"><span>删除</span></a></li>
			<li><a class="edit" href="nurseBed/find.action?nurseBed.bedId={nurseBed_id}" target="dialog"><span>修改</span></a></li>
			<li class="line">line</li>
			<li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" targetType="navTab" title="实要导出这些记录吗?"><span>导出EXCEL</span></a></li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="40" align="center">序号</th>
				<th width="100" align="center">病床号</th>
				<th width="100" align="center">科室号</th>
				<th width="100" align="center">房间号</th>
				<th width="100" align="center">病床状态</th>
				<th width="40" align="center">病床等级</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${!empty nurseBedList }">
			<c:forEach items="${nurseBedList}" var="nurseBed" varStatus="status">
				<tr target="nurseBed_id" rel="${nurseBed.bedId}">
				 	<td>${status.index + 1}</td> 
				 	<td>${nurseBed.bedId }</td>
					<td>${nurseBed.officeDepartment.officName }</td>
					<td>${nurseBed.nurseRoom.roomInfo }</td>
					<c:if test="${nurseBed.bedState=='1'}">
						<td>已用</td>
					</c:if>
					<c:if test="${nurseBed.bedState==0}">
						<td>空床</td>
					</c:if>
					<td>${nurseBed.hospitalBedlevel.levelId }</td>
				</tr>				
			</c:forEach>
			</c:if>
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
