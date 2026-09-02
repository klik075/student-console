package com.sparta;

import java.util.Optional;

public class Slot<T> {
    private T item;

    public void put(T item){
        this.item = item;
    }

    public T get(){
        return Optional.ofNullable(item).orElseThrow( () -> new IllegalStateException("빈 칸입니다."));
    }
}
