<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:if test="${not empty param.login_error}">
	<div class="alert alert-error"><fmt:message key="page.login.error"/></div>
</c:if>
<spring:url value="/resources/j_spring_security_check" var="form_url" />
<div class="content">
	<div class="row">
	<div class="span6 offset2">
		<div class="login-form">
			<h2><fmt:message key="page.login.form.title"/></h2>
			<form name="loginForm" action="${fn:escapeXml(form_url)}"
				method="POST">
				<fieldset>
					<div class="clearfix">
						<input id="j_username" name="j_username" type="text"
							placeholder="Email">
					</div>
					<div class="clearfix">
						<input id="j_password" name="j_password" type="password"
							placeholder="Password">
					</div>
					<button class="btn btn-primary" type="submit"><fmt:message key="page.login.form.signIn"/></button>
				</fieldset>
			</form>
		</div>
		</div>
		<div class="span4">
		<div>
		<legend><fmt:message key="page.login.demo.accounts.title"/>:</legend>
            <ul>
              <li>John DOE: <b><fmt:message key="page.login.demo.accounts.Email"/>:</b> admin@mail.com <b><fmt:message key="page.login.demo.accounts.password"/>:</b> admin</li>
              <li>Jane DOE: <b><fmt:message key="page.login.demo.accounts.Email"/>:</b> user@mail.com  <b><fmt:message key="page.login.demo.accounts.password"/>:</b> user</li>
            </ul>
          </div>
		</div>
	</div>
</div>