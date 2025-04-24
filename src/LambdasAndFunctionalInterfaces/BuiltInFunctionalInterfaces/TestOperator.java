package LambdasAndFunctionalInterfaces.BuiltInFunctionalInterfaces;

import java.util.function.BinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class TestOperator {

    public static void main(String[] args) {
	UnaryOperator<String> u1 = String::toUpperCase;
	UnaryOperator<String> u2 = x -> x.toUpperCase();

	System.out.println(u1.apply("chirp"));
	System.out.println(u2.apply("chirp"));

	BinaryOperator<String> b1 = String::concat;
	BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);

	System.out.println(b1.apply("baby", "chick"));
	System.out.println(b2.apply("baby", "chick"));

	var d = 1.0;
	IntUnaryOperator f1 = x -> 1;
	f1.applyAsInt((int) d);
    }

}
