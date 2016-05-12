<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="formsContent">
	<!-- Form container -->
	<form id="accountEditForm" class="form-horizontal" autocomplete="off" method="POST" action="">
	<legend><fmt:message key="domain.account.edit.legend"/></legend>
		<div class="control-group">
			<label class="control-label" for="accountId"><fmt:message key="domain.account.column.accountId"/><em>*</em></label>
			<div class="controls">
				<input type="text" id="accountId" name="accountId" readOnly="true" value="${crudObj.accountId}" maxlength="100" data-reset="${crudObj.accountId}">
				<span class="help-inline"></span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="userName"><fmt:message key="domain.account.column.userName"/><em>*</em></label>
			<div class="controls">
				<input type="text" id="userName" name="userName" value="${crudObj.userName}" maxlength="100" placeholder="User Name"  data-reset="${crudObj.userName}">
				<span class="help-inline"></span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="phone"><fmt:message key="domain.account.column.phone"/><em>*</em></label>
			<div class="controls">
				<input type="text" id="phone" name="phone" value="${crudObj.phone}" maxlength="100" placeholder="Phone" data-reset="${crudObj.phone}">
				<span class="help-inline"></span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="password"><fmt:message key="domain.account.column.password"/><em>*</em></label>
			<div class="controls">
				<input type="password" id="password" name="password" maxlength="50" value="${crudObj.password}"  placeholder="Password" data-reset="${crudObj.password}">
				<span class="help-inline"></span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="password_confirm"><fmt:message key="domain.account.column.passwordConfirmation"/><em>*</em></label>
			<div class="controls">
				<input type="password" id="password_confirm" name="password_confirm" maxlength="50" value="${crudObj.password}"  placeholder="Confirm Password" data-reset="">
				<span class="help-inline"></span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="email"><fmt:message key="domain.account.column.email"/><em>*</em></label>
			<div class="controls">
				<input type="text" id="email" name="email" value="${crudObj.email}" maxlength="100" data-reset="${crudObj.email}">
				<span class="help-inline"></span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="address"><fmt:message key="domain.account.column.address"/><em>*</em></label>
			<div class="controls">
				<input type="text" id="address" name="address" value="${crudObj.address}" maxlength="100" data-reset="${crudObj.address}">
				<span class="help-inline"></span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="role"><fmt:message key="domain.account.column.role"/><em>*</em></label>
			<div class="controls">
				<input type="radio" id="Admin" name="role"  readOnly="true" value="ROLE_ADMIN" <c:if test="${crudObj.role=='ROLE_ADMIN'}">checked</c:if>> Admin
				<input type="radio" id="User" name="role"  readOnly="true" value="USER" <c:if test="${crudObj.role=='USER'}">checked</c:if>> User
				<span class="help-inline"></span>
			</div>
		</div>
		<div class="form-actions">
			<button id="saveButton" type="submit" class="btn btn-primary"><fmt:message key="button.operation.save"/> <fmt:message key="domain.account"/></button>
			<a href="${pageContext.request.contextPath}/account/update/${crudObj.accountId}" id="resetButton" class="btn"><fmt:message key="button.operation.reset"/></a>
			<a href="${pageContext.request.contextPath}/account/" id="cancelButton" class="btn"><fmt:message key="button.operation.cancel"/></a>
		</div>
	</form>
</div>