package com.jpagny.ntohcw.constant;

public enum Level {

    EASY("EASY"),
    MEDIUM("MEDIUM"),
    HARD("HARD"),
    VERY_HARD("VERY HARD");

    private final String name;


    private Level(String value) {
        this.name = value;
    }

    public String value() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }

}
