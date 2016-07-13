package com.yskj.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

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
import com.yskj.util.Log;
@Controller
@RequestMapping("/qrcodeopr")
public class QrcodeOprController extends BaseController {
	
	public static Logger logger = LogManager
			.getLogger(QrCodeListController.class.getName());
	@Resource
	private IQrCodeListService<CrmDeviceCode> qrcodeListService;
	
	
	@RequestMapping(value = "", method = { RequestMethod.GET })
	public String toHome() {
		return "qrcode_create";
	}
	
	@ResponseBody
	@RequestMapping(value = "/create", method = { RequestMethod.POST })
	public Map<String, Object> Start(
			@RequestParam(value = "begin", required = true) String begin,
			@RequestParam(value = "end", required = true) String end) {
		Map<String, Object> map = new HashMap<String, Object>();
		Random random = new Random();
		Integer min = Integer.valueOf(begin);
		Integer max = Integer.valueOf(end);
		for (int i = 0; i < max - min; i++) {
			
			String result = create(min, max, random);
			Log.i("第" + i + "个" + ",number " + result);
			if (result != null) {
				CrmDeviceCode code = new CrmDeviceCode();
				code.setcId(UUID.randomUUID().toString());
				code.setcNumber(result);
				code.setcState(0);
				code.setcCreatetime(new Date());
				int opresult = qrcodeListService.insert(code);
				if (opresult != 0) {
					Log.i("第" + i + "个" + ",number " + result + ",插入成功");
				}
			}
		}

		return map;
	}

	private synchronized String create(int min, int max, Random random) {
		String result = null;
		if (min > max) {
			throw new IllegalArgumentException("min cannot exceed max.");
		} else {
			long range = max - (long) min + 1;
			long fraction = (long) (range * random.nextDouble());
			long randomNumber = fraction + (long) min;
			String tempCode = String.valueOf(randomNumber);
			CrmDeviceCode sqlCode = qrcodeListService.selectByCode(tempCode);
			if (sqlCode == null || !sqlCode.getcNumber().equals(tempCode)) {
				result = tempCode;
			} else if (sqlCode.getcNumber().equals(tempCode)) {
				tempCode = null;
			}
			return result;
		}

	}

}
