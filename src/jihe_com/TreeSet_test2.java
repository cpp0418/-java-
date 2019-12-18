package jihe_com;

import java.util.TreeSet;

class Teacher implements Comparable<Object>{
	String name;
	int age;
	
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return  name + ":" + age ;
	}

	@Override
	public int compareTo(Object o) {
		Teacher st=(Teacher) o;
		return this.age-st.age;
	}
	
}
public class TreeSet_test2 {

	public static void main(String[] args) {
		TreeSet<Teacher> t=	new TreeSet<Teacher>();
		t.add(new Teacher("陈勇军",38));
		t.add(new Teacher("马红云",30));
		t.add(new Teacher("张丽萍",35));
		System.out.println(t);
	}

}
