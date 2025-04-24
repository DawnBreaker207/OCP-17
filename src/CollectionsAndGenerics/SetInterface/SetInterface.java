package CollectionsAndGenerics.SetInterface;

import java.util.*;

public class SetInterface {

    public static void main(String[] args) {
	Set<Character> letters = Set.of('z', 'o', 'o');
	Set<Character> copy = Set.copyOf(letters);

	Set<Integer> set1 = new HashSet<>();
	boolean b1 = set1.add(66);
	boolean b2 = set1.add(10);
	boolean b3 = set1.add(66);
	boolean b4 = set1.add(8);
	
	set1.forEach(System.out::println);
	
	
	Set<Integer> set2 = new TreeSet<>();
	boolean b5 = set2.add(66);
	boolean b6 = set2.add(10);
	boolean b7 = set2.add(66);
	boolean b8 = set2.add(8);
	
	set2.forEach(System.out::println);
    }

}
