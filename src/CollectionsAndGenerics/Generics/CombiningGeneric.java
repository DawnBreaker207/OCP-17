package CollectionsAndGenerics.Generics;

import java.util.*;

public class CombiningGeneric {
    class A {

    }

    class B extends A {

    }

    class C extends B {

    }

    public static void main(String[] args) {
	List<?> list1 = new ArrayList<A>();
	List<? extends A> list2 = new ArrayList<A>();
	List<? super A> list3 = new ArrayList<A>();

	List<? extends B> list4 = new ArrayList<A>(); // DOES NOT COMPILE
	List<? super B> list5 = new ArrayList<A>();
	List<?> list6 = new ArrayList<? extends A>(); // DOES NOT COMPILE

    }

    <T> T first(List<? extends T> list) {
	return list.get(0);
    }

    <T> <? extends T> second(List<? extends T> list) { // DOES NOT COMPILE
	return list.get(0);
	}

    <B extends A> B third(List<B> list) {
	return new B(); // DOES NOT COMPILE
    }

    void fourth(List<? super B> list) {}

    <X> void fifth(List<X super B> list) { // DOES NOT COMPILE
    }
}
