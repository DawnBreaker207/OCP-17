package LambdasAndFunctionalInterfaces.VariablesInLambdas;

import java.util.function.*;

public class Crow {
    private String color;

    public void caw(String name) {
	String volume = "loudly";
//	name = "Caty";
//	color = "black";
	Consumer<String> consumer = s -> System.out.println(name + " says " + volume + " that she is " + color);
//	volume = "softly";
    }
}
