<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html dir="rtl">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Flights Page</title>
</head>
<body>
	<H1>רשימת טיסות</H1>
	<h3>
		<a href="FlightController?myaction=add">חדש</a>
	</h3>
	<table>
		<thead>
			<tr>
				<TH>ID</TH>
				<TH>מספר ממג</TH>
				<TH>מספר משתמש</TH>
				<TH>תאריך טיסה</TH>
				<TH>שעת המראה</TH>
				<TH>שעת נחיתה</TH>
				<TH>שם מנחת</TH>
				<TH>נתיב טיסה</TH>
				<TH>עדכון אחרון</TH>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${tisot}" var="t">
				<tr>
					<td><c:out value="${t.fID}" /></td>
					<td><c:out value="${t.flPPC}" /></td>
					<td><c:out value="${t.fUser}" /></td>
					<td><c:out value="${t.fDate}" /></td>
					<td><c:out value="${t.fToHour}" /></td>
					<td><c:out value="${t.fLndHour}" /></td>
					<td><c:out value="${t.fAirField}" /></td>
					<td><c:out value="${t.fFltRoute}" /></td>
					<td><c:out value="${t.fTimeStemp}" /></td>
					<td>
						<a href="FlightController?myaction=delete&id=<c:out  value="${t.fID}"/>">מחיקה</a>
						<a href="FlightController?myaction=update&id=<c:out  value="${t.fID}"/>">עדכון</a>
					</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
