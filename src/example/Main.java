package example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	// lambda and stream examples
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println();
		System.out.println("=================forEach");
		numbers.forEach(n -> System.out.println(n));

		System.out.println();
		System.out.println("=================filter");
		numbers.stream().filter(n -> n % 2 == 0) // somente pares
				.forEach(n -> System.out.println(n));

		System.out.println();
		System.out.println("=================map");
		numbers.stream().map(n -> n * 2) // fazendo dobro
				.forEach(n -> System.out.println(n));

		System.out.println();
		System.out.println("=================collect to set");
		Set<Integer> collector1 = numbers
				.stream()
				.collect(Collectors.toSet());
		System.out.println(collector1);

		System.out.println();
		System.out.println("=================collect to map");
		Map<Boolean, List<Integer>> collector2 = numbers
				.stream()
				.collect(Collectors.groupingBy(n -> n % 2 == 0));
		System.out.println(collector2);

		System.out.println();
		System.out.println("=================reduce to sum");
		Optional<Integer> sum = numbers
				.stream()
				.reduce((n1, n2) -> n1+ n2);
		System.out.println(sum.get());

	}

}
