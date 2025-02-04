package U7T1;
import java.util.ArrayList;

public class UsedCarLot {
    
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory(){
        return inventory;
    }

    public void addCar(Car carToAdd){
        inventory.add(carToAdd);
    }

    public boolean swap(int one, int two){
        Car first;
        Car second;
         if(one >= 0 && one < inventory.size() && two >= 0 && two < inventory.size()){
            first = inventory.get(one);
            second = inventory.get(two);
            inventory.set(two, first);
            inventory.set(one, second);
            return true;
        }else{
            return false;
        }
        
    }
}
