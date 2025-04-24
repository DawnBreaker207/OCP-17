package CollectionsAndGenerics.Generics;

import java.util.*;

public class LongTailAnimal {
    protected void chew(List<Object> input) {

    };

//    protected void chew(List<Double> input) { // DOES NOT COMPILE
//
//    };

}

class Anteater extends LongTailAnimal {
//    protected void chew(List<Double> input) {   // DOES NOT COMPILE
//	
//    } 
    protected void chew(List<Object> input) {
    }

    protected void chew(ArrayList<Double> input) {
    }
}
