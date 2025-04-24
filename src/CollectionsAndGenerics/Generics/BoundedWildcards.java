package CollectionsAndGenerics.Generics;

import java.util.ArrayList;
import java.util.List;

public class BoundedWildcards {
    static class Bird {

    }

    static class Sparrow extends Bird {

    }

    public static void printList(List<?> list) {
	for (Object x : list)
	    System.out.println(x);
    }

    public static long total(List<? extends Number> list) {
	long count = 0;
	for (Number number : list)
	    count += number.longValue();
	return count;
    }

    List<? extends Bird> birds = new ArrayList<Bird>();
//    birds.add(new Sparrow()); // DOES NOT COMPILE
//    birds.add(new Bird()); // DOES NOT COMPILE

    public static void main(String[] args) {
	List<String> keywords = new ArrayList<>();
	keywords.add("java");
	printList(keywords); // DOES NOT COMPILE

//	List<Integer> numbers = new ArrayList<>();
//	numbers.add(Integer.valueOf(42));
//	List<Object> objects = numbers; // DOES NOT COMPILE
//	objects.add("forty two");
//	System.out.println(numbers.get(1));

	List<?> x1 = new ArrayList<>();
	var x2 = new ArrayList<>();

//  	ArrayList<Number> list = new ArrayList<Integer>(); // DOES NOT COMPILE
	List<? extends Number> list = new ArrayList<Integer>();

	List<String> strings = new ArrayList<String>();
	strings.add("tweet");

	List<Object> objects = new ArrayList<Object>(strings);
	addSound(strings);
	addSound(objects);
    }

    static void addSound(List<? super String> list) {
	list.add("quack");
    }
}

interface Flyer {

    void fly();
}

class HangGlider implements Flyer {

    public void fly() {

    }
}

class Goose implements Flyer {

    public void fly() {

    }
}