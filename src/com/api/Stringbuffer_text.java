package com.api;

public class Stringbuffer_text {

	public static void main(String[] args) {
		String s = "我爱你中国";
		//添加
		StringBuffer zfchc = new StringBuffer(s);
		zfchc.append('!');
		System.out.println(zfchc);
		zfchc.insert(3, ',');
		System.out.println(zfchc);
		//删除
		zfchc.delete(2, 4);
		System.out.println(zfchc);
		//修改
		zfchc.replace(2, 4, "咸宁");
		System.out.println(zfchc);
		//翻转
		zfchc.reverse();
		System.out.println(zfchc);
	}

}
