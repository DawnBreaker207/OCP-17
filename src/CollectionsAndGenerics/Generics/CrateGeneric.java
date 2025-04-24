package CollectionsAndGenerics.Generics;

public class CrateGeneric {
    public static void main(String[] args) {
	Robot robot = new Robot();
	CrateRecord<Robot> record = new CrateRecord<>(robot);
    }
}

record CrateRecord<T>(T contents) {
    @Override
    public T contents() {
	if (contents == null)
	    throw new IllegalStateException("missing contents");
	return contents;
    }

}