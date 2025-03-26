package ClassDesign.ImmutableObjects;

import java.util.ArrayList;
import java.util.List;

public final class Animal {
    private final ArrayList<String> favoriteFoods;

    public Animal() {
	this.favoriteFoods = new ArrayList<String>();
	this.favoriteFoods.add("Apples");
    }

//    public List<String> getFavoriteFoods() {
//	return favoriteFoods;
//    }
    public int getFavoriteFoods() {
	return favoriteFoods.size();
    }

    public String getFavoriteFoodsItem(int index) {
	return favoriteFoods.get(index);
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	var zebra = new Animal();
	System.out.println(zebra.getFavoriteFoods()); // [Apples]
//	zebra.getFavoriteFoods().clear();
//	zebra.getFavoriteFoods().add("Chocolate Chip Cookies");
	System.out.println(zebra.getFavoriteFoods()); // [Chocolate Chip Cookies]
    }

}
