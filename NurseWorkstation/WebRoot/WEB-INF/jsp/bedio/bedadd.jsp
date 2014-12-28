<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="pageContent">
	<form method="post" action="nurseBed/add.action"
		class="pageForm required-validate"
		onsubmit="return validateCallback(this, dialogAjaxDone);">
		<div class="pageFormContent" layoutH="85">
			<div style="width:400px">
				<p>
					<label>病床号：</label> <input name="nurseBed.bedId" type="text" size="30" />
				</p>
				<p>
					<label>科室号：</label> 
					<select name="nurseBed.officeDepartment.officId" class="required combox">
						<option value="" selected>请选择</option>
						
						<c:if test="${!empty officeDepartmentList }">
							<c:forEach items="${officeDepartmentList}" var="officeDepartment">
								<option value="${officeDepartment.officId }">${officeDepartment.officName}</option>
							</c:forEach>
						</c:if>
					</select>
				</p>
				<p>
					<label>房间号：</label> 
					<select name="nurseBed.nurseRoom.roomId" class="required combox">
						<option value="" selected>请选择</option>
						
						<c:if test="${!empty nurseRoomList }">
							<c:forEach items="${nurseRoomList}" var="nurseRoom">
								<option value="${nurseRoom.roomId }">${nurseRoom.roomInfo }</option>
							</c:forEach>
						</c:if>
					</select>
				</p>
				<p>
					<label>病床等级：</label> 
					<select name="nurseBed.hospitalBedlevel.levelId" class="required combox">
						<option value="" selected>请选择</option>
						
						<c:if test="${!empty hospitalBedlevelList }">
							<c:forEach items="${hospitalBedlevelList}" var="hospitalBedlevel">
								<option value="${hospitalBedlevel.levelId }">${hospitalBedlevel.levelId }</option>
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
