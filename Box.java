import java.text.DecimalFormat;
import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> boxOfFruits;

    public Box() {
        this.boxOfFruits = new ArrayList<T>();
    }

    public double getWeight() {

        double totalWeight = 0;

        if (boxOfFruits.isEmpty()) {
            return 0;
        }

            for (int i = 0; i < boxOfFruits.size(); i++)
            {
                totalWeight += boxOfFruits.get(i).getWeight();
            }


        DecimalFormat decimalFormat = new DecimalFormat( "#.###" );
        Double result = Double.valueOf(decimalFormat.format(totalWeight));
        System.out.println(totalWeight);
        return result;

    }

    public boolean boxCompare (Box<?> anotherBox) {
        if (this.getWeight() == anotherBox.getWeight()) {
            return true;
        }
        else {
            return false;
        }
    }

    public void fruitMoving (Box<T> anotherBox) {
        anotherBox.boxOfFruits.addAll(this.boxOfFruits);
        this.boxOfFruits.clear();
    }

}
