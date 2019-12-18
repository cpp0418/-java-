package com.api;

import java.awt.Insets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Date_test {

	public static void main(String[] args) throws ParseException {
		System.out.println(System.currentTimeMillis());
		Date date1=new Date();
		Date date2=new Date(System.currentTimeMillis());
		Date date3=new Date(System.currentTimeMillis()+1000);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		SimpleDateFormat sdf=new SimpleDateFormat("Gyyyy年MM月dd日  hh:mm:ss E");
		System.out.println(sdf.format(date1));
		Calendar rl=Calendar.getInstance();
		int year=rl.get(Calendar.YEAR);
		int month=rl.get(Calendar.MONTH)+1;
		int date=rl.get(Calendar.DATE);
		int hour=rl.get(Calendar.HOUR);
		int minuth=rl.get(Calendar.MINUTE);
		int second=rl.get(Calendar.SECOND);
		System.out.println("当前时间："+year+"年"+month+"月"+date+"日"+hour+"时"+minuth+"分"+second+"秒");
		rl.add(Calendar.DATE, 100);
		year = rl.get(Calendar.YEAR);
		month = rl.get(Calendar.MONTH)+1;
		date = rl.get(Calendar.DATE);
		hour = rl.get(Calendar.HOUR);
		minuth = rl.get(Calendar.MINUTE);
		second = rl.get(Calendar.SECOND);
		System.out.println("一百天后时间："+year+"年"+month+"月"+date+"日"+hour+"时"+minuth+"分"+second+"秒");
		SimpleDateFormat ghst1=new SimpleDateFormat("yyyy-MM-dd");
		LocalDate ldt=LocalDate.now();
		//SimpleDateFormat:parse方法将字符串解析为Date类的对象
		//SimpleDateFormat:Format方法将Date类的对象格式化为字符串
		Date date4=ghst1.parse(""+ldt.plusDays(100));
		SimpleDateFormat ghst2=new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("100天以后的时间："+ghst2.format(date4));
		
		System.out.println("今年是"+Year.now()+"年");
		SimpleDateFormat ghst3=new SimpleDateFormat("yyyy-MM");
		Date date5=ghst3.parse(""+YearMonth.now());
		SimpleDateFormat ghst4=new SimpleDateFormat("yyyy年MM月");
		System.out.println("今年是"+ghst4.format(date5));
		
		// 系统时区
		ZoneId zoneId=ZoneId.systemDefault();
		System.out.println("当前时区是"+zoneId);
		Instant instans=Instant.now();
		System.out.println("当前时间是"+instans);
	}

}
