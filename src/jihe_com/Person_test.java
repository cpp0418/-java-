package jihe_com;
import java.util.HashSet;

class person{
	String name;
	int  age;
	
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public person() {
		// TODO 自动生成的构造函数存根
	}
	@Override
	public int hashCode() {
		 
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		
		person other = (person) obj;
		return this.name.equals(other.name);
	}
	@Override
	public String toString() {
		return  name + ":"+age;
	}
	
}
public class Person_test {

	public static void main(String[] args) {
	person s1 =	new person("陈宫",18);
	person s2 =	new person("王刷",19);
	person s3 =	new person("张包",28);
	HashSet<person>h1=new HashSet<person>();
	h1.add(s1);
	h1.add(s2);
	h1.add(s3);
	System.out.println(h1);
	}

}
