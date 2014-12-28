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
		<li><a href="tabsPage.html" target="navTab">科室1</a>
			<ul>
				<li target="selectedObjId" rel="1"><a href="main.html"
					target="navTab" rel="main">我的主页</a>
				</li>
				<li target="selectedObjId" rel="2"><a href="newPage1.html"
					target="navTab" rel="page1">页面一</a>
				</li>
				<li><a href="newPage2.html" target="navTab" rel="page1">替换页面一</a>
				</li>
				<li><a href="newPage2.html" target="navTab" rel="page2">页面二</a>
				</li>
				<li><a href="newPage3.html" target="navTab" rel="page3"
					title="页面三（自定义标签名）">页面三</a>
				</li>
			</ul></li>
		<li><a href="tabsPage.html" target="navTab">科室2</a>
			<ul>
				<li target="selectedObjId" rel="1"><a href="main.html"
					target="navTab" rel="main">我的主页</a>
				</li>
				<li target="selectedObjId" rel="2"><a href="newPage1.html"
					target="navTab" rel="page1">页面一</a>
				</li>
				<li><a href="newPage2.html" target="navTab" rel="page1">替换页面一</a>
				</li>
				<li><a href="newPage2.html" target="navTab" rel="page2">页面二</a>
				</li>
				<li><a href="newPage3.html" target="navTab" rel="page3"
					title="页面三（自定义标签名）">页面三</a>
				</li>
			</ul></li>
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
		<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;104</a><br /> <a>未入住</a>
	</div>
	<div id="bed" href="#">
		<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;104</a><br /> <a>未入住</a>
	</div>
	<div id="bed">
		<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;104</a><br /> <a>未入住</a>
	</div>
	<div id="bed">
		<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;104</a><br /> <a>未入住</a>
	</div>
	<div id="bed">
		<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;104</a><br /> <a>未入住</a>
	</div>
	<div id="bed">
		<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;104</a><br /> <a>未入住</a>
	</div>
	<div id="bed">
		<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;104</a><br /> <a>未入住</a>
	</div>
	<div id="bed">
		<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;104</a><br /> <a>未入住</a>
	</div>
	<div id="bed">
		<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;104</a><br /> <a>未入住</a>
	</div>
	<div id="bed">
		<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;104</a><br /> <a>未入住</a>
	</div>
	<div id="bed">
		<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;104</a><br /> <a>未入住</a>
	</div>
	<div id="bed">
		<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;104</a><br /> <a>未入住</a>
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