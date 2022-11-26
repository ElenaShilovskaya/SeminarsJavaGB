package lesson6;

import java.util.HashSet;
import java.util.Set;

public class Cat {
    private int id;
    private String name;
    private int age;
    private String color;
    private String mastersName;

    @Override
    public String toString() {
        return String.format("id: %d name: %s, age: %d, color: %s, mastersName: %s", id, name, age, color, mastersName);
    }

    public boolean equals(Object o) {
        Cat c = (Cat) o;
        return id == c.id && name == c.name &&
            age == c.age && color == c.color &&
            mastersName == c.mastersName;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.id = 1;
        cat1.name = "Murzik";
        cat1.age = 5;
        cat1.color = "white";
        cat1.mastersName = "Olga";

        Cat cat2 = new Cat();
        cat2.id = 2;
        cat2.name = "Barsik";
        cat2.age = 3;
        cat2.color = "gray";
        cat2.mastersName = "Semen";

        Cat cat3 = new Cat();
        cat3.id = 2;
        cat3.name = "Barsik";
        cat3.age = 3;
        cat3.color = "gray";
        cat3.mastersName = "Semen";

        Cat cat4 = new Cat();
        cat4.id = 4;
        cat4.name = "Sirius";
        cat4.age = 10;
        cat4.color = "black";
        cat4.mastersName = "Igor";

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        System.out.println("Cat1 = " + cat1);
        cats.add(cat2);
        System.out.println("Cat2 = " + cat2);
        cats.add(cat3);
        System.out.println("Cat3 = " + cat3);
        cats.add(cat4);
        System.out.println("Cat4 = " + cat4);

        int countCat = 1;
        for (Cat cat : cats)
        {
            System.out.println("CatInCats" + countCat + ": " + cat);
            countCat++;
        }

        System.out.println(cat2 == cat3);
        System.out.println(cat2.equals(cat3));
        System.out.println(cats.contains(cat3));
        System.out.println(cats.contains(cat4));
    }
}