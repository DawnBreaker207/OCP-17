package CollectionsAndGenerics.Generics;

public class TrickyCrate<T> {

    public <T> T tricky(T t) {
	return t;
    }

    public static String crateNew() {
	TrickyCrate<Robot> crate = new TrickyCrate<>();
	return crate.tricky("bot");

    }

}
