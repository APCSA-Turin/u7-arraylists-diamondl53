import java.util.ArrayList;

public class CustomerCheck {
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check) {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices() {
        /* to be implemented in part (a) */
        double sum = 0;
        for(int i = 0; i < check.size(); i++){
            sum += check.get(i).getPrice();
        }
        return sum;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies() {
        /* to be implemented in part (b) */
        for(int i = 0; i < check.size(); i++){
            if(check.get(i).isDailySpecial() == true){
                return false;
            }
        }
        double totalPrice = totalPrices();
        if(totalPrice < 40){
            return false;
        }else{
            return true;
        }
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck() {
        /* to be implemented in part (c) */
        int totalPeople = 0;
        double peopleIncrease = 0;
        double C = 0;
        for(int i = 0; i < check.size(); i++){
            if(check.get(i).isEntree() == true){
                totalPeople++;
            }
        }
        if(totalPeople >= 6){
            peopleIncrease = 0.20*totalPrices();
        }
        if(couponApplies()){
            C = 0.25*totalPrices();
        }
        return totalPrices() + peopleIncrease - C;
    }
}


