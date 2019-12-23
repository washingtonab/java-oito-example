package example;

import java.util.Arrays;
import java.util.List;

public class Main {

	// lambda and stream
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println();
		System.out.println("forEach");
		numbers.forEach(n -> System.out.println(n));

		System.out.println();
		System.out.println("filter");
		numbers.stream()
					.filter(n -> n%2==0)
					.forEach(n -> System.out.println(n));

		System.out.println();
		System.out.println("map");
		numbers.stream()
					.map(n -> n*2)
					.forEach(n -> System.out.println(n));

		System.out.println();
		System.out.println("collect");
		
		
		System.out.println();
		System.out.println("reduce");
		
	}

}
