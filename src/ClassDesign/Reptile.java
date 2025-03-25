package ClassDesign;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Reptile {
    protected void sleep() throws IOException {
    }

    protected void hide() {

    }

    protected void exitShell() throws FileNotFoundException {

    }
}

class GalapagosTortoise extends Reptile {
    public void sleep() throws FileNotFoundException {

    }

    // DOES NOT COMPILE
    public void hide() throws FileNotFoundException {

    }

    // DOES NOT COMPILE
    public void exitShell() throws IOException {

    }
}
