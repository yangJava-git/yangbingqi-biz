<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
 <link href="/resource/bootstrap/css/bootstrap.css" rel="stylesheet">  
 <link href="/css/index2.css" rel="stylesheet">  
 <script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script> 
 <script type="text/javascript" src="/resource/bootstrap/js/bootstrap.js"></script>
<title>Insert title here</title>
</head>
<body>
		<form action="" method="">
				按规模:<a href="list?capital=1">小型企业</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="list?capital=2">中型企业</a>
					 <a href="list?capital=3">大型企业</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="list">全部</a>&nbsp;&nbsp;&nbsp;&nbsp;
					 <br>
				按类型:<a href="list?type=1">有限公司</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="list?type=2">股份公司</a>&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="list?type=3">国企</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="list">全部</a>&nbsp;&nbsp;&nbsp;&nbsp;
				
		</form>
		<table>
				<tr>
						<td>公司名称</td>
						<td>营业执照</td>
						<td>法人代表</td>
						<td>注册资金</td>
						<td>公司类型</td>
						<td>成立时间</td>
						<td>操作</td>
				</tr>
				
				<c:forEach items="${list }" var="l">
					<tr>
						<td>${l.name }</td>
						<td>${l.regist_no }</td>	
						<td>${l.corporation }</td>	
						<td>${l.capital }</td>	
						<td>${l.tname }</td>	
						<td>${l.created }</td>	
						<td>
							<a>操作</a>
						</td>				
					</tr>
				</c:forEach>
				<tr>
						<td colspan="7">
						当前是${info.pageNum }/${info.pages }一共${info.total }条数据
						<a href="list?pageNum=1&type=${type }&capital=${capital}&dt2=${dt2}">首页</a>
						<a href="list?pageNum=${info.prePage }&type=${type }&capital=${capital}&dt2=${dt2}">上一页</a>
						<a href="list?pageNum=${info.nextPage }&type=${type }&capital=${capital}&dt2=${dt2}">下一页</a>
						<a href="list?pageNum=${info.pages }&type=${type }&capital=${capital}&dt2=${dt2}">尾页</a>
						</td>
				</tr>
		</table>
		
</body>
</html>