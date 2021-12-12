import java.nio.charset.Charset;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        String[][] numbers = {
                {"34", "34", "34", "34"},
                {"34", "34", "34", "34"},
                {"34", "34", "34", "34"},
                {"34", "34", "34", "34"}
        };

        String[][] strings = {
                {"notnull", "34", "34", "34"},
                {"34", "34", "34", "notnull"},
                {"34", "34", "notnull", "34"},
                {"34", "notnull", "34", "34"}
        };

        String[][] mixed = {
                {"notnull", "34", "34", "34"},
                {"34", "34", "34", "notnull"},
                {"34", "34", "notnull"},
                {"34", "notnull", "34", "34"}
        };

        String[][] sub = {
                {"34", "34", "34", "34"},
                {"34", "34", "34"},
                {"34", "34", "34", "34"},
                {"34", "34", "34", "34"}
        };

        try {
            System.out.println(arrSum(sub));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }


    }

    public static int arrSum(String[][] myArray) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (myArray.length != 4) {
            throw new MyArraySizeException("i-size does not fit");
        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].length != 4) {
                throw new MyArraySizeException("j-size does not fit at line #" + (i + 1));
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {

                try {
                    sum += Integer.parseInt(myArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Failed at [" + i + "], [" + j + "]");
                }

            }
        }

        return sum;
    }
}

