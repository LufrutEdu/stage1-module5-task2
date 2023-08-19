package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return x -> {
            List<Integer> out = new ArrayList<>();
           for (int item:
                x) {
                out.add(item / divider);
           }
           return out;
       };

    }
}
