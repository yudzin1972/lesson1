package by.yudzin72.lesson1.model;

import by.yudzin72.lesson1.model.abstracted.Flower;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PackageFlower extends ArrayList<Flower> {
    public Double getPackageFlowerPrice() {
        return stream().collect(Collectors.summingDouble(e -> {
            return e.getPrice();
        }));

    }

    public List<Flower> getSortedListByLevelFresh() {
        return stream().sorted(Comparator.comparingInt(Flower::getLevelGresh).reversed()).collect(Collectors.toList());
    }

    public List<Flower> getFlowerLengthBetween(Double len1, Double len2) {
        return stream().filter(e -> {
            return e.getLenStem() > len1 && e.getLenStem() < len2;
        }).collect(Collectors.toList());
    }
}
