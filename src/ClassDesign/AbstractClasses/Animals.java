package ClassDesign.AbstractClasses;

import java.util.ArrayList;

public final class Animals {
    private final ArrayList<String> favoriteFoods;

    public Animals(ArrayList<String> favoriteFoods) {
	if (favoriteFoods == null || favoriteFoods.size() == 0)
	    throw new RuntimeException("favoriteFoods is required");
//	this.favoriteFoods = favoriteFoods;
	this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }

    public int getFavoriteFoodsCount() {
	return favoriteFoods.size();
    }

    public String getFavoriteFoodsItem(int index) {
	return favoriteFoods.get(index);
    }

    public static void main(String[] args) {
	var favorites = new ArrayList<String>();
	favorites.add("Apples");
	var zebra = new Animals(favorites); // Caller still has access to favorites
	System.out.println(zebra.getFavoriteFoodsItem(0)); // [Apples]
	favorites.clear();
	favorites.add("Chocolate Chip Cookies");
	System.out.println(zebra.getFavoriteFoodsItem(0)); // [Chocolate Chip Cookies]
    }
}
