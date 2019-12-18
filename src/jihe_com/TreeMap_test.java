package jihe_com;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
class MyComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String key1=(String)o1;
		String key2=(String)o2;
		return key2.compareTo(key1);
	}
	
}
public class TreeMap_test {

	public static void main(String[] args) {
		Map<String, String> map=new TreeMap<String, String>(new MyComparator());
		map.put("1", "Lucy");
		map.put("2", "John");
		map.put("3", "Smith");
		map.put("5", "Amanda");
		map.put("4", "Aimee");
		System.out.println(map);
		Set<String> keySet=map.keySet();
		Iterator<String> diedai=keySet.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value=map.get(key);
			System.out.println(key+":"+value);

	}
  }
}
