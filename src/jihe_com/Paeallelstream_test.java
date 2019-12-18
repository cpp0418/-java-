package jihe_com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Paeallelstream_test {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("张三","李四","张小明","张杨");
		Stream<String> sp=list.parallelStream();
		if (sp.isParallel()) {
			System.out.println("这是一个并行流");
		}
		sp.limit(3).forEach(ys->System.out.println(ys));
	}

}
