package CollectionsAndGenerics.Generics;

public class Handler {
    public static <T> void prepare(T t) {
	System.out.println("Preparing " + t);
    }

    public static <T> Crate<T> ship(T t) {
	System.out.println("Shipping " + t);
	return new Crate<T>();
    }
}

class More {
    public static <T> void sink(T t) {

    }

    public static <T> T identity(T t) {
	return t;
    }

    public static T noGood(T t) { // DOES NOT COMPILE
	return t;
    }
}