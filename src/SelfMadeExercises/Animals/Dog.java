package SelfMadeExercises.Animals;

public class Dog extends Animal implements Mammal {
    private String color;
    private double weight;

    // Constructors
    public Dog(){
        super();
    }
    public Dog(String name, String type, char gender, int age, double purchaseCost, boolean hasOwner, String color, double weight){
       super(name, type, gender, age, purchaseCost, hasOwner);
       this.color = color;
       this.weight = weight;
    }
    public Dog(String name, String type, char gender, int age, double purchaseCost, boolean hasOwner, Owner owner, String color, double weight){
       super(name, type, gender, age, purchaseCost, hasOwner, owner);
       this.color = color;
       this.weight = weight;
    }

    // GS
    public void setColor(String color){
        this.color = color;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getColor(){
        return color;
    }
    public double getWeight(){
        return weight;
    }

    // Methods
    @Override
    public String toString(){
        if (super.getOwner() == null){
            return "Dog[type = " + super.getType() + ", name = " + super.getName() + ", gender = " + getGender() +
                    ", age = " + super.getAge() +  ", cost = " + super.getCost() + "]";
        }
        else {
            return "Dog[type = " + super.getType() + ", name = " + super.getName() + ", gender = " + super.getGender() + ", age = "
                    + super.getAge() + ", cost = " + super.getCost() + ", has owner = " + true + ", " + super.getOwner().toString() + "]";
        }
    }
    @Override
    public String makeSound() {
        return "The dog " + super.getName() + " barks";
    }
    @Override
    public String eat() {
        if(super.getGender() == 'f' || super.getGender() == 'F'){
            return "The dog " + super.getName()  + " eats her food";
        }
        else if(super.getGender() == 'm' || super.getGender() == 'M'){
            return "The dog " + super.getName()  + " eats her food";
        }
        else {
            return "The dog " + getName() + ", of unknown gender, eats food";
        }
    }
    @Override
    public boolean produceMilk() {
        return true;
    }
    @Override
    public boolean giveBirth() {
        return true;
    }
    @Override
    public double temperature() {
        System.out.println("This animal can regulate body temperature");
        return 38;
    }
}
