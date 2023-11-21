public class Square implements Area, Perimetr, Marker {
    int a;

    @Override
    public void area() {
        System.out.println(a*a);
    }

    @Override
    public void length() {
        new ToTest(10);
        System.out.println(4 * a);
    }


    class ToTest{
        int a;

        public ToTest(int a) {
            this.a = a;
        }

        public int getA() {
            return a;
        }

        class Tesr1{

        }
    }
}
