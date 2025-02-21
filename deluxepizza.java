public class Deluxpizza extends pizza{
    public Deluxpizza(Boolean veg){
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
        //super.getBill();
    }

    @Override
    public void addExtraCheese() {

    }

    @Override
    public void addExtraToppings() {

    }
}
