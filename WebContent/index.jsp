<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UL/DL test</title>
</head>
<body>
	<h1>UL/DL</h1>

	<form method="get" action="/FileDLUL/MainServlet">
		<input type="hidden" name="format" value="up" />
		<input type="submit" value="ファイルをアップロード"/>
	</form>

	<br />

	<form method="get" action="/FileDLUL/MainServlet">
		<input type="hidden" name="format" value="down" />
		<input type="submit" value="ファイルをダウンロード"/>
	</form>
</body>
</html>