package BeyondClasses.SealingClasses;

sealed class Bear permits Kodiak, Panda {

}

final class Kodiak extends Bear {

}

public non-sealed class Panda extends Bear {

}
