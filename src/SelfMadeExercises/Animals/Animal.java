package SelfMadeExercises.Animals;

public abstract class Animal {
    private String name, type;
    private char gender;
    private int yearsOld;
    private double purchaseCost;
    private boolean hasOwner;
    private Owner owner;

    // Constructors
    public Animal(){

    }
    public Animal(String name, String type, char gender, int yearsOld, double purchaseCost, boolean hasOwner){
        this.name = name;
        this.type = type;
        this.gender = gender;
        this.yearsOld = yearsOld;
        this.purchaseCost = purchaseCost;
        this.hasOwner = hasOwner;
    }
    public Animal(String name, String type, char gender, int yearsOld, double purchaseCost, boolean hasOwner, Owner owner){
        this.name = name;
        this.type = type;
        this.gender = gender;
        this.yearsOld = yearsOld;
        this.purchaseCost = purchaseCost;
        this.hasOwner = hasOwner;
        if(hasOwner == true){
            this.owner = owner;
        }
    }

    // GS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public int getYear() {
        return yearsOld;
    }
    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
    public double getCost() {
        return purchaseCost;
    }
    public void setCost(double purchaseCost) {
        this.purchaseCost = purchaseCost;
    }
    public Owner getOwner(){
        if(hasOwner == true){
            return owner;
        }
        else {
            return null;
        }
    }

    // Method
    public abstract String toString();
    public abstract String makeSound();
    public abstract String eat();
}
