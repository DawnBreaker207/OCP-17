package LambdasAndFunctionalInterfaces.MethodReferences;

interface LearnToSpeak {
    void speak(String sound);
}

interface Converter {
    long round(double num);
}

interface StringStart {
    boolean beginningCheck(String prefix);
}

interface StringChecker {
    boolean check();
}

interface StringParameterChecker {
    boolean check(String text);
}

interface StringTwoParameterChecker {
    boolean check(String text, String prefix);
}

interface EmptyStringCreator {
    String create();
}

interface StringCopier {
    String copy(String value);
}

class DuckHelper {
    public static void teacher(String name, LearnToSpeak trainer) {
	trainer.speak(name);
    }
}

public class Duckling {
    public static void makeSound(String sound) {
//	LearnToSpeak learner = s -> System.out.println(s);
	LearnToSpeak learner = System.out::println;
	DuckHelper.teacher(sound, learner);

    }

    public static void main(String[] args) {
	Converter methodRef1 = Math::round;
	Converter lambda1 = x -> Math.round(x);

	System.out.println(methodRef1.round(100.1));

	var str1 = "Zoo";
	StringStart methodRef2 = str1::startsWith;
	StringStart lambda2 = s -> str1.startsWith(s);

	System.out.println(methodRef2.beginningCheck("A"));

	var str2 = "";
	StringChecker methodRef3 = str2::isEmpty;
	StringChecker lambda3 = () -> str2.isEmpty();

	System.out.println(methodRef3.check());

	var str3 = "";
	StringChecker lambda4 = () -> str3.startsWith("Zoo");
//	StringChecker methodReference = str::startsWith; // DOES NOT COMPILE
//	StringChecker methodReference = str::startsWith("Zoo"); // DOES NOT COMPILE

	StringParameterChecker methodRef5 = String::isEmpty;
	StringParameterChecker lambda5 = s -> s.isEmpty();

	System.out.println(methodRef5.check("Zoo"));

	StringTwoParameterChecker methodRef6 = String::startsWith;
	StringTwoParameterChecker lambda6 = (s, p) -> s.startsWith(p);

	System.out.println(methodRef6.check("Zoo", "A"));

	EmptyStringCreator methodRef7 = String::new;
	EmptyStringCreator lambda7 = () -> new String();

	var myString1 = methodRef7.create();
	System.out.println(myString1.equals("Snake"));

	StringCopier methodRef8 = String::new;
	StringCopier lambda8 = x -> new String(x);

	var myString2 = methodRef8.copy("Zebra");
	System.out.println(myString2.equals("Zebra"));
    }
}
