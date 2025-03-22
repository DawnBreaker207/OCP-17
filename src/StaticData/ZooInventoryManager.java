package StaticData;

class ZooPen {
    private static final int NUM_BUCKETS = 45;

    public static void main(String[] args) {
//	DOES NOT COMPILE
	NUM_BUCKETS = 5;
    }
}

public class ZooInventoryManager {
    private static final String[] treats = new String[10];

    public static void main(String args) {
	treats[0] = "popcorn";
    }
}
