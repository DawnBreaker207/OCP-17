package BeyondClasses.SealingClasses;

sealed class Antelope permits Gazelle {

}

public final class Gazelle extends Antelope {

}

class George extends Gazelle {

}