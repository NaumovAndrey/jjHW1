package ru.geekbrains.junior.lesson1.hw;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 8, 89, 12, 3, 4, 6, 49, 19, 58);
        System.out.println(list);

        double result = list.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(result);
        // -> 8, 12, 4, 6, 58 = 88 / 5 = 17.6

    }
}
