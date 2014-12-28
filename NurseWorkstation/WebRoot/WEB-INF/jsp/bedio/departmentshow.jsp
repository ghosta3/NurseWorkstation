<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="css/bedmanage.css" media="screen"
	type="text/css" />

<h2 class="contentTitle">床位管理 -> 床位管理</h2>

<div id="resultBox"></div>

<div
	style="float:left; display:block; margin:10px; overflow:auto; width:200px; height:750px; border:solid 1px #CCC; line-height:21px; background:#FFF;">
	<p>科室 -> 房间</p>
	<ul class="tree treeFolder collapse">
	
		<c:if test="${!empty officeDepartmentList }">
			<c:forEach items="${officeDepartmentList}" var="officeDepartment">
				<!-- <li><a href="tabsPage.html" target="navTab">科室1</a></li> -->
				<li><a href="" target="navTab">${officeDepartment.officName}</a> </li>
				<%-- <option value="${officeDepartment.officId }">${officeDepartment.officName}</option> --%>
			</c:forEach>
		</c:if>

	</ul>
</div>

<div
	style="float:left; display:block; margin:10px; overflow:auto; width:1400px; height:750px; border:solid 1px #CCC; line-height:21px; background:#FFF;">
	<div id="bed" href="#">
		<img src="imgs/bed1.png" href="#"><br /> <a>&nbsp;&nbsp;101</a><br />
		<a>未入住</a>
	</div>

	<div id="bed" href="#">
		<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;102</a><br /> <a>未入住</a>
	</div>

	<div id="bed" href="#">
		<img src="imgs/bed2.png"><br /> <a>&nbsp;&nbsp;103</a><br /> <a>黄大明</a>
	</div>

	<div id="bed" href="#">
		<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;104</a><br /> <a>未入住</a>
	</div>

	<div id="bed" href="#">
		<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;105</a><br /> <a>未入住</a>
	</div>
	<div id="bed" href="#">
		<img src="imgs/bed2.png"><br /> <a>&nbsp;&nbsp;106</a><br /> <a>李晓丽</a>
	</div>
	<div id="bed" href="#">
		<img src="imgs/bed2.png"><br /> <a>&nbsp;&nbsp;107</a><br /> <a>吴艳萍</a>
	</div>
	<div id="bed" href="#">
		<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;108</a><br /> <a>未入住</a>
	</div>
	
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