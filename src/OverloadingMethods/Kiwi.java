package OverloadingMethods;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Kiwi {
    public void fly(int numMiles) {
    }

    public void fly(Integer numMiles) {
    }

    public static void main(String[] args) {
	var k = new Kiwi();
	k.fly(1);
    }
}
