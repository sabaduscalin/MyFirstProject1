package lab5.animalRescuer;
public class AppMain {
    public static void main(String[] args) {
        Animal myAnima = new Animal();
        myAnima.Sound();
        myAnima.Rase();
        Animal myDog = new Dog();
        myDog.Rase();
        Human myAdopter = new Adopter();
        myAdopter.humanName();
        myAdopter.buget();
        Human myBoy= new Boy();
        myBoy.humanName();
        myBoy.buget();
        Habit myRecreation= new Recreation();
        myRecreation.run();
    }
}
