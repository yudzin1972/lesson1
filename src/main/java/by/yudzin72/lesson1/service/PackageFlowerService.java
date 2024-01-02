package by.yudzin72.lesson1.service;

import by.yudzin72.lesson1.model.abstracted.Flower;
import by.yudzin72.lesson1.pack.PackageFlower;

import java.util.List;

public interface PackageFlowerService {
    Double getPackageFlowerPrice(PackageFlower packageFlower);

    List<Flower> getSortedListByLevelFresh(PackageFlower packageFlower);

    List<Flower> getFlowerLengthBetween(PackageFlower packageFlower, Double len1, Double len2);
}
