package LambdasAndFunctionalInterfaces.BuiltInFunctionalInterfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {
	Supplier<LocalDate> s1 = LocalDate::now;
	Supplier<LocalDate> s2 = () -> LocalDate.now();

	LocalDate d1 = s1.get();
	LocalDate d2 = s2.get();

	System.out.println(d1);
	System.out.println(d2);

	Supplier<StringBuilder> s3 = StringBuilder::new;
	Supplier<StringBuilder> s4 = () -> new StringBuilder();

	System.out.println(s3.get());
	System.out.println(s4.get());

	Supplier<ArrayList<String>> s5 = ArrayList::new;
	ArrayList<String> a1 = s5.get();
	System.out.println(a1);

	BooleanSupplier b1 = () -> true;
	BooleanSupplier b2 = () -> Math.random() > .5;
	System.out.println(b1.getAsBoolean());
	System.out.println(b2.getAsBoolean());

	
    }
}