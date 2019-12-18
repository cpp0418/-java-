package jihe_com;

import java.util.HashSet;

class student{
	String id;
	String name;
	
	public student() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		student other = (student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return id+":"+name;
	}
	
}
public class Hash_test {

	public static void main(String[] args) {
	student s1	=new  student("1","milk");
	student s2	=new  student("1","milk");
	student s3	=new  student("2","mary");
	HashSet<student> lx=new HashSet<student>();
	lx.add(s1);
	lx.add(s2);
	lx.add(s3);
	System.out.println(lx);
}
}
