<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<table class="table table-bordered"
	id="accountable">
	<thead>
		<tr>
			<th><fmt:message key="domain.account.column.accountId"/></th>
			<th><fmt:message key="domain.account.column.userName"/></th>
			<th><fmt:message key="domain.account.column.phone"/></th>
			<th><fmt:message key="domain.account.column.email"/></th>
			<th><fmt:message key="domain.account.column.address"/></th>
			<th><fmt:message key="domain.account.column.role"/></th>
		</tr>
	</thead>
	<tbody>
	</tbody>
</table>
<jsp:include page="../../sections/modal.jsp" />
