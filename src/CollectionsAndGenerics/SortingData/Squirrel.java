package CollectionsAndGenerics.SortingData;

import java.util.Comparator;

public class Squirrel {
    private int weight;
    private String species;

    public int getWeight() {
	return weight;
    }

    public void setWeight(int weight) {
	this.weight = weight;
    }

    public String getSpecies() {
	return species;
    }

    public void setSpecies(String species) {
	this.species = species;
    }

    public Squirrel(int weight, String species) {
	this.weight = weight;
	this.species = species;
    }
}

class MultiFieldComparator implements Comparator<Squirrel> {
    public int compare(Squirrel s1, Squirrel s2) {
	int result = s1.getSpecies().compareTo(s2.getSpecies());
	if (result != 0)
	    return result;
	return s1.getWeight() - s2.getWeight();
    }

    Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies).thenComparingInt(Squirrel::getWeight);
    
}