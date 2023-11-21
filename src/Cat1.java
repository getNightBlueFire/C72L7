public class Cat1 extends Animal{

    int test;

    public Cat1(String name, int age) {
        super(name, age);
    }

    public Cat1(String name, int age, int test) {
        this(name, age);
        this.test = test;
    }

    @Override
    void doVoice() {

        System.out.println("!!!!!");
    }
}
