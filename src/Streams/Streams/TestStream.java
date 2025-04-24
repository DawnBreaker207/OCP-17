package Streams.Streams;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class TestStream {

    public static void main(String[] args) {
	Stream<String> empty = Stream.empty();
	Stream<Integer> singleElement = Stream.of(1);
	Stream<Integer> fromArray = Stream.of(1, 2, 3);

	var list = List.of("a", "b", "c");
	Stream<String> fromList = list.stream();

	Stream<Double> randoms = Stream.generate(Math::random);
	Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
	Stream<Integer> oddNumberUnder100 = Stream.iterate(1, n -> n < 100, n -> n + 2);

	Stream<String> s = Stream.of("monkey", "gorilla", "bonobo", "2", "duck", "duck");
	System.out.println(s.count());

//	Terminal
	Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
	min.ifPresent(System.out::println);

	Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
	System.out.println(minEmpty.isPresent());

	Stream<String> infinite = Stream.generate(() -> "chimp");
	s.findAny().ifPresent(System.out::println);
	infinite.findAny().ifPresent(System.out::println);

	Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

	System.out.println(list.stream().anyMatch(pred)); // true
	System.out.println(list.stream().allMatch(pred)); // false
	System.out.println(list.stream().noneMatch(pred)); // false
	System.out.println(infinite.anyMatch(pred)); // true

	s.forEach(System.out::print);

	Stream<String> stream = Stream.of("w", "o", "l", "f");
	String word = stream.reduce("", (b, c) -> b + c);
	String word1 = stream.reduce("", String::concat);
	System.out.println(word);

	Stream<Integer> stream1 = Stream.of(3, 5, 6);
	System.out.println(stream1.reduce(1, (a, b) -> a * b));

	BinaryOperator<Integer> op = (a, b) -> a * b;
	Stream<Integer> empty1 = Stream.empty();
	Stream<Integer> oneElement = Stream.of(3);
	Stream<Integer> threeElements = Stream.of(3, 5, 6);

	empty1.reduce(op).ifPresent(System.out::println);
	oneElement.reduce(op).ifPresent(System.out::println);
	threeElements.reduce(op).ifPresent(System.out::println);

	Stream<String> stream2 = Stream.of("w", "o", "l", "f");
	int length = stream2.reduce(0, (i, p) -> i + p.length(), (a, b) -> a + b);
	System.out.println(length); // 5

	StringBuilder word2 = stream2.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
	System.out.println(word2);

	TreeSet<String> set1 = stream2.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
	System.out.println(set1);

	TreeSet<String> set2 = stream2.collect(Collectors.toCollection(TreeSet::new));
	System.out.println(set2);

	TreeSet<String> set3 = stream2.collect(Collectors.toCollection(TreeSet::new));
	System.out.println(set3);

//	Intermediate
	s.filter(x -> x.startsWith("m")).forEach(System.out::print);

	s.distinct().forEach(System.out::print);

	Stream<Integer> s1 = Stream.iterate(1, n -> n + 1);
	s1.skip(5).limit(2).forEach(System.out::print);

	s.map(String::length).forEach(System.out::print);

	List<String> zero = List.of();
	var one = List.of("Bonobo");
	var two = List.of("Mama Gorilla", "Baby Gorilla");
	Stream<List<String>> animals = Stream.of(zero, one, two);
	animals.flatMap(m -> m.stream()).forEach(System.out::println);

	Stream<String> s2 = Stream.of("brown-", "bear-");
	s.sorted().forEach(System.out::print);
	s.sorted(Comparator.reverseOrder()).forEach(System.out::print);
//	s.sorted(Comparator::reverseOrder);  // DOES NOT COMPILE

	var stream3 = Stream.of("black bear", "brown bear", "grizzly");
	long count = stream3.filter(a -> a.startsWith("g")).peek(System.out::println).count();
	System.out.println(count);

//	Pipeline
	var list1 = List.of("Toby", "Anna", "Leroy", "Alex");
//	List<String> filtered = new ArrayList<>();
//	for (String name : list)
//	    if (name.length() == 4)
//		filtered.add(name);
//
//	Collections.sort(filtered);
//	var iter = filtered.iterator();
//	if (iter.hasNext())
//	    System.out.println(iter.next());
//	if (iter.hasNext())
//	    System.out.println(iter.next());

	list.stream().filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);

	Stream.generate(() -> "Elsa").filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);
	long count1 = Stream.of("goldfish", "finch").filter(c -> c.length() > 5).collect(Collectors.toList()).stream()
		.count();
	System.out.println(count1);

	List<String> helper = Stream.of("goldfish", "finch").filter(c -> c.length() > 5).collect(Collectors.toList());
	long count2 = helper.stream().count();
	System.out.println(count2);
    }

}
