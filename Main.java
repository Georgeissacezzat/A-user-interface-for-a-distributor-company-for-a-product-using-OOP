import java.util.Scanner ;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        Company c = new Company("GO company" , "Milk" , 50 );
        Market m1 = new Market("Super" , "Cairo" , Market_type.OFFLINE , 15);
        Market m2 = new Market("KOKO" , "Cairo" , Market_type.ONLINE , 15);
        Market m3 = new Market("TO" , "Alex" , Market_type.OFFLINE , 5);
        Market m4 = new Market("Hanon" , "Alex" , Market_type.ONLINE , 5);
        Market m5 = new Market("ON" , "Giza" , Market_type.ONLINE , 10);
        c.setCities("Cairo");
        c.setCities("Alex");
        c.setCities("Giza");
        c.setNumber_of_protucts(50);
        System.out.println("Welcome to " + c.getName_of_company() + " for " + c.getName_of_product() );
        System.out.print("You can buy our protucts in " );
        c.getCities();
        System.out.println("Choose City and Market type [ 1 : cairo , 2 : alex , 3 : giza ] [ 1 : OFFLINE , 2: ONLINE ] ");
        int s = input.nextInt();
        int ss = input.nextInt();
        if (s == 1){
            if (ss == 2){
                System.out.println(m2.getName() + " " + m2.getMT() + " " + m2.getCity() + " " +m2.getNumber_of_protucts());
                System.out.println("How many products do you want ?");
                int i = input.nextInt();
                if (i > m2.getNumber_of_protucts())
                    System.out.println("Sorry no products enough");
                else{
                    m2.sell(i);
                    c.sell(i);
                }
            }
            else{
                System.out.println(m1.getName() + " " + m1.getMT() + " " + m1.getCity() + " " +m1.getNumber_of_protucts());
                System.out.println("How many products do you want ?");
                int i = input.nextInt();
                if (i > m1.getNumber_of_protucts())
                    System.out.println("Sorry no products enough");
                else{
                    m1.sell(i);
                    c.sell(i);
                }
            }
        }
        else if (s==2){
            if (ss == 2){
                System.out.println(m4.getName() + " " + m4.getMT() + " " + m4.getCity() + " " +m4.getNumber_of_protucts());
                System.out.println("How many products do you want ?");
                int i = input.nextInt();
                if (i > m4.getNumber_of_protucts())
                    System.out.println("Sorry no products enough");
                else{
                    m4.sell(i);
                    c.sell(i);
                }
            }
            else{
                System.out.println(m3.getName() + " " + m3.getMT() + " " + m3.getCity() + " " +m3.getNumber_of_protucts());
                System.out.println("How many products do you want ?");
                int i = input.nextInt();
                if (i > m3.getNumber_of_protucts())
                    System.out.println("Sorry no products enough");
                else{
                    m3.sell(i);
                    c.sell(i);
                }
            }
        }
        else{
            if (ss == 2){
                System.out.println(m5.getName() + " " + m5.getMT() + " " + m5.getCity() + " " +m5.getNumber_of_protucts());
                System.out.println("How many products do you want ?");
                int i = input.nextInt();
                if (i > m5.getNumber_of_protucts())
                    System.out.println("Sorry no products enough");
                else{
                    m5.sell(i);
                    c.sell(i);
                }
            }
            else{
                System.out.println("No OFFLINE market in giza");
            }
        }
        System.out.println(c.getNumber_of_protucts());
    }
}