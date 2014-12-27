<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<div class="pageContent">
	<form method="post" action="patientio/jsonResidentBegin" class="pageForm required-validate" onsubmit="return validateCallback(this, dialogAjaxDone);">
		<div class="pageFormContent" layoutH="56">
			<p>
				<label>病人ID：</label>
				<input name="nurseBegin.nursePat.patId" type="text" size="18" value="${residentApply.patId }" readonly="readonly"/>
			</p>
			<p>
				<label>姓名：</label>
				<input name="" type="text" size="18" value="${residentApply.nursePat.patName }" readonly="readonly"/>
			</p>
			<p>
				<label>性别：</label>
				<input name="" type="text" size="18" value="${residentApply.nursePat.patSex }" readonly="readonly"/>
			</p>
			<p>
				<label>身份证：</label>
				<input name="" type="text" size="18" value="${residentApply.nursePat.patCertificate }" readonly="readonly"/>
			</p>
			<p>
				<label>入住科室：</label>
				<input name="" type="text" size="18" value="${residentApply.officeDepartment.officName }" readonly="readonly"/>
				<input name="nurseBegin.officeDepartment.officId" type="hidden" value="${residentApply.officeDepartment.officId }" />
				<input name="nurseBegin.nurseWork.workId" type="hidden" value="${residentApply.workId }" />
			</p>
			<p>
				<label>床位：</label> 
				<select class="combox" name="nurseBegin.nurseBed.bedId">
					<c:forEach var="jBed" items="${residentApply.officeDepartment.nurseBeds }">
						<option value="${jBed.bedId }">${jBed.nurseRoom.roomInfo}${jBed.bedId }号床</option>
					</c:forEach>
				</select>
			</p>
			<p>
				<label>住院登记时间：</label>
				<input type="text" name="nurseBegin.beginTime" class="date" size="18" /><a class="inputDateButton" href="javascript:;">选择</a>
			</p>
			<p>
				<label>预交金：</label>
				<input name="nurseBegin.depoMoney" type="text" size="18" value="" />
			</p>
			<p>
				<label>余 额：</label>
				<input name="nurseBegin.leftMoney" type="text" size="18" value="" />
			</p>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
	</form>
</div>

