public final class Rectangle implements Area, Main.A1,Marker {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void area() {
        System.out.println(a*b);
    }

    @Override
    public void a1() {

    }
}
