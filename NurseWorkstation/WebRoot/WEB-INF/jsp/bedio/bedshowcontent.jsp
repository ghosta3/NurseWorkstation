<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div
	style="margin:20px; width:1400px; height:750px; border:solid 1px #CCC; line-height:21px;">

	<c:if test="${!empty nurseBedList }">
		<c:forEach items="${nurseBedList}" var="nurseBed">
			<c:forEach items="${nurseBeginList}" var="nurseBegin">
				<c:if test="${nurseBegin.nurseBed.bedId==nurseBed.bedId}">
					<div id="bed">
						<img src="imgs/bed2.png"><br /> <a>&nbsp;&nbsp;${nurseBed.bedId}</a><br />
						<!-- <a>111</a> --> <a>${nurseBegin.nursePat.patName} </a>
					</div>
				</c:if>
			</c:forEach>
		</c:forEach>

		<c:forEach items="${nurseBedList}" var="nurseBed">
			<c:if test="${nurseBed.bedState==0}">
				<div id="bed">
					<img src="imgs/bed1.png"><br /> <a>&nbsp;&nbsp;${nurseBed.bedId}</a><br />
					<a>未入住</a>
					<%-- <a>${nurseBegin.nursePat.patName}< /a>--%>
				</div>
			</c:if>
		</c:forEach>
	</c:if>


</div>