/**
 * Created by nadimchouglay on 22/10/2016.
 */
public class TestingStatic
{

    static int a =30;

    public static void changesomething(){
        int sum =a+40;

        a=50;
        System.out.println("the value of A in change something is "+a);


    }

    public static void nextStep(){
        int one =a+70;
        a =35;

        System.out.println("the value of one is "+a);
    }

    public static void changeA(){

        a=50;
        System.out.println("the value of a in changeA is "+a);

    }

    public static void main(String[] args) {
        TestingStatic.changesomething();
        TestingStatic.nextStep();
        TestingStatic.changeA();
    }

}
