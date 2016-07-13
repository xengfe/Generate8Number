<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
	<link href="<c:url value="/resources/easyui.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/icon.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/demo.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/dialog.css"/>" rel="stylesheet">
	<script src="<c:url value="/resources/jquery.min.js"/>"></script>
	<script src="<c:url value="/resources/jquery.easyui.min.js"/>"></script>
	<script src="<c:url value="/resources/easyui-lang-zh_CN.js"/>"></script>
	
	<title>二维码创建</title>
<script type="text/javascript">
	function start() {
		var form = document.forms[0];
		form.action = "${pageContext.request.contextPath}/qrcodeopr/create";
		form.method = "post";
		form.submit();
	}

	function validateForm() {
		var username = document.forms["form"]["begin"].value;
		var password = document.forms["form"]["end"].value;
		if (username == null || username == "") {
			alert("数字不能为空");
			return false;
		} else if (password == null || password == "") {
			alert("数字不能为空");
			return false;
		}
		return true;
	}
</script>


</head>
<body>
	<div align="center">
		<div class="easyui-panel" style="width:40%;">
			<div style="padding:20px 20px 20px 20px">
				<form id="form" class="easyui-form" onSubmit="return validateForm()">
					<table cellpadding="5" align="center">
						<tr>
							<td>起始:</td>
							<td><input id="begin" name="begin" class="easyui-textbox"
								validType="text" name="begin" data-options="required:true"
								missingMessage="不能为空" invalidMessage="无效数字" tipPosition="right"></input></td>
						</tr>
						<tr>
							<td>终止:</td>
							<td><input id="end" name="end" class="easyui-textbox"
								validType="end" name="end" data-options="required:true"
								missingMessage="不能为空" invalidMessage="无效数字" tipPosition="right"></input></td>
						</tr>

					</table>


					<div style="text-align:center;padding:5px">
						<input type="submit" name="开始" value="开始" onclick="start()">
					</div>

				</form>

			</div>
		</div>
	</div>
	</body>
</html>
