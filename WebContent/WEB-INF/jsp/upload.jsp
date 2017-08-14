<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>アップロード</h1>

	<c:if test="${isError}">
		<p>ファイルを選択してください。</p>
	</c:if>

	<form method="POST" enctype="multipart/form-data" action="/FileDLUL/UploadServlet">
		<input type="file" name="file" /><br />
		<input type="submit" value="アップロード" />
	</form>

</body>
</html>