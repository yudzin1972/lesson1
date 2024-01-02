package by.yudzin72.lesson1;

import by.yudzin72.lesson1.model.Carnation;
import by.yudzin72.lesson1.model.Lily;
import by.yudzin72.lesson1.model.Rose;
import by.yudzin72.lesson1.pack.PackageFlower;
import by.yudzin72.lesson1.service.impl.PackageFlowerServiceImpl;

public class Main {
    public static void main(String[] args) {
        PackageFlower packageFlower = new PackageFlower();
        packageFlower.add(new Rose());
        packageFlower.add(new Carnation());
        packageFlower.add(new Lily());

        PackageFlowerServiceImpl packageFlowerService = new PackageFlowerServiceImpl();

        System.out.println("Цена букета: " + packageFlowerService.getPackageFlowerPrice(packageFlower));

        System.out.println("Сортировка по уменьшению свежести:");
        packageFlowerService.getSortedListByLevelFresh(packageFlower).forEach(System.out::println);

        System.out.println("Цветки с заданной длиной стебля:");
        packageFlowerService.getFlowerLengthBetween(packageFlower, 0.25, 0.35).forEach(System.out::println);
    }
}