<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<div class="pageHeader">
<form method="post" action="">
  <p>科室名称：
    <label for="textfield"></label>
  <input type="text" name="textfield" id="textfield" />
  病人姓名：
  <label for="textfield2"></label>
  <input type="text" name="textfield2" id="textfield2" />
  </p>
  <p>主治医生：
    <label for="textfield3"></label>
    <input type="text" name="textfield3" id="textfield3" />
  病房号：&nbsp;&nbsp;
  <label for="textfield4"></label>
  <input type="text" name="textfield4" id="textfield4" />
  <input type="submit" name="button" id="button" value="查询" />
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
