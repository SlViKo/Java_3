/**
 *
 * 2. Написать метод, который преобразует массив в ArrayList;
 *
 * @author SlViKo(Кобозев Вячеслав)
 * @version date 18/02/2020
 */
package LessonOne.TaskTwo;

import LessonOne.TaskOne.Cat;

import java.util.ArrayList;

public class ConvertArrayToList {
    public static void main(String[] args) {

        Cat[] arrayCats = new Cat[] {
                new Cat("Barsik", 3),
                new Cat("Kyzina", 5),
                new Cat("Belish", 10)
        };

        // Перевод с помощью не статических методов
        LotsOfThings<?> cats = new LotsOfThings<>(arrayCats);
        ArrayList<?> arrayList = cats.getArrayList();
        System.out.println("С помощью не статических методов:");
        System.out.println(arrayList);

        // Перевод с помощью статических методов
        ArrayList<?> arrayListWithStaticMethod = convertArray(arrayCats);
        System.out.println("С помощью статических методов");
        System.out.println(arrayListWithStaticMethod);
    }

    /**
     * Статических метод перевода элементов массива в коллекцию
     * @param array
     * @param <T>
     * @return
     */
    public static <T> ArrayList<T> convertArray(T[] array) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }
}
