/**
 * Created by nadimchouglay on 23/10/2016.
 */
public class Cloth {


    int a = 10 ;


    public void changeSomething(){

        a=100;

        System.out.println(a);

    }


    public int addingNums(int one , int two ){
        int total = one + two + a;
        System.out.println(total);
        return total;
    }


    public static void main(String[] args) {
        Cloth cloth = new  Cloth();
        Cloth cloth1 = new Cloth();



        cloth.addingNums(10,10);
        cloth.changeSomething();
        cloth.addingNums(10,10);


        cloth1.addingNums(10,10);

    }
}
