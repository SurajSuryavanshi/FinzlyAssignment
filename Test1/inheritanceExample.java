
package Test1;
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound(){

    }

    public String getName() {
        return name;
    }
}

class lion extends Animal{

    public lion(String name, int age) {
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Sound of Lion");
    }
}
class Elephant extends Animal{
    public Elephant(String name, int age) {
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Sound of Elephant");
    }
}
class Giraffe extends Animal{
    public Giraffe(String name, int age) {
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Sound of Giraffe");
    }
}
class Zoo{
    private Animal[] animals;
    int count;
    public Zoo(int capacity){
        animals=new Animal[capacity];
        count=0;
    }
    public void addAnimal(Animal animal){
        if(count< animals.length){
            animals[count]=animal;
            count++;
        }
    }
    public void makeAllSound(){
        for(int i=0;i<count;i++){
            System.out.println(animals[i].getName()+":");
            animals[i].makeSound();
        }
    }
}



public class inheritanceExample {
    public static void main(String[] args) {
        Zoo z = new Zoo(3);
        lion King = new lion("King", 5);
        Elephant jambo = new Elephant("jambo", 9);
        Giraffe Pipi = new Giraffe("pipi", 6);
        z.addAnimal(King);
        z.addAnimal(jambo);
        z.addAnimal(Pipi);
        z.makeAllSound();
    }
}
