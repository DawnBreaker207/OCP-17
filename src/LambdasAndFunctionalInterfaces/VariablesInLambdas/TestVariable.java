package LambdasAndFunctionalInterfaces.VariablesInLambdas;

import java.util.function.*;
import java.util.*;

public class TestVariable {
    Predicate<String> p3 = x -> true;
    Predicate<String> p4 = (var x) -> true;
    Predicate<String> p5 = (String x) -> true;

    public void whatAmI() {
	consume((var x) -> System.out.print(x), 123);
    }

    public void consume(Consumer<Integer> c, int num) {
	c.accept(num);
    }

//    public void counts(List<Integer> list) {
//	list.sort((var x, var y) -> x.compareTo(y));
//    }
    public void counts(List<Integer> list) {
	list.sort((final var x, @Deprecated var y) -> x.compareTo(y));
    }
    
//    public void variables(int a) {
//	int b= 1;
//	Predicate<Integer> p1 = a->{
//	    int b=0;
//	    int c=0;
//	    return b==c;
//	}
//    }
}
