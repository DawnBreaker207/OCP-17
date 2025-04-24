package ExceptionsAndLocalization.UnderstandExceptions;

import java.io.IOException;

public class TestExceptions {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    void fail(int distance) throws IOException {
	try {
	    if (distance > 10) {
		throw new IOException();
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    void fall(String input) {
	System.out.println(input.toLowerCase());
    }
}
