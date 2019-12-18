package jihe_com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class PersonMorde_text {
public static void main(String[] args) {
	List<PersonmMorde>list=new ArrayList<>();
	PersonmMorde p1=new PersonmMorde("wang yun", 18, "男");
	PersonmMorde p2=new PersonmMorde("zhang san", 19, "男");
	PersonmMorde p3=new PersonmMorde("li si", 22, "男");
	PersonmMorde p4=new PersonmMorde("wang qiao", 25, "男");
	list=Arrays.asList(p1,p2,p3,p4);
		// old
		for (PersonmMorde pm : list) {
			System.out.println(pm.getName());
		}
		// new1
		List<String> list2 = list.stream().map(a -> a.getName()).collect(Collectors.toList());
		System.out.println(list2);
		// new2
		List<String> list3 = list.stream().map(PersonmMorde::getName).collect(Collectors.toList());
		System.out.println(list3);
		// new1
		List<String> list4 = list.stream().map(a -> {
			return a.getName();
		})
		.collect(Collectors.toList());
		System.out.println(list4);
}
}
