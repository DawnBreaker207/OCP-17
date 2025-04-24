package CollectionsAndGenerics.SortingData;

public class LegacyDuck implements Comparable {
    private String name;

    public int compareTo(Object obj) {
	LegacyDuck d = (LegacyDuck) obj;
	return name.compareTo(d.name);
    }
}
