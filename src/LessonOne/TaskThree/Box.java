/**
 *
 * Класс коробки
 *
 * @author SlViKo(Кобозев Вячеслав)
 * @version date 18/02/2020
 */
package LessonOne.TaskThree;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private final float WEIGHTBOX = 0f;
    private ArrayList<T> fruits = new ArrayList<>();
    private String name;

    public Box(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Добавление фрукта в коробку
     * @param fruit
     */
    public void addFruit(Fruit fruit) {
        if (!fruits.isEmpty()) {
            if (isAddFruit(fruit)) {
                fruits.add((T) fruit);
            } else {
                System.out.println("Фрукт(ы) не добавлены в коробку " + this.getName() +
                        "\nВ коробку с типом фруктов " + fruits.get(0).getName() +
                        " нельзя положить фрукты типа " + fruit.getName());
                return;
            }
        } else {
            fruits.add((T) fruit);
        }
        System.out.println("Фрукт(ы) добавлены в коробку " + this.getName());

    }

    /**
     * Проверка, что фрукт соответствует типу коробки
     * @param fruit
     * @return
     */
    private boolean isAddFruit(Fruit fruit) {
        return (fruits.get(0).getName().equals(fruit.getName())) ? true : false;
    }

    /**
     * удаление определенного количества фруктов из коробки
     * @param count
     */
    private void removeFruit(int count) {
        if (!fruits.isEmpty()) {
            if (fruits.size() < count) {
                System.out.println("Из коробки " + this.name + " забрали " + count + " фрукта(ов) с типом " + fruits.get(0).getName());
                for (int i = 0; i < count; i++) {
                    fruits.remove(fruits.size() - 1);
                }
            } else {
                System.out.println("Из коробки " + this.name + " забрали " + fruits.size() + " фрукта(ов) с типом " + fruits.get(0).getName());
                fruits.clear();
            }

        }
    }

    /**
     * Метод пересыпки фруктов из одной коробки в другую
     * @param box
     */
    public void pourFruits(Box box) {
        if (!this.fruits.isEmpty()) {
            if(box.isAddFruit(this.fruits.get(0))) {
                System.out.println("В коробку " + box.getName() + " добавлено " + fruits.size() + " фруктов типа " + this.fruits.get(0).getName());
                for (int i = 0; i < fruits.size(); i++) {
                    box.addFruit(fruits.get(i));
                }
                this.removeFruit(fruits.size());
            } else {
                System.out.println("Фрукты не добавлены в коробку  " + box.getName());
            }
        } else {
            System.out.println("Коробка  " + this.getName() + " пустая");
        }
    }

    /**
     * расчет веса коробки плюс вес фруктов
     * @return
     */
    public float getWeight() {
        float totalWeight = WEIGHTBOX;
        if (!fruits.isEmpty()) {
            for (int i = 0; i < fruits.size(); i++) {
                totalWeight += fruits.get(i).getWeight();
            }
        }
        return totalWeight;
    }

    /**
     * сравнение двух коробок по вес
     * @param box
     * @return
     */
    public boolean compare(Box box) {
        return (box.getWeight() == this.getWeight()) ? true : false;
    }
}
