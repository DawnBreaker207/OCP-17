package CollectionsAndGenerics.Generics;

public class Crate<T> {
    private T contents;

    public T lookInCrate() {
	return contents;
    }

    public void packCrate(T contents) {
	this.contents = contents;
    }

    public static void main(String[] args) {
	Elephant elephant = new Elephant();
	Integer numPounds = 15_000;
	SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(elephant, numPounds);

	Crate<Elephant> crateForElephant = new Crate<>();
	crateForElephant.packCrate(elephant);
	Elephant inNewHome = crateForElephant.lookInCrate();

	Crate<Zebra> crateForZebra = new Crate<>();

	Robot joeBot = new Robot();
	Crate<Robot> robotCrate = new Crate<>();
	robotCrate.packCrate(joeBot);

	Robot atDestination = robotCrate.lookInCrate();
    }

}

class Elephant {

}

class Zebra {

}

class Robot {

}

class SizeLimitedCrate<T, U> {
    private T contents;
    private U sizeLimit;

    public SizeLimitedCrate(T contents, U sizeLimit) {
	this.contents = contents;
	this.sizeLimit = sizeLimit;
    }
}