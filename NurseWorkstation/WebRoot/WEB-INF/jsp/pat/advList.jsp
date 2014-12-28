<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<div class="pageHeader">
	<form onsubmit="return navTabSearch(this);" action="pat/checkAdv" method="post">
	<div class="searchBar">
	<table class="searchContent">
			<tr>
				<td>
					  病人姓名：<input type="text" name="patName"/>
				</td>
				<td>
					主治医生：<input type="text" name="workName"/>
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
			<li><a class="add" href="demo_page4.html" target="navTab"><span>添加</span></a></li>
			<li><a class="delete" href="demo/common/ajaxDone.html?uid={sid_user}" target="ajaxTodo" title="确定要删除吗?"><span>删除</span></a></li>
			<li><a class="edit" href="demo_page4.html?uid={sid_user}" target="navTab"><span>修改</span></a></li>
			<li class="line">line</li>
			<li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" targetType="navTab" title="实要导出这些记录吗?"><span>导出EXCEL</span></a></li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="62" >医嘱序号</th>
			    <th width="62" >病人姓名</th>
			    <th width="62" >主治医生</th>
			    <th width="93" >医嘱开始日期</th>
				<th width="93" >医嘱结束日期</th>
			    <th width="62" >医嘱详细</th>
			    <!-- <th width="88" >医嘱执行情况</th> -->
			</tr>
		</thead>
		<tbody>
			<s:iterator value="list" id="adv">
  		<tr>
  			<td><s:property value="#adv.advId" /></td>
  			<td><s:property value="#adv.nursePat.patName" /></td>
  			<td><s:property value="#adv.nurseWork.workName" /></td>
  			<td><s:date format='yyyy-MM-dd' name='#adv.advBigTime' /></td>
  			<td><s:date format='yyyy-MM-dd' name='#adv.advEndTime' /></td>
  			<td><s:a target="dialog" href="pat/checkAdving?advId=%{#adv.advId}">查看详情</s:a></td>
  			<!-- <td><s:a href="pat/executeAdv?advId">未执行医嘱</s:a></td> -->
  		</tr>
  	</s:iterator>
		</tbody>
	</table>
</div>

<!-- 





<div class="pageHeader">
<form method="post" action="">
  <p>
  病人姓名：<input type="text" name="patName"/>
  </p>
  <p>主治医生：<input type="text" name="workName"/>
  <input type="submit" name="button" value="查询" />
  </p>
</form>

<br/>
<br/>
<br/>
</div>
<hr/>
<br/>
<table class="table" width="784" height="124" border="1" cellpadding="0" cellspacing="0">
<thead>
  <tr>
    <th width="62" >医嘱序号</th>
    <th width="62" >病人姓名</th>
    <th width="62" >科室名称</th>
    <th width="62" >主治医生</th>
    <th width="47" >病房号</th>
    <th width="93" >医嘱开始日期</th>
	<th width="93" >医嘱结束日期</th>
    <th width="62" >医嘱详细</th>
    <th width="88" >医嘱执行情况</th>
  </tr>
  </thead>
  <tbody>
  <tr>
    <td align="center">001</td>
    <td align="center">张三</td>
    <td align="center">骨科</td>
    <td align="center">李四</td>
    <td align="center">101</td>
    <td align="center">2014-11-01</td>
	<td align="center">2014-11-01</td>
    <td align="center"><a href="">查看详细</a></td>
    <td align="center">已执行</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
	<td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
	<td>&nbsp;</td>
  </tr>
  </tbody>
</table>
<p>&nbsp;</p>
<hr/>
<p>&nbsp;</p>
<p>医嘱详细: </p>
<p><br/>
医嘱序号：001 &nbsp;&nbsp;科室名称：骨科&nbsp;&nbsp;主治医生：李四</p>
<p>病人姓名：张三 &nbsp;&nbsp;病房号：101</p>
<hr/><br/>
<table class="table" width="546" border="1" cellspacing="0" cellpadding="0">
<thead>
  <tr>
    <th bgcolor="#f5f5f5" scope="col">医嘱执行时间</th>
    <th bgcolor="#f5f5f5" scope="col">医嘱内容</th>
    <th bgcolor="#f5f5f5" scope="col">值班护士</th>
    <th bgcolor="#f5f5f5" scope="col">医嘱状态</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td>2014-11-01 12：03</td>
    <td>注射抗菌素</td>
    <td>王五</td>
    <td>已执行</td>
  </tr>
  <tr>
    <td>2014-11-01 18：11</td>
    <td>服用安乃近</td>
    <td>王五</td>
    <td>已执行</td>
  </tr>
 </tbody>
</table>
 -->