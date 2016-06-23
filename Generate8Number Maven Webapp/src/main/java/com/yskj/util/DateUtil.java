package com.yskj.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtil {
	
	public static Date formate(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:MM:ss", Locale.CHINA);
		
		return date;
	}

}
