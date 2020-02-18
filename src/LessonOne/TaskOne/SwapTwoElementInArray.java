public class SwapTwoElementInArray {

    public static void main(String[] args) {

        Cat[] arrayInt = new Cat[] {
                new Cat("Barsik", 3),
                new Cat("Kyzina", 5),
                new Cat("Belish", 10)
        };

        Print(arrayInt);
        SwapElement(arrayInt, 0, 2);
        System.out.println("После смены элементов массива");
        Print(arrayInt);


    }

    private static <T> void SwapElement(T[] array, int indexFirstElement, int indexSecondElement) {
            if(indexFirstElement >= 0 && indexFirstElement <= array.length && indexSecondElement >=0 && indexSecondElement <= array.length) {
                T element = array[indexFirstElement];
                array[indexFirstElement] = array[indexSecondElement];
                array[indexSecondElement] = element;
            } else {
                System.out.println("Элементов по данному индексу не существует");
            }
    }

    private static <T> void Print(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " " +  array[i]);
        }
    }
}
