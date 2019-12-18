package jihe_com;

import java.util.TreeSet;

public class TreeSet_test {

	public static void main(String[] args) {
//在TreeSet接口输入一个整数，会使
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(25);
		ts.add(11);
		ts.add(15);
		ts.add(1);
		ts.add(10);
		ts.add(21);
		ts.add(8);
		System.out.println("创建TreeSet的集合为" + ts);
		System.out.println("创建TreeSet的集合的首个元素为" + ts.first());
		System.out.println("创建TreeSet的集合小于等于9的最大一个元素为" + ts.floor(9));
		System.out.println("创建TreeSet的集合大于等于9的最小一个元素为" + ts.higher(9));
		ts.pollLast();
		System.out.println("删除后TreeSet的集合为" + ts);
	}

}
