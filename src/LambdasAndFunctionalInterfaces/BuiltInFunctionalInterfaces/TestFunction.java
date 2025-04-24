package LambdasAndFunctionalInterfaces.BuiltInFunctionalInterfaces;

import java.util.*;
import java.util.function.*;

public class TestFunction {

    public static void main(String[] args) {
	Function<String, Integer> f1 = String::length;
	Function<String, Integer> f2 = x -> x.length();

	System.out.println(f1.apply("cluck"));
	System.out.println(f2.apply("cluck"));

	BiFunction<String, String, String> b1 = String::concat;
	BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);

	System.out.println(b1.apply("baby", "chick"));
	System.out.println(b2.apply("baby", "chick"));

	Predicate<List> ex1 = x -> "".equals(x.get(0));
	Consumer<Long> ex2 = (Long l) -> System.out.println(l);
	BiPredicate<String, String> ex3 = (s1, s2) -> false;

	Function<List<String>, String> ex4 = x -> x.get(0);
	UnaryOperator<Double> ex5 = (Double l) -> 3.14;

	Function<Integer, Integer> before = x -> x + 1;
	Function<Integer, Integer> after = x -> x * 2;

	Function<Integer, Integer> combined = after.compose(before);
	System.out.println(combined.apply(3));
    }

}
