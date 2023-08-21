import java.security.PublicKey;
import java.util.ArrayList;

public class Company {
    protected String name_of_product ;
    protected int number_of_protucts ;
    protected String name_of_company ;
    protected int number_of_protucts_in_markets = 0 ;
    ArrayList<String> Cities = new ArrayList<String>();
    public Company( String ss , String s , int n ){
        name_of_company = ss ;
        name_of_product = s ;
        number_of_protucts = n ;
    }
    public void setName_of_company(String s){
        name_of_company = s ;
    }
    public void setName_of_product(String i){
        name_of_product = i ;
    }
    public void setNumber_of_protucts (int n){
        number_of_protucts = n ;
    }
    public void setCities(String s){
        Cities.add(s);
    }
    public void sell (int i){
        this.number_of_protucts_in_markets -= i ;
        this.number_of_protucts -= i ;
    }
    public void setNumber_of_protucts_in_markets(int i){
        this.number_of_protucts_in_markets += i ;
        if (this.number_of_protucts_in_markets > this.number_of_protucts){
            this.number_of_protucts_in_markets -= i ;
            System.out.println("Error");
        }
    }
    public String getName_of_company(){
        return name_of_company ;
    }
    public String getName_of_product(){
        return name_of_product;
    }
    public int getNumber_of_protucts_in_markets(){
        return number_of_protucts ;
    }
    public void getCities (){
        System.out.println(Cities);
    }
    public int getNumber_of_protucts(){
        return number_of_protucts ;
    }
    public static String getOwner (){
        return "George_Issac";
    }
}
