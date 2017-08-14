<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>完了画面</title>
</head>
<body>
	<h1>アップロード完了</h1>

	<p><c:out value="${fileName}のアップロードが完了しました。" /></p>

	<input type="button" onclick="location.href='index.jsp'"value="メニュー画面へ戻る">
</body>
</html>