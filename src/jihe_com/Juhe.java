package jihe_com;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Juhe {


	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("张小明");
		list.add("张杨");
		//把集合变成流
		Stream<String> liu=list.stream();
		liu.forEach(j->System.out.println(j));
		//对stream流中进行过滤，截取操作
		Stream<String> liu2=list.stream();
		Stream<String> liu3=liu2.filter(i->i.startsWith("张"));
		System.out.println("所以姓张的是：");
		liu3.forEach(j->System.out.println(j));
		//通过链接的表达方式完成聚合
		System.out.println("通过链接的表达方式完成聚合，第二个和第三个姓张的是:");
		list.stream().filter(i->i.startsWith("张")).skip(1).limit(2).forEach(j->System.out.println(j));
		System.out.println("第二个和第三个姓张用和连接的是:");
		System.out.println(list.stream().filter(i->i.startsWith("张")).skip(1).limit(2).collect(Collectors.joining("和")));
	}

}
