package jihe_com;


import java.util.TreeSet;

/*
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String) o1;
		String s2=(String) o2;
		return s1.length()-s2.length();
	}
	
}
public class TreeSet_test3 {
	public static void main(String[] args) {
		TreeSet tSet=new TreeSet(new MyComparator());
		tSet.add("jake");
		tSet.add("Ake");
		tSet.add("Helen");
		tSet.add("Roosey");
		System.out.println(tSet);
	}

}*/
public class TreeSet_test3 {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>((obj1,obj2)->{	
		String s1=(String) obj1;
		String s2=(String) obj2;
		return s1.length()-s2.length();});
		ts.add("jake");
		ts.add("Ake");
		ts.add("Helen");
		ts.add("Roosey");
		System.out.println(ts);
	}
}