package com.api;


import java.util.HashSet;
import java.util.Random;

public class Ssq {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("双色球开奖啦："); 
		System.out.println("六个红球号码分别为：");
		Random r=new Random();
		HashSet<Integer> hs=new HashSet<>();
		for (int i = 0; i < 10000; i++) {
			int hq=r.nextInt(33)+1;
			hs.add(hq);
			if (hs.size()==6) {
				break;
			}	
		}for (Integer hq : hs) {
			System.out.print(hq+"  ");
			Thread.sleep(1000);
		}
		
		System.out.println();
		System.out.println("三个蓝球号码分别为：");
		Random lq=new Random();
		for (int i = 0; i < 1; i++) {
			System.out.print(lq.nextInt(14)+" ");
			Thread.sleep(1000);
			
		}
	}

}
