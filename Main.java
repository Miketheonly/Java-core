import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // #1   Написать метод, который меняет два элемента массива местами
        //    (массив может быть любого ссылочного типа);

        String[] arr = new String[]{"First", "Second", "Third", "Fourth", "Fifth"};
        String[] arr2 = new String[]{"Sixth", "Seventh", "Eighth", "Ninth", "Tenth"};

        indexSwap(arr, 4, 5);

    }

    public static void indexSwap(String[] arr, int t1, int t2) {

        if ((t1 - 1 > arr.length - 1) || (t2 - 1 > arr.length - 1) || (t1 - 1 < 0) || (t2 - 1 < 0)) {
            System.out.println("Индексы заменяемых элементов массива некорректны");
        }

        System.out.println(Arrays.toString(arr));

        String temp;

        temp = arr[t2-1]; // копируется адрес
        arr[t2-1] = arr[t1-1];
        arr[t1-1] = temp;

        System.out.println(Arrays.toString(arr));

//        #2 ---------------------------------------------------------

        Box<Apple> boxOfApples = new Box();
        boxOfApples.boxOfFruits.add(new Apple(1.4));
        boxOfApples.boxOfFruits.add(new Apple(1.2));
        boxOfApples.boxOfFruits.add(new Apple(1.1));

        Box<Orange> boxOfOranges = new Box();
        boxOfOranges.boxOfFruits.add(new Orange(1.0));
        boxOfOranges.boxOfFruits.add(new Orange(1.1));

        Box<Orange> boxOfOranges2 = new Box();
        boxOfOranges2.boxOfFruits.add(new Orange(1.0));
        boxOfOranges2.boxOfFruits.add(new Orange(1.7));
        boxOfOranges2.boxOfFruits.add(new Orange(1.0));

        System.out.println(boxOfApples.getWeight());
        System.out.println(boxOfOranges2.getWeight());
        System.out.println(boxOfApples.boxCompare(boxOfOranges2));
        System.out.println(boxOfOranges.getWeight() + " " + boxOfOranges2.getWeight());
        boxOfOranges2.fruitMoving(boxOfOranges);
        System.out.println(boxOfOranges.getWeight() + " " + boxOfOranges2.getWeight());


    }
}

