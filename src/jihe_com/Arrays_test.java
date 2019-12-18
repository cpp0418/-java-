package jihe_com;

import java.util.Arrays;

public class Arrays_test {

	public static void main(String[] args) {
		int [] arr= {9,8,3,5,2,7,10};
		System.out.println("排序前：");
		printArray(arr);
		Arrays.sort(arr);
		System.out.println("\n排序后：");
		printArray(arr);
		int index=Arrays.binarySearch(arr, 3);
		System.out.println("\n元素3的索引是"+index);
		//拷贝的数组
		int[] copiedarr = Arrays.copyOfRange(arr, 2, 7);
		System.out.println("拷贝后的数组元素是：");
		printArray(copiedarr);
		//替换的数组
		Arrays.fill(copiedarr, 8);
		System.out.println("拷贝的数组被替换为8的是：");
		printArray(copiedarr);
}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i!=arr.length-1) {
				System.out.print(arr[i]+",");
			}else {
				System.out.println(arr[i]+"]");
			}
			
		}
		
	}
}