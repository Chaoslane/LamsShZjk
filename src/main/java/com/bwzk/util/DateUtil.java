package com.bwzk.util;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.FastDateFormat;

public class DateUtil {

	/**
	 * 当前日期加上几天
	 */
	public static Date addDate(Date d, long day) {
		long time = d.getTime();
		day = day * 24 * 60 * 60 * 1000;
		time += day;
		return new Date(time);
	}

	/**
	 * 通过日期格式得到时间
	 */
	public static String toDateStrHHMM(Date date) {
		if (date == null){
			return null;
		}else{
			return getDateFmt("HH:mm").format(date);
		}
	}

	/**
	 * 得到开始结束时间以 - 分割
	 */
	public static String toDateStartToEndStr(Date dateS, Date dateE) {
		if (dateS == null || dateE == null){
			return null;
		}else{
			String str1 = getDateTimeFormat().format(dateS);
			String str2 = getDateTimeFormat().format(dateE);
			return str1 + "-" + str2;
		}
	}

	public static long DateDiffMin(String sdate1, String sdate2, String fmt,
			TimeZone tz) {
		if (fmt == null)
			fmt = DEFAULT_DATE_FORMAT;
		return DateDiff(sdate1, sdate2, fmt, tz) / 60000;

	}

	public static long DateDiff(String sdate1, String sdate2, String fmt,
			TimeZone tz) {
		Date date1 = strToDate(sdate1);
		Date date2 = strToDate(sdate2);

		Calendar cal1 = null;
		Calendar cal2 = null;

		if (tz == null) {
			cal1 = Calendar.getInstance();
			cal2 = Calendar.getInstance();
		} else {
			cal1 = Calendar.getInstance(tz);
			cal2 = Calendar.getInstance(tz);
		}

		// different date might have different offset
		cal1.setTime(date1);
		long ldate1 = date1.getTime() + cal1.get(Calendar.ZONE_OFFSET)
				+ cal1.get(Calendar.DST_OFFSET);

		cal2.setTime(date2);
		long ldate2 = date2.getTime() + cal2.get(Calendar.ZONE_OFFSET)
				+ cal2.get(Calendar.DST_OFFSET);

		// Use integer calculation, truncate the decimals
		int hr1 = (int) (ldate1 / 3600000); // 60*60*1000
		int hr2 = (int) (ldate2 / 3600000);

		int days1 = (int) hr1 / 24;
		int days2 = (int) hr2 / 24;

		long secsDiff = ldate2 - ldate1;

		int dateDiff = days2 - days1;
		int weekOffset = (cal2.get(Calendar.DAY_OF_WEEK) - cal1
				.get(Calendar.DAY_OF_WEEK)) < 0 ? 1 : 0;
		int weekDiff = dateDiff / 7 + weekOffset;
		int yearDiff = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR);
		int monthDiff = yearDiff * 12 + cal2.get(Calendar.MONTH)
				- cal1.get(Calendar.MONTH);
		return secsDiff;
	}

	/**
	 * 字符串转换成日期 yyyy-MM-dd
	 */
	public static Date strToDate(String date) {
		return strToDate(date, DEFAULT_DATE_FORMAT);
	}
	/**
	 * 将date返回 yyyy-MM-dd str
	 */
	public static String dateToStr(Date date) {
		if(date == null){
			return "";
		}else{
			return FastDateFormat.getInstance(DEFAULT_DATE_FORMAT).format(date);
		}
	}
	/**
	 * 字符串转换成日期 自定义格式
	 */
	public static Date strToDate(String dateStr , String format) {
		Date aa = null;
		try {
			if (StringUtils.isNotEmpty(dateStr)){
				aa = new SimpleDateFormat(format).parse(dateStr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return aa;
	}

	/**
	 * 获取当前日期N天前的日期
	 */
	public static String getNextDay(String nowdate, String delay) {
		try {
			String mdate = "";
			Date d = new Date();
			long myTime = (d.getTime() / 1000) + Integer.parseInt(delay) * 24
					* 60 * 60;
			d.setTime(myTime * 1000);
			mdate = getDateFormat().format(d);
			return mdate;
		} catch (Exception e) {
			return "";
		}
	}

	// ----------------lywww-----star-----------------------
	/**
	 * 根据自定义个日期格式得到时间字符串
	 */
	public static String getCurrentDateStr(String format) {
		Format df = getDateFmt(format);
		return df.format(new Date());
	}

	/**
	 * 根据自定义个日期格式得到时间Format
	 */
	public static Format getDateFmt(String format) {
		Format df = null;
		if (StringUtils.isEmpty(format)) {
			df = FastDateFormat.getInstance(DEFAULT_TIME_FORMAT);
		} else {
			df = FastDateFormat.getInstance(format);
		}
		return df;
	}

	/**
	 * 返回格式 yyyy-MM-dd 日期 string
	 */
	public static String getCurrentDateStr() {
		return getCurrentDateStr(DEFAULT_DATE_FORMAT);
	}

	/**
	 * 返回格式 yyyy-MM-dd hh:mm:ss 时间 string
	 */
	public static String getCurrentTimeStr() {
		return getCurrentDateStr(DEFAULT_TIME_FORMAT);
	}

	/**
	 * 返回格式 yyyy-MM-dd 日期 Format
	 */
	public static Format getDateFormat() {
		return getDateFmt(DEFAULT_DATE_FORMAT);
	}

	/**
	 * 返回格式 yyyy-MM-dd hh:mm:ss 时间 Format
	 */
	public static Format getDateTimeFormat() {
		return getDateFmt(DEFAULT_TIME_FORMAT);
	}
	
	public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
	public static final String DEFAULT_TIME_FORMAT = "yyyy-MM-dd hh:mm:ss";
	// ----------------lywww-----end-----------------------
}
