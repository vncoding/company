<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div id="formsContent">
	<!-- Form container -->
	<form id="accountForm" class="form-horizontal" autocomplete="off" method="POST" action="">
	<legend><fmt:message key="domain.account.create.legend"/></legend>
		<div class="control-group">
			<label class="control-label" for="userName"><fmt:message key="domain.account.column.userName"/><em>*</em></label>
			<div class="controls">
				<input type="text" id="userName" name="userName" value="" maxlength="100" placeholder="UserName">
				<span class="help-inline"></span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="password"><fmt:message key="domain.account.column.password"/><em>*</em></label>
			<div class="controls">
				<input type="password" id="password" name="password" maxlength="50" value=""  placeholder="Password">
				<span class="help-inline"></span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="password_confirm"><fmt:message key="domain.account.column.passwordConfirmation"/><em>*</em></label>
			<div class="controls">
				<input type="password" id="password_confirm" name="password_confirm" maxlength="50" value=""  placeholder="Confirm Password">
				<span class="help-inline"></span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="phone"><fmt:message key="domain.account.column.phone"/><em>*</em></label>
			<div class="controls">
				<input type="text" id="phone" name="phone" value="" maxlength="100" placeholder="Phone">
				<span class="help-inline"></span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="email"><fmt:message key="domain.account.column.email"/><em>*</em></label>
			<div class="controls">
				<input type="text" id="email" name="email" placeholder="Email" value="" maxlength="100">
				<span class="help-inline"></span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="address"><fmt:message key="domain.account.column.address"/><em>*</em></label>
			<div class="controls">
				<input type="text" id="address" name="address" placeholder="Address" value="" maxlength="100">
				<span class="help-inline"></span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="role"><fmt:message key="domain.account.column.role"/><em>*</em></label>
			<div class="controls">
				<input type="radio" id="Admin" name="role" value="ROLE_ADMIN" > Admin
				<input type="radio" id="User" name="role" value="USER" > User
				<span class="help-inline"></span>
			</div>
		</div>
		<div class="form-actions">
			<button id="saveButton" type="submit" class="btn btn-primary"><fmt:message key="domain.operation.create"/> <fmt:message key="domain.account"/></button>
			<button id="cancelButton" type="button" class="btn"><fmt:message key="button.operation.cancel"/></button>
		</div>
	</form>
</div>