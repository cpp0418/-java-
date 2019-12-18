package jihe_com;

import java.util.ArrayList;

import java.util.Collections;

public class Collection_test {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		Collections.addAll(list, "赵","钱","孙","李","周");
		System.out.println("排序前："+list);
		Collections.reverse(list);
		System.out.println("反转后："+list);
		Collections.sort(list);
		System.out.println("自然排序后："+list);
		Collections.shuffle(list);
		System.out.println("随机排序后："+list);
		Collections.swap(list, 0, list.size()-1);;
		System.out.println("结合收尾交换排序后："+list);
		ArrayList<Integer> list2=new ArrayList<>();
		Collections.addAll(list2, -3,2,9,5,8);
		System.out.println("集合中的元素"+list2);
		System.out.println("集合中的最大元素"+Collections.max(list2));
		System.out.println("集合中的最小元素"+Collections.min(list2));
		Collections.replaceAll(list2, 8, 0);
		System.out.println("替换后的集合"+list2);
		Collections.sort(list2);
		System.out.println("集合排序后："+list2);
		int index=Collections.binarySearch(list2, 9);
		System.out.println("集合通过二分查找法查找元素9所在角标："+index);
		
	}

}
