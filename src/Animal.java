public abstract class Animal {

    String name;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int age;
    abstract void doVoice();

    void move(){
        System.out.println("Run");
    }



}
