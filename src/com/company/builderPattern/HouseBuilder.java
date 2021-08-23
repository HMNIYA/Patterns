package com.company.builderPattern;

public class HouseBuilder {
    private final House house = new House();

    private HouseBuilder() {}

    public static HouseBuilder builder(){
        return new HouseBuilder();
    }

    public static House fullBuild(){
        return builder().floor("floor").wall("walls").roof("roof").build();
    }

    public HouseBuilder floor(String value){
        house.setFloor(value);
        return this;
    }

    public HouseBuilder wall(String value){
        house.setWall(value);
        return this;
    }

    public HouseBuilder roof(String value){
        house.setRoof(value);
        return this;
    }

    public House build(){
        return house;
    }

}
