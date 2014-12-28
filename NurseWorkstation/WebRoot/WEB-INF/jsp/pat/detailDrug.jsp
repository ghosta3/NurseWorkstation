<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<table class="table" width="30%">
<thead>
  <tr>
    <th>药物名称</th>
    <th>用量</th>
    <th>价格</th>
  </tr>
  </thead>
  <tbody>
  		<tr>
  			<td>${drug.drugName}</td>
  			<td>1</td>
  			<td>${drug.drugPrice}</td>
  			
  		</tr>
  </tbody>
</table>