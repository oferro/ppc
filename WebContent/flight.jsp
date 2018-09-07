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
					<td><c:out value="${t.id}" /></td>
					<td><c:out value="${t.ppcId}" /></td>
					<td><c:out value="${t.userId}" /></td>
					<td><c:out value="${t.date}" /></td>
					<td><c:out value="${t.toHour}" /></td>
					<td><c:out value="${t.lndHour}" /></td>
					<td><c:out value="${t.airField}" /></td>
					<td><c:out value="${t.fltRoute}" /></td>
					<td><c:out value="${t.last_update}" /></td>
					<td>
						<a href="FlightController?myaction=delete&id=<c:out  value="${t.id}"/>">מחיקה</a>
						<a href="FlightController?myaction=update&id=<c:out  value="${t.id}"/>">עדכון</a>
					</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
