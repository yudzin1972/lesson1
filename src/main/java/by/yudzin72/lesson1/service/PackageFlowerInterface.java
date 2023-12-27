package by.yudzin72.lesson1.service;

import by.yudzin72.lesson1.model.abstracted.Flower;

import java.util.List;

public interface PackageFlowerInterface {
    Double getPackageFlowerPrice();

    List<Flower> getSortedListByLevelFresh();

    List<Flower> getFlowerLengthBetween(Double len1, Double len2);
}
