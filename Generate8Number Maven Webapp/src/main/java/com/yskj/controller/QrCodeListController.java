package com.yskj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yskj.pojo.CrmDeviceCode;
import com.yskj.service.IQrCodeListService;

@Controller
@RequestMapping("/qrcodelist")
public class QrCodeListController extends BaseController {

	
	public static Logger logger = LogManager
			.getLogger(QrCodeListController.class.getName());
	@Resource
	private IQrCodeListService<CrmDeviceCode> qrcodeListService;

	@RequestMapping(value = "", method = { RequestMethod.GET })
	public String toHome() {
		return "qrcodelist";
	}

	@ResponseBody
	@RequestMapping(value = "/queryByPage", method = { RequestMethod.POST })
	public Map<String, Object> queryCodeByPageSize(
			@RequestParam(value = "rows", required = true) String rows,
			@RequestParam(value = "page", required = true) String page) {
		Map<String, Object> map = new HashMap<String, Object>();
		// 当前页
		int intPage = Integer.parseInt((page == null || page == "0") ? "1"
				: page);
		// 每页显示条数
		int number = Integer.parseInt((rows == null || rows == "0") ? "10"
				: rows);
		int start = (intPage-1)*number;
		int total = qrcodeListService.selectAll().size();
		// 每页的开始记录 第一页为1 第二页为number +1
		map.put(TOTAL, total);
		List<CrmDeviceCode> codeList = qrcodeListService.queryTByPageSize(start, number);
		map.put(ROWS, codeList);
		return map;
	}

	

	
	@ResponseBody//加了这行返回json数据
	@RequestMapping(value = "/add",method = {RequestMethod.POST})
	public Map<String,Object> addCode(CrmDeviceCode code){
		Map<String,Object> map = new HashMap<String,Object>();
		CrmDeviceCode tempCode = qrcodeListService.selectByCode(code.getcNumber());
		if(tempCode==null){
			qrcodeListService.insert(code);
			map.put(RESULT, RESULT_OK);
			map.put(MSG, "保存成功");
		}else{
			map.put(RESULT, RESULT_ERROR);
			map.put(MSG, "已经存在！");
		}

		return map;
	}
	
	@ResponseBody//加了这行返回json数据
	@RequestMapping(value = "/edit",method = {RequestMethod.POST})
	public Map<String,Object> updateCode(CrmDeviceCode code){
		Map<String,Object> map = new HashMap<String,Object>();
		CrmDeviceCode tempCode = qrcodeListService.selectByPrimaryKey(code.getcId());
		if(tempCode==null){
			map.put(RESULT, RESULT_ERROR);
			map.put(MSG, "不存在！");
		}else{
			qrcodeListService.updateByPrimaryKey(code);
			map.put(RESULT, RESULT_OK);
			map.put(MSG, "更新成功");
		}
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/delete",method = {RequestMethod.POST})
	public Map<String,Object> deleteCode(String cId){
		Map<String,Object> map = new HashMap<String,Object>();
		CrmDeviceCode wm = this.qrcodeListService.selectByPrimaryKey(cId);
		if(wm==null){
			map.put(RESULT, RESULT_ERROR);
			map.put(MSG, "删除失败，不存在");
		}else{
			qrcodeListService.deleteByPrimaryKey(cId);
			map.put(RESULT, RESULT_OK);
			map.put(MSG, "删除成功");
		}
		return map;
	}
}
