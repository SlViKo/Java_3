/**
 *
 * Большая задача:
 * a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
 * b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * c. Для хранения фруктов внутри коробки можете использовать ArrayList;
 * d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
 * e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
 * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
 * g. Не забываем про метод добавления фрукта в коробку.
 *
 * @author SlViKo(Кобозев Вячеслав)
 * @version date 18/02/2020
 */
package LessonOne.TaskThree;

public class TestingBox {
    public static void main(String[] args) {

        Box<?> boxOne = new Box<>("Коробка");
        Box<?> boxTwo = new Box<>("Короб");
        Box<?> boxThree = new Box<>("Коробочка");

        boxOne.addFruit(new Apple());
        boxOne.addFruit(new Apple());
        boxOne.addFruit(new Apple());
        System.out.println("Добавление в коробку с одними фруктами другого фрукта");
        boxOne.addFruit(new Orange());
        System.out.println();
        boxTwo.addFruit(new Orange());
        boxTwo.addFruit(new Orange());
        System.out.println();
        boxThree.addFruit(new Apple());
        boxThree.addFruit(new Apple());
        boxThree.addFruit(new Apple());
        boxThree.addFruit(new Apple());


        System.out.print("Сравнение коробок c c одинаковым весом и разным содержимым " + boxOne.getName()+ " и " + boxTwo.getName() + " : ");
        System.out.println(boxOne.compare(boxTwo)? "Коробки одинакового веса" : "Коробки разного веса");


        System.out.print("Сравнение коробок c c разным весом и одинаковым содержимым" + boxOne.getName()+ " и " + boxThree.getName() + " : ");
        System.out.println(boxOne.compare(boxThree)? "Коробки одинакового веса" : "Коробки разного веса");

        System.out.println();
        System.out.println("Вес коробки: " + boxThree.getName() + " равен " + boxThree.getWeight());

        System.out.println("Попытка пересыпать коробки с разным содержимым");
        boxTwo.pourFruits(boxThree);
        System.out.println("Вес коробки: " + boxThree.getName() + " равен " + boxThree.getWeight());


        System.out.println("Попытка пересыпать коробки с одинаковым содержимым");
        boxOne.pourFruits(boxThree);
        System.out.println("Вес коробки: " + boxThree.getName() + " равен " + boxThree.getWeight());
        System.out.println("Вес коробки: " + boxOne.getName() + " равен " + boxOne.getWeight());

    }
}
