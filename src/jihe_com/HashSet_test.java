package jihe_com;


import java.util.HashSet;

public class HashSet_test {
	public static void main(String[] args) {
//hashset能够去掉重复元素，是因为hashset里的string类型中有hashcode（）和equals（）的方法
		System.out.println("用hashset输出不会出现重复的元素：");
		HashSet<String> set = new HashSet<String>();
		set.add("data_1");
		set.add("data_2");
		set.add("data_3");
		set.add("data_3");
		set.forEach(obj -> System.out.println(obj));
		set.removeAll(set);
//hashset能够去掉重复元素，是因为hashset里的string类型中有hashcode（）和equals（）的方法
		System.out.println("用hashset输出不会出现重复的元素：");
		HashSet<Integer> sz = new HashSet<Integer>();
		sz.add(1);
		sz.add(2);
		sz.add(3);
		sz.add(4);
		sz.add(4);
		sz.add(0);
		sz.forEach(o -> System.out.println(o));
	}
}
