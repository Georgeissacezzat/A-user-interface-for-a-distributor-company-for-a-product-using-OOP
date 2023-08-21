public class Market {
    protected String name ;
    protected String city ;
    protected Market_type MT ;
    protected int number_of_protucts ;
    public Market(){
        name = "George market";
        city = "Cairo";
        MT = Market_type.OFFLINE;
        number_of_protucts = 0 ;
    }
    public Market(String n , String c , Market_type mt  , int np){
        name = n ;
        city = c ;
        MT = mt ;
        number_of_protucts = np ;
    }
    public void setName(String n){
        this.name = n ;
    }
    public void setCity(String c){
        this.city = c ;
    }
    public void setMT (Market_type m){
        this.MT= m ;
    }
    public void sell (int i){
        this.number_of_protucts -= i ;
    }
    public String getName(){
        return name ;
    }
    public String getCity(){
        return city ;
    }
    public Market_type getMT(){
        return MT ;
    }
    public int getNumber_of_protucts(){
        return number_of_protucts ;
    }
}
