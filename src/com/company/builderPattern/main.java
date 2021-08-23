package com.company.builderPattern;

public class main {
    public static void main(String[] args) {
//        House house = new House();
//        house.setFloor("floor");
//        house.setWall("walls");
//        house.setRoof("roof");

        //House house = HouseBuilder.builder().floor("floor").wall("walls").roof("roof").build();
        //HouseBuilder.fullBuild();
        System.out.println(HouseBuilder.fullBuild());

    }
}
