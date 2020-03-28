<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!-- 引入jstl核心标签库 --> 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    

 <table border="1" style="border-collapse: collapse;">
 	<tr>
 		<th>id</th>
 		<th>name</th>
 		<th>password</th>
 		<th>age</th>
 		<th>操作</th>
 	</tr>
 	
 	<c:forEach items="${users}" var="user">
 		<tr>
 			<td>${user.id}</td>
 			<td>${user.name}</td>
 			<td>${user.password}</td>
 			<td>${user.age}</td>
 			<td>
 				<a onclick="deleteUserById(${user.id});" href="javascript:void(0);">删除</a>&nbsp;&nbsp;
 			
 				<a href="#">修改</a>
 			</td>
 		</tr>
 	
 	</c:forEach>
 </table>
<script type="text/javascript">
	
	function deleteUserById(id){
		
		if(confirm("亲，您确定要删除此条数据么？")){
			window.location.href="${pageContext.request.contextPath}/user/delete.do?id="+id;
		}
		
	}
	
</script>
 