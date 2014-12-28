<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" href="css/bedmanage.css" media="screen"
	type="text/css" />

<h2 class="contentTitle">床位管理 -> 床位管理</h2>

<div id="resultBox"></div>

<div
	style="float:left; display:block; margin:10px 10px 10px 30px; overflow:auto; width:200px; height:750px; border:solid 1px #CCC; line-height:21px; background:#FFF;">
	<p>科室 -> 房间</p>
	<ul class="tree treeFolder collapse">

		<c:if test="${!empty officeDepartmentList }">
			<c:forEach items="${officeDepartmentList}" var="officeDepartment">
				<li><a>${officeDepartment.officName}</a>
					<ul>
						<c:forEach items="${officeDepartment.nurseRooms}" var="nurseRooms">
							<li><a href="showbed/showbed.action?roomId=${nurseRooms.roomId}" target="ajax" rel="showbeds">${nurseRooms.roomInfo}</a></li>
						</c:forEach>
					</ul></li>
			</c:forEach>
		</c:if>

	</ul>
</div>

<div id="showbeds" class="unitBox" style="margin-left:240px;">
					<!--#include virtual="list1.html" -->
</div>
<script type="text/javascript">
	function kkk() {
		var json = arguments[0], result = "";
		//	alert(json.checked);

		$(json.items).each(
				function(i) {
					result += "<p>name:" + this.name + " value:" + this.value
							+ " text: " + this.text + "</p>";
				});
		$("#resultBox").html(result);

	}
</script>