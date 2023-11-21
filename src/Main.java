import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.area();

        final int i1 = 10;

        final Square square = new Square();
        square.a = 10;
        square.area();


        testInterface(circle);
        testInterface(square);

        Area[] list = new Area[3];

        list[0] = circle;
        list[1] = square;

        Rectangle rectangle = new Rectangle(10, 20);

        list[2] = rectangle;

        for (int i = 0; i < list.length; i++) {
            list[i].area();
            list[i].test();
        }

        int r = Area.r;
        Area.test3();
        Random random = new Random();

        random.nextInt(10,20);


        Test test = new Test(10);


        Marker[] markers = new Marker[4];

        markers[0] = circle;
        markers[1] = square;
        markers[2] = test;

        Animal[] test111 = new Animal[4];

        Cat1 cat1 = new Cat1("test", 14);

        test111[0] = cat1;


        System.out.println(test111[0].name);
        Cat1 test1111 = (Cat1) test111[1];
        System.out.println(test1111.test);


//        Animal ttest = new Animal() {
//            @Override
//            void doVoice() {
//
//            }
//        };
//        Animal test111 = new Animal();

//        Area area = new Area() {
//            @Override
//            public void area() {
//                System.out.println("Test");
//            }
//        };
//
//        Area area1 = new Area();

        if (test111 instanceof Test){
            testInterface1();
        } efeg


    }

    public final static void testInterface(Area area){
        System.out.println("///// start interface");
        area.area();
        System.out.println("///// finish interface");
    }

    public static void testInterface1(Circle area){
        System.out.println("///// start Circle");
        System.out.println("///// start Circle");
        System.out.println("///// start Circle");
        System.out.println("///// start Circle");
        System.out.println("///// start Circle");
        System.out.println("///// start Circle");
        area.area();
        System.out.println("///// finish Circle");
        System.out.println("///// finish Circle");
        System.out.println("///// finish Circle");
        System.out.println("///// finish Circle");
        System.out.println("///// finish Circle");
        System.out.println("///// finish Circle");
    }

    public static void testInterface2(Square area){
        System.out.println("///// start Square");
        System.out.println("///// start Square");
        System.out.println("///// start Square");
        System.out.println("///// start Square");
        area.area();
        System.out.println("///// finish Square");
        System.out.println("///// finish Square");
        System.out.println("///// finish Square");
        System.out.println("///// finish Square");
    }


    static class Test implements Marker{
        int a;

        public Test(int a) {

            this.a = a;
        }



        void doNothing(){

            System.out.println(this.a + "test");
        }
    }

    interface A1{
        void a1();
    }

}