package com.api;

import java.util.*;

public class Systrm_text {

	public static void main(String[] args) {
		Properties shuxing=System.getProperties();
		System.out.println(shuxing);
		Set<String> shuxingming =shuxing.stringPropertyNames();
		for (String key : shuxingming) {
			//获取当前键key（属性名）所对应的属性值
			String value=System.getProperty(key);
			System.out.println(key+"--->"+value);
		}
	}

}
