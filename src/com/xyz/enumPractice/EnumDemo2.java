package src.com.xyz.enumPractice;
enum Values {
    SMALL,MEDIUM,LARGE,EXTRALARGE, ;

    Values(){
        System.out.println(" constructor invoked");
    }
    int val = 10;
    public void getValue(){
        System.out.println("inside getValue()");
        System.out.println("val is :"+ val);


    }

}
public class EnumDemo2 {
    public static void main(String[] args) {

        Values pizzasize = Values.SMALL;
        System.out.println(pizzasize);
        pizzasize.getValue();

        System.out.println(pizzasize.val);


    }
}
