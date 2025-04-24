package Streams.AdvancedStream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Separations(String spaceSeparated, String commaSeparated) {
}

public class TestAdvancedStreams {

    public static void main(String[] args) {
	var cats = new ArrayList<String>();
	cats.add("Annie");
	cats.add("Ripley");
	var stream = cats.stream();
	cats.add("KC");
	System.out.println(stream.count());

	var stream1 = List.of("bird-", "bunny-", "cat-", "dog-", "fish-", "lamb-", "mouse-");
	Spliterator<String> originalBagOfFood = stream.spliterator();
	Spliterator<String> emmasBag = originalBagOfFood.trySplit();
	emmasBag.forEachRemaining(System.out::print);

	Spliterator<String> jillsBag = originalBagOfFood.trySplit();
	jillsBag.tryAdvance(System.out::print);
	jillsBag.forEachRemaining(System.out::print);

	originalBagOfFood.forEachRemaining(System.out::print);

	var originalBag = Stream.iterate(1, n -> ++n).spliterator();
	Spliterator<Integer> newBag = originalBag.trySplit();

	newBag.tryAdvance(System.out::print);
	newBag.tryAdvance(System.out::print);
	newBag.tryAdvance(System.out::print);

	var ohMy = Stream.of("lions", "tigers", "bears");
	String result = ohMy.collect(Collectors.joining(", "));
	System.out.println(result);

	Double result1 = ohMy.collect(Collectors.averagingInt(String::length));
	System.out.println(result1);

	TreeSet<String> result2 = ohMy.filter(s -> s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
	System.out.println(result2);

	Map<String, Integer> map = ohMy.collect(Collectors.toMap(s -> s, String::length));
	System.out.println(map);

//	Map<Integer, String> map1 = ohMy.collect(Collectors.toMap(String::length, k-> k));  // BAD
	Map<Integer, String> map1 = ohMy.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
	System.out.println(map1);
	System.out.println(map1.getClass());

	Map<Integer, String> map2 = ohMy
		.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2, TreeMap::new));
	System.out.println(map2);
	System.out.println(map2.getClass());

	Map<Integer, List<String>> map3 = ohMy.collect(Collectors.groupingBy(String::length));
	System.out.println(map3);

	Map<Integer, Set<String>> map4 = ohMy.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
	System.out.println(map4);

	TreeMap<Integer, Set<String>> map5 = ohMy
		.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
	System.out.println(map5);

	TreeMap<Integer, List<String>> map6 = ohMy
		.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
	System.out.println(map6);

	Map<Boolean, List<String>> map7 = ohMy.collect(Collectors.partitioningBy(s -> s.length() <= 5));
	System.out.println(map7);

	Map<Boolean, List<String>> map8 = ohMy.collect(Collectors.partitioningBy(s -> s.length() <= 7));
	System.out.println(map8);

	Map<Boolean, Set<String>> map9 = ohMy
		.collect(Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
	System.out.println(map9);

	Map<Integer, Long> map10 = ohMy.collect(Collectors.groupingBy(String::length, Collectors.counting()));
	System.out.println(map10);

	Map<Integer, Optional<Character>> map11 = ohMy.collect(Collectors.groupingBy(String::length,
		Collectors.mapping(s -> s.charAt(0), Collectors.minBy((a, b) -> a - b))));
	System.out.println(map11);

	var map12 = ohMy.collect(groupingBy(String::length, mapping(s -> s.charAt(0), minBy((a, b) -> a - b))));
	System.out.println(map12);

	var list = List.of("x", "y", "z");

	Separations result3 = list.stream().collect(
		Collectors.teeing(Collectors.joining(" "), Collectors.joining(","), (s, c) -> new Separations(s, c)));
	System.out.println(result3);
    }

//    private static void threeDigit(Optional<Integer> optional) {
//	if (optional.isPresent()) {
//	    var num = optional.get();
//	    var string = "" + num;
//	    if (string.length() == 3)
//		System.out.println(string);
//	}
//    }
    private static void threeDigit(Optional<Integer> optional) {
	optional.map(n -> "" + n).filter(s -> s.length() == 3).ifPresent(System.out::println);
//	Optional<Integer> result = optional.map(String::length);
//	Optional<Integer> result = optional.map(ChainingOptionals::calculator); // DOES NOT COMPILE
//	Optional<Integer> result = optional.flatMap(ChainingOptionals::calculator);
    }

}
