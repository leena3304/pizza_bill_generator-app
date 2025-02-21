public class pizza {
    private int price;
    private boolean veg;
    private int extracheese=100;
    private int extratoppings=150;
    private int backpack=20;
    private int basepizzaprice;
    private boolean isextracheeseadded=false;
    private boolean isextratoppingsadded=false;
    private boolean isoptedforbackpack=false;
    public pizza(boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        basepizzaprice=this.price;
    }
    public void addExtraCheese(){
        isextracheeseadded=true;
        this.price+=extracheese;
    }
    public void addExtraToppings(){
        isextratoppingsadded=true;
        this.price+=extratoppings;
    }
    public void takeAway(){
        isoptedforbackpack=true;
        this.price+=backpack;
    }
    public void getBill(){
        String bill="";
        System.out.println("Pizza: "+basepizzaprice);
        if(isextracheeseadded){
           bill+="Extra Cheese added: "+extracheese+"\n";
        }
        if(isextratoppingsadded){
            bill+="Extra Toppings added: "+extratoppings+"\n";
        }
        if(isoptedforbackpack){
            bill+="Take away: "+backpack+"\n";
        }
        bill+= "Bill : "+this.price +"\n";
          System.out.println(bill);
    }
}
