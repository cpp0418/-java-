package jihe_com;

public class foreach_xuhua {
	static String[] strs= {"aaa","bbb","ccc"};
	public static void main(String[] args) {
		for (String mgzf : strs) {
			mgzf = "ddd";
		}
		System.out.println("foreach循环修改的数组：" + strs[0] + " " + strs[1] + " " + strs[2] + " ");
		for (int i = 0; i < strs.length; i++) {
			strs[i] = "ddd";
		}
		System.out.println("for循环修改的数组：" + strs[0] + " " + strs[1] + " " + strs[2] + " ");
	}
}