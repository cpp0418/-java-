package jihe_com;

import java.util.ArrayList;
import java.util.Iterator;

public class Shanchu_test {

	public static void main(String[] args) {
		ArrayList <String>list=new ArrayList<String>();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		list.add("data_4");
		Iterator<String> diedai=list.iterator();
		while (diedai.hasNext()) {
			Object object = (Object) diedai.next();
			if ("data_3".equals(object)) {
				diedai.remove();
			}
		}
		System.out.println(list);
	}
}
