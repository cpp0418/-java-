package jihe_com;

import java.util.ArrayList;
import java.util.Iterator;


public class E67 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		list.add("data_4");
		System.out.println(list);
		System.out.println("利用列表使用jdk8的foreach方法进行输出集合");
		list.forEach(lx->System.out.println(lx));
		
		System.out.println("利用迭代使用jdk8的foreach方法进行输出集合");
		Iterator<String> it=list.iterator();
		it.forEachRemaining(lx1->System.out.println(lx1));

	}

}
