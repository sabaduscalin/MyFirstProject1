
    package lab2.animalRescuer;
    public class AppMain {
        public static void main(String[] args) {
            Adopter ado = new Adopter();
            ado.setName("Dan");
            ado.setBuget(100);
            System.out.println(ado.getName());
            System.out.println(ado.getBuget());
            Animal dog = new Animal();
            dog.setName("Zdreanta");
            dog.setAge(2.5f);
            dog.setFavActivity("runn all day");
            dog.setHealty(10);
            dog.setHunger("fish finghers");
            dog.setMood("Happy");
            System.out.println(dog.getAge());
            System.out.println(dog.getFavActivity());
            System.out.println(dog.getName());
            System.out.println(dog.getHelty());
            System.out.println(dog.getHunger());
            Food meat = new Food();
            meat.setName("Beff steack");
            meat.setPrice(55);
            meat.setStock("In stock");
            System.out.println(meat.getName());
            System.out.println(meat.getPrice());
            System.out.println(meat.getStock());
            Recreation pa = new Recreation();
            pa.setRun("My dog loves running");
            System.out.println(pa.getRun());
            Vet v = new Vet();
            v.setName("Dr.Smith");
            v.setSpecialization("General vet");
            System.out.println(v.getName());
            System.out.println(v.getSpecialization());
        }
    }


