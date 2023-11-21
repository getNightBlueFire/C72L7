package a1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        testInterface(cat);
        testInterface(dog);

    }

    public static void testInterface(Voice voice) {
        voice.doVoice();
    }
}
