package CollectionsAndGenerics.MapInterface;

import java.util.*;
import java.util.function.BiFunction;

public class MapInterface {

    public static void main(String[] args) {
	Map<String, String> map1 = new HashMap<>();
	map1.put("koala", "bamboo");
	map1.put("lion", "meat");
	map1.put("giraffe", "leaf");

	String food1 = map1.get("koala");
	for (String key : map1.keySet())
	    System.out.print(key + ",");

	Map<String, String> map2 = new TreeMap<>();
	map2.put("koala", "bamboo");
	map2.put("lion", "meat");
	map2.put("giraffe", "leaf");
	String food2 = map2.get("koala");
	for (String key : map2.keySet())
	    System.out.print(key + ",");

	System.out.println(map2.contains("lion")); // DOES NOT COMPILE
	System.out.println(map2.containsKey("lion"));
	System.out.println(map2.containsValue("lion"));
	System.out.println(map2.size());
	map2.clear();
	System.out.println(map2.size());
	System.out.println(map2.isEmpty());

	Map<Integer, Character> map3 = new HashMap<>();
	map3.put(1, 'a');
	map3.put(2, 'b');
	map3.put(3, 'c');

	map3.forEach((k, v) -> System.out.println(v));
	map3.entrySet().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));

	Map<Character, String> map4 = new HashMap<>();
	map4.put('x', "spot");
	System.out.println("X marks the " + map4.get("x"));
	System.out.println("X marks the " + map4.getOrDefault('x', ""));
	System.out.println("Y marks the " + map4.get('y'));
	System.out.println("Y marks the " + map4.getOrDefault('y', ""));

	Map<Integer, Integer> map5 = new HashMap<>();
	map5.put(1, 2);
	map5.put(2, 4);
	Integer original = map5.replace(2, 10);
	System.out.println(map5);
	map5.replaceAll((k, v) -> k + v);
	System.out.println(map5);

	Map<String, String> favorites1 = new HashMap<>();
	favorites1.put("Jenny", "Bus Tour");
	favorites1.put("Tom", null);
	favorites1.putIfAbsent("Jenny", "Tram");
	favorites1.putIfAbsent("Sam", "Tram");
	favorites1.putIfAbsent("Tom", "Tram");
	System.out.println(favorites1);

	BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

	Map<String, String> favorites2 = new HashMap<>();
	favorites2.put("Jenny", "Bus Tour");
	favorites2.put("Tom", "Tram");

	String jenny = favorites2.merge("Jenny", "Skyride", mapper);
	String tom = favorites2.merge("Jenny", "Skyride", mapper);

	System.out.println(favorites2);
	System.out.println(jenny);
	System.out.println(tom);
    }

}
