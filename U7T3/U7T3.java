import java.util.ArrayList;
public class U7T3{
    public static void main(String[] args) {
        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Patty"));
        catList.add(new Cat("Keith"));
        catList.add(new Cat("Jerry"));
        catList.add(new Cat("Mary"));

        // // COMPLETE ME: print each Cat's name using an index-based for loop
        // for (int i = 0; i < catList.size(); i++) {
        //     System.out.println(catList.get(i).getName());
        // }
        // System.out.println();
        // // COMPLETE ME: print each Cat's name using an enhanced for loop
        // for (Cat str : catList) {
        //     System.out.println(str.getName());
        // }

        ArrayList<Integer> ints = new ArrayList<Integer>();
            ints.add(0, 1);
            ints.add(0, 2);
            ints.add(0, 3);
            ints.add(0, 4);
            ints.add(0, 5);
            ints.add(0, 6);

            ArrayList<Integer> newInts = new ArrayList<Integer>();

            for (int i = ints.size() - 1; i >= 0; i--) {
            newInts.add(ints.get(i));
            }

            System.out.println(ints);
            System.out.println(newInts);

    }
}
