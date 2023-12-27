package by.yudzin72.lesson1;

import by.yudzin72.lesson1.model.Carnation;
import by.yudzin72.lesson1.model.Lily;
import by.yudzin72.lesson1.service.impl.PackageFlower;
import by.yudzin72.lesson1.model.Rose;

public class Main {
    public static void main(String[] args) {
        PackageFlower packageFlower=new PackageFlower();
        packageFlower.add(new Rose());
        packageFlower.add(new Carnation());
        packageFlower.add(new Lily());

        System.out.println("Цена букета: "+packageFlower.getPackageFlowerPrice());

        System.out.println("Сортировка по уменьшению свежести:");
        packageFlower.getSortedListByLevelFresh().forEach(System.out::println);

        System.out.println("Цветки с заданной длиной стебля:");
        packageFlower.getFlowerLengthBetween(0.25,0.35).forEach(System.out::println);
    }
}