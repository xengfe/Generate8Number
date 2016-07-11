package com.yskj.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yskj.pojo.CrmDeviceCode;
import com.yskj.service.IGenerator8NumberService;
import com.yskj.util.Log;


@Controller
@RequestMapping("/generator")
public class Generator8NumberController {
	
	public static final int min = 80000000;
	public static final int max = 89999999;
	
	
	@Resource
	private IGenerator8NumberService<CrmDeviceCode> generator8NumberService;

	@ResponseBody
	@RequestMapping(value = "/start", method = { RequestMethod.GET })
	public  Map<String, Object> Start(String begin,String  end){
		Map<String, Object> map = new HashMap<String, Object>();
		Random random = new Random();
		for (int i = 0; i < 500000 ; i++) {
			String result =  create(min,max,random);
			Log.i("第"+ i + "个" + ",number " + result);
			if (result != null) {
				CrmDeviceCode  code = new CrmDeviceCode();
				code.setcId(UUID.randomUUID().toString());
				code.setcNumber(result);
				code.setcState(0);
				code.setcCreatetime(new Date());
				int opresult = generator8NumberService.insert(code);
				if (opresult!=0) {
					Log.i("第"+ i + "个" + ",number " + result + ",插入成功");
				}
			}
		}
		
		
		
		return map;
	}
	
	
	public synchronized  String create(int min, int max,Random random) {
		String result = null;
		if (min > max) {
			throw new IllegalArgumentException("min cannot exceed max.");
		} else {
			long range = max - (long) min + 1;
			long fraction = (long) (range * random.nextDouble());
			long randomNumber = fraction + (long) min;
			String tempCode = String.valueOf(randomNumber);
			CrmDeviceCode sqlCode = generator8NumberService.selectByCode(tempCode);
			if (sqlCode == null||!sqlCode.getcNumber().equals(tempCode)) {
				result = tempCode;
			}else if(sqlCode.getcNumber().equals(tempCode)){
				tempCode = null;
			}
			return result;
		}

	}
}
