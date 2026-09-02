package com.sparta;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Slot<Integer> potionCount = new Slot<>();

        try {
            potionCount.get();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}