package BeyondClasses.SealingClasses;

class sealed Frog permits GlassFrog { // DOES NOT COMPILE
    
}

final class GlassFrog extends Frog {

}

abstract sealed class Wolf permits Timber {

}

public final class Timber extends Wolf {

}

final class MyWolf extends Wolf { // DOES NOT COMPILE

}