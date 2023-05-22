package src.com.xyz.enumPractice;



enum Size {
    SMALL,MEDIUM,LARGE,EXTRALARGE,SAGAR;
    Size(){

    }
}

public class EnumDemo {
    public static void main(String[] args) {

      String s = "SAGAR";
      Size pizzaSize = Size.valueOf(s);
        System.out.println(pizzaSize);
        orderPizza(pizzaSize);

        Size ss = Size.EXTRALARGE;
        String size2 = ss.toString();
        System.out.println("enum constant in String :" +size2);


    }

    private static void orderPizza(Size pizzasize) {
        switch (pizzasize) {

            case SMALL:
                System.out.println("I ordered a small size pizza");
                break;

            case MEDIUM:
                System.out.println("I ordered a medium size pizza");
                break;

            case LARGE:
                System.out.println("I ordered a large size pizza");
                break;

            case EXTRALARGE:
                System.out.println("I ordered a extralarge size pizza");
                break;

            default:
                System.out.println("I don't know which one to order");
                break;

        }
    }
}
