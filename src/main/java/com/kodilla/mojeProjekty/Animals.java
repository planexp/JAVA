package com.kodilla.mojeProjekty;

public class Animals {
    String animal = "Lew";
    String animal1 = "Smok";


    public String getAnimal() {
        return animal;
    }
    public void jesc(){

    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getAnimal1() {
        return animal1;
    }

    public void setAnimal1(String animal1) {
        this.animal1 = animal1;
    }

    @Override
    public String toString() {
        return "Pakiet{" +
                "animal='" + animal + '\'' +
                ", animal1='" + animal1 + '\'' +
                '}';
    }
}
class Test {
    public static void main(String[] args) {
        Animals moj = new Animals();
        String animal = moj.getAnimal();
        System.out.println(moj);
    }
}
