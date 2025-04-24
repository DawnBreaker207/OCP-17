package CollectionsAndGenerics.CommonCollection;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
	Collection<String> list1 = new ArrayList<>();
	System.out.println(list1.add("Sparrow"));
	System.out.println(list1.add("Sparrow"));

	Collection<String> set1 = new HashSet<>();
	System.out.println(set1.add("Sparrow"));
	System.out.println(set1.add("Sparrow"));

	Collection<String> birds = new ArrayList<>();

	birds.add("hawk");
	birds.add("hawk");

	System.out.println(birds.contains("hawk"));
	System.out.println(birds.contains("robin"));

	System.out.println(birds.isEmpty());
	System.out.println(birds.size());

	birds.clear();

	System.out.println(birds.isEmpty());
	System.out.println(birds.size());

	System.out.println(birds.remove("cardinal"));
	System.out.println(birds.remove("hawk"));

	System.out.println(birds);

	Collection<String> list2 = new ArrayList<>();

	list2.add("Magician");
	list2.add("Assistant");

	System.out.println(list2);
	list2.removeIf(s -> s.startsWith("A"));
	System.out.println(list2);

	Collection<String> set2 = new HashSet<>();

	set2.add("Wand");
	set2.add("");

	set2.removeIf(String::isEmpty);
	System.out.println(set2);

	Collection<String> cats = List.of("Annie", "Ripley");
	cats.forEach(System.out::println);
	cats.forEach(c -> System.out.println(c));

	var list3 = List.of(1, 2);
	var list4 = List.of(2, 1);
	var set3 = Set.of(1, 2);
	var set4 = Set.of(2, 1);

	System.out.println(list3.equals(list4));
	System.out.println(set3.equals(set4));
    }

}
