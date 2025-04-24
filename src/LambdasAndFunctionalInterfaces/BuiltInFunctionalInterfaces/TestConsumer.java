package LambdasAndFunctionalInterfaces.BuiltInFunctionalInterfaces;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {
	Consumer<String> c1 = System.out::println;
	Consumer<String> c2 = x -> System.out.println(x);

	c1.accept("Annie");
	c2.accept("Annie");

	var map1 = new HashMap<String, Integer>();
	BiConsumer<String, Integer> b1 = map1::put;
	BiConsumer<String, Integer> b2 = (k, v) -> map1.put(k, v);

	b1.accept("chicken", 7);
	b2.accept("chick", 1);

	System.out.println(map1);

	var map2 = new HashMap<String, String>();
	BiConsumer<String, String> b3 = map2::put;
	BiConsumer<String, String> b4 = (k, v) -> map2.put(k, v);

	b3.accept("chicken", "Cluck");
	b4.accept("chick", "Tweep");

	System.out.println(map2);

	Consumer<String> c3 = x -> System.out.println("1: " + x);
	Consumer<String> c4 = x -> System.out.println(",2: " + x);

	Consumer<String> combined = c3.andThen(c2);
	combined.accept("Annie");
    }

}
