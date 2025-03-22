package AccessModifiers.pond.inland;

import AccessModifiers.pond.shore.Bird;

public class BirdWatcherFromAfar {
    public void watchBird() {
	Bird bird = new Bird();
	
//	DOES NOT COMPILE
	bird.floatInWater();
	System.out.println(bird.text);
    }
}
