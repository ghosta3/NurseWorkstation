<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="pageContent">
	<form method="post" action="nurseBed/update.action"
		class="pageForm required-validate"
		onsubmit="return validateCallback(this, dialogAjaxDone);">
		<div class="pageFormContent" layoutH="85">
			<div style="width:400px">
				<p>
					<label>病床号：</label> <input name="nurseBed.bedId" type="text" size="30" readonly="readonly" value="${nurseBed.bedId }"/>
				</p>
				<p>
					<label>科室号：</label> 
					<select name="nurseBed.officeDepartment.officId" class="required combox">
						<option value="">请选择</option>
						
						<c:if test="${!empty officeDepartmentList }">
							<c:forEach items="${officeDepartmentList}" var="officeDepartment">
								<c:if test="${officeDepartment.officId!=nurseBed.officeDepartment.officId}">
								<option value="${officeDepartment.officId }">${officeDepartment.officName}</option>
								</c:if>
								<c:if test="${officeDepartment.officId==nurseBed.officeDepartment.officId}">
								<option value="${officeDepartment.officId }" selected>${officeDepartment.officName}</option>
								</c:if>
							</c:forEach>
						</c:if>
					</select>
				</p>
				<p>
					<label>房间号：</label> 
					<select name="nurseBed.nurseRoom.roomId" class="required combox">
						<option value="">请选择</option>
						
						<c:if test="${!empty nurseRoomList }">
							<c:forEach items="${nurseRoomList}" var="nurseRoom">
								<c:if test="${nurseRoom.roomId!=nurseBed.nurseRoom.roomId}">
									<option value="${nurseRoom.roomId}">${nurseRoom.roomInfo}</option>
								</c:if>
								<c:if test="${nurseRoom.roomId==nurseBed.nurseRoom.roomId}">
									<option value="${nurseRoom.roomId}" selected>${nurseRoom.roomInfo}</option>
								</c:if>
							</c:forEach>
						</c:if>
					</select>
				</p>
				<p>
					<label>病床等级：</label> 
					<select name="nurseBed.hospitalBedlevel.levelId" class="required combox">
						<option value="">请选择</option>
						
						<c:if test="${!empty hospitalBedlevelList }">
							<c:forEach items="${hospitalBedlevelList}" var="hospitalBedlevel">
								
								<c:if test="${hospitalBedlevel.levelId!=nurseBed.hospitalBedlevel.levelId}">
								<option value="${hospitalBedlevel.levelId }">${hospitalBedlevel.levelId }</option>
								</c:if>
								<c:if test="${hospitalBedlevel.levelId==nurseBed.hospitalBedlevel.levelId}">
								<option value="${hospitalBedlevel.levelId }" selected>${hospitalBedlevel.levelId }</option>
								</c:if>
							</c:forEach>
						</c:if>
					</select>
				</p>
				
			</div>

		</div>
		 
		<div class="formBar">
			<ul>
				<!--<li><a class="buttonActive" href="javascript:;"><span>保存</span></a></li>-->
				<li><div class="buttonActive">
						<div class="buttonContent">
							<button type="submit">保存</button>
						</div>
					</div>
				</li>
				<li>
					<div class="button">
						<div class="buttonContent">
							<button type="button" class="close">取消</button>
						</div>
					</div></li>
			</ul>
		</div>
	</form>
</div>
