package com.sparta;

public enum Action {
    ATTACK, DEFEND, HEAL;

    public String message() {
        return switch (this) {
            case ATTACK -> "칼을 휘두릅니다!";
            case DEFEND -> "방패를 들어 올립니다.";
            case HEAL -> "물약을 마십니다.";
        };
    }
}
