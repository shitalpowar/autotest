package src.com.xyz.enumPractice;
enum Pizzasize implements I {
    EXTRALARGE, LARGE, MEDIUM, SMALL;


    Pizzasize() {
        System.out.println(" constructor invoked");
    }

    int val = 10;

    public void getVal() {
        System.out.println("inside getValue()");
        System.out.println("val is :" + val);


    }
    @Override
    public void m1() {
        System.out.println("inside m1()");
    }
}

public class EnumDemo3  {

    public static void main(String[] args) {
        Pizzasize pizzaSize = Pizzasize.SMALL;

        System.out.println(pizzaSize);

        pizzaSize.getVal();
        pizzaSize.m1();

        System.out.println(pizzaSize.val);

        System.out.println(pizzaSize.ordinal());

    }

}