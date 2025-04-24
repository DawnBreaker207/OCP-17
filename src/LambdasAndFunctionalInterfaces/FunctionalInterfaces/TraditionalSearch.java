package LambdasAndFunctionalInterfaces.FunctionalInterfaces;

import java.util.*;

record Animal(String species, boolean canHop, boolean canSwim) {

}

interface CheckTrait {
    boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
	return a.canHop();
    }
}

public class TraditionalSearch {
    public static void main(String[] args) {

	// list of animals
	var animals = new ArrayList<Animal>();
	animals.add(new Animal("fish", false, true));
	animals.add(new Animal("kangaroo", true, false));
	animals.add(new Animal("rabbit", true, false));
	animals.add(new Animal("turtle", false, true));

	// pass class that does check
	print(animals, new CheckIfHopper());
//	Lambda expression
	print(animals, a -> a.canSwim());
	print(animals, a -> !a.canSwim());
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
	for (Animal animal : animals) {
//	    General check
	    if (checker.test(animal))
		System.out.println(animal + " ");
	}
	System.out.println();
    }
}
