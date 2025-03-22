package StaticData;

class KoalaTester {
    public static int count = 0;

    public static void main(String[] args) {
	System.out.println(count);
    }
}

public class Koala {
    public static void main(String[] args) {
	KoalaTester.main(new String[0]);
    }
}
