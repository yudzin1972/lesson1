package by.yudzin72.lesson1.service.impl;

import by.yudzin72.lesson1.model.abstracted.Flower;
import by.yudzin72.lesson1.pack.PackageFlower;
import by.yudzin72.lesson1.service.PackageFlowerService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PackageFlowerServiceImpl implements PackageFlowerService {

    public Double getPackageFlowerPrice(PackageFlower packageFlower) {
        return packageFlower.stream().mapToDouble(Flower::getPrice).sum();

    }

    public List<Flower> getSortedListByLevelFresh(PackageFlower packageFlower) {
        return packageFlower.stream().sorted(Comparator.comparingInt(Flower::getLevelGresh).reversed()).collect(Collectors.toList());
    }

    public List<Flower> getFlowerLengthBetween(PackageFlower packageFlower, Double len1, Double len2) {
        return packageFlower.stream().filter(e -> e.getLenStem() > len1 && e.getLenStem() < len2).collect(Collectors.toList());
    }
}
