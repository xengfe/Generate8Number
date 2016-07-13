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
	
	<title>二维码列表</title>
	<script type="text/javascript">
		$(function() {
			$('#list_qrcode').datagrid({
				title : '应用系统列表',
				iconCls : 'icon-edit',//图标 
				width : 'auto',
				height : 'auto',
				nowrap : true,
				striped : true,
				border : true,
				collapsible : false,//是否可折叠的 
				fit : true,//自动大小 
				sortName: 'cNumber', 
				sortOrder: 'desc', 
				remoteSort : false,
				idField : 'fldId',
				singleSelect : true,//是否单选 
				pagination : true,//分页控件 
				rownumbers : true,//行号 
				url : '${pageContext.request.contextPath}/qrcodelist/queryByPage',
				method : 'POST',
				frozenColumns : [ [ {
					field : 'ck',
					checkbox : true
				} ] ],
	
			});
	
			//设置分页控件 
			var p = $('#list_qrcode').datagrid('getPager');
			$(p).pagination({
				pageSize : 10,//每页显示的记录条数，默认为15 
				pageList : [10,20,30],//可以设置每页记录条数的列表 
				beforePageText : '第',//页数文本框前显示的汉字 
				afterPageText : '页    共 {pages} 页',
				displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录',
			/*onBeforeRefresh:function(){
			    $(this).pagination('loading');
			    alert('before refresh');
			    $(this).pagination('loaded');
			}*/
			});
		});
	
		var url;
		var type;
		function add() {
			$("#dlg").dialog("open").dialog('setTitle', '增加');
			$("#fm").form("clear");
			url = "${pageContext.request.contextPath}/qrcodelist/add";
			document.getElementById("hidtype").value = "submit";
		}
		function edit() {
			var row = $("#list_qrcode").datagrid("getSelected");
			if (row) {
				$("#dlg").dialog("open").dialog('setTitle', '编辑');
				$("#fm").form("load", row);
				url = "${pageContext.request.contextPath}/qrcodelist/edit?cId="
						+ row.cId;
				document.getElementById("hidtype").value = "submit";
			}
		}
		function save() {
			$("#fm").form("submit", {
				url : url,
				onsubmit : function() {
					return $(this).form("validate");
				},
				success : function(result) {
					var obj = eval("(" + result + ")");//转换后的JSON对象
					if (obj.result == "1") {
						$.messager.alert("提示信息", obj.msg);
						$("#dlg").dialog("close");
						$("#list_qrcode").datagrid("load");
					} else {
						$.messager.alert("提示信息", obj.msg);
					}
				}
			});
		}
		function dele() {
			var row = $('#list_qrcode').datagrid('getSelected');
			if (row) {
				$.messager.confirm('确认', '你确定要删除?', function(r) {
					if (r) {
						$.post(
							'${pageContext.request.contextPath}/qrcodelist/delete',
							{cId : row.cId},
							function(data) {
								if (data.result == "1") {
									$('#list_qrcode').datagrid('reload');
										$.messager.alert("提示信息", data.msg); 
									} else {
									$.messager.alert("提示信息",data.msg);
									}
							},
							'json'
						);
					}
				});
			}
		}
	</script>
	
</head>
<body>
	<table id="list_qrcode" class="easyui-datagrid" cellspacing="5"
		toolbar="#toolbar" cellpadding="5" border="fasle">
		<thead>
			<tr>
				<th field="cId" width="400">编码</th>
				<th field="cNumber" width="200">二维码</th>
				<th field="cCreatetime" width="250">日期</th>
				<th field="cState" width="300">是否使用</th>
			</tr>
		</thead>

	</table>
	<div id="toolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconcls="icon-add" onclick="add()" plain="true">添加</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconcls="icon-edit" onclick="edit()" plain="true">修改</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconcls="icon-remove" onclick="dele()" plain="true">删除</a>
	</div>

	<div id="dlg" class="easyui-dialog"
		style="width: 400px; height:auto; padding: 10px 20px;" align="center" closed="true"
		buttons="#dlg-buttons">
		<div class="ftitle">信息编辑</div>
		<form id="fm" method="post">
			
			<div class="fitem">
				<label>编码 </label><input name="cId"
					class="easyui-validatebox" required="true" />
			</div>
			<div class="fitem">
				<label>二维码</label><input name="cNumber"
					class="easyui-validatebox" required="true" />
			</div>
			<div class="fitem">
				<label>日期</label><input name="cCreatetime" class="easyui-vlidatebox"
					required="true" />
			</div>
			<div class="fitem">
				<label>是否使用</label><input name="cState" class="easyui-vlidatebox"
					required="true" />
			</div>
			<div class="fitem">
				<input type="hidden" name="action" id="hidtype" />
			</div>
			<div class="fitem">
				<input type="hidden" name="ID" id="Nameid" />
			</div>
		</form>
		<div id="dlg-buttons">
			<a href="javascript:void(0)" class="easyui-linkbutton"
				onclick="save()" iconcls="icon-save">保存</a> <a
				href="javascript:void(0)" class="easyui-linkbutton"
				onclick="javascript:$('#dlg').dialog('close')" iconcls="icon-cancel">取消</a>
		</div>
	</div>
</body>
</html>
