/**
 *
 * Класс для перевода массива в список
 *
 * @author SlViKo(Кобозев Вячеслав)
 * @version date 18/02/2020
 */
package LessonOne.TaskTwo;

import java.util.ArrayList;

public class LotsOfThings<T> {
    private T[] array;
    private ArrayList<T> arrayList;

    public LotsOfThings(T[] array) {
        this.array = array;
        arrayList = new ArrayList<>();
    }

    /**
     * Получение из массива коллекции
     * @return
     */
    public ArrayList<T> getArrayList() {
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }

}
