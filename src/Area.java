public interface Area {

    int r = 10;


    public void area();
    //void getArea();

    default void test(){
        test2();
        System.out.println("test!!!!");
        test2();
    }

    private void test2(){
        System.out.println("private!@@@@");
    }

    static void test3(){
        System.out.println("static");
    }



}
