/**
 *
 * 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
 *
 * @author SlViKo(Кобозев Вячеслав)
 * @version date 18/02/2020
 */
package LessonOne.TaskOne;

public class SwapTwoElementInArray {

    public static void main(String[] args) {

        Cat[] arrayCats = new Cat[] {
                new Cat("Barsik", 3),
                new Cat("Kyzina", 5),
                new Cat("Belish", 10)
        };

        Print(arrayCats);
        SwapElement(arrayCats, 0, 2);
        System.out.println("После смены элементов массива");
        Print(arrayCats);


    }

    /**
     * Метод для смены элементов в массиви с любыми ссылочными типами
     * @param array
     * @param indexFirstElement
     * @param indexSecondElement
     * @param <T>
     */
    private static <T> void SwapElement(T[] array, int indexFirstElement, int indexSecondElement) {
            if(indexFirstElement >= 0 && indexFirstElement <= array.length && indexSecondElement >=0 && indexSecondElement <= array.length) {
                T element = array[indexFirstElement];
                array[indexFirstElement] = array[indexSecondElement];
                array[indexSecondElement] = element;
            } else {
                System.out.println("Элементов по данному индексу не существует");
            }
    }

    /**
     * Вывод на печать элементов массива с любыми ссылочными типами
     * @param array
     * @param <T>
     */
    private static <T> void Print(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " " +  array[i]);
        }
    }
}
