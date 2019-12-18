package jihe_com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_test {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("1", "jake");
		map.put("2", "Rose");
		map.put("3", "Lucy");
		map.put("4", "Tom");
		System.out.println(map);
		if (map.containsKey("1")) {
			System.out.println("这个map包含键1");
			System.out.println("这个map包含键1是"+map.get("1"));
		}
		//输出所有键对象
		System.out.println("输出所有键对象"+map.keySet());
		//输出所有键的值
		System.out.println("输出所有键的值"+map.values());
		//替换键的对象的值
		map.replace("1", "andy");
		System.out.println("替换键的对象的值"+map);
		//删除指定键的键值对
		map.remove("1");
		System.out.println("删除指定键的键值对"+map);
		
		System.out.println("用键值对遍历键和值：");
		Set<String> keySet=map.keySet();
		Iterator<String> diedai=keySet.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value=map.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println("用键对遍历键和值：");
		Set<Entry<String, String>> entrySet=map.entrySet();
		Iterator<Entry<String, String>> jianzhidui=entrySet.iterator();
		while (jianzhidui.hasNext()) {
			Entry<String, String> entry = (Entry<String, String>) jianzhidui.next();
			Object key=entry.getKey();
			Object value=entry.getValue();
			System.out.println(key+":"+value);
		}
		System.out.println("用foreach遍历双列集合键和值：");
		map.forEach((key,value)->System.out.println(key+":"+value));
		System.out.println("用foreach遍历双列集合的值：");
		Collection<String> value=map.values();
		value.forEach(values->System.out.println(values));
		
		Map<String, String> map2=new LinkedHashMap<String, String>();
		map2.put("2", "Rose");
		map2.put("1", "jake");
		map2.put("2", "Rosedy");
		map2.put("3", "Lucy");
		map2.put("4", "Tom");
		System.out.println(map2);
	}

}
