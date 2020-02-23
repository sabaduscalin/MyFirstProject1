
    package lab4.animalRescuer;
    public class AppMain {
        public static void main(String[] args) {
            Adopter ado = new Adopter();
            ado.setName("Dan");
            ado.setBuget(100);
            System.out.println(ado.getName());
            System.out.println(ado.getBuget());
            Dog dog = new Dog();
            dog.setName("Zdreanta");
            dog.setAge(2.5f);
            dog.setFavActivity("runn all day");
            dog.setHealty(10);
            dog.setHunger("fish finghers");
            dog.setMood("Happy");
            System.out.println(dog.getAge());
            System.out.println(dog.getFavActivity());
            System.out.println(dog.getName());
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
            Adopter junior = new Adopter();
            junior.setName("Angel");
            junior.setBuget(100);
            System.out.println(junior.getName());
            System.out.println(junior.getBuget() + "$ a day");
            Cat miau = new Cat();
            miau.setName("Diana");
            miau.setFavActivity("sleep all day");
            System.out.println(miau.getName() + " " + miau.getFavActivity());
            Boy child = new Boy();
            child.setBuget(0);
            child.setName("Mitica");
            System.out.println(child.getBuget() + " " + child.getName());
            Dog catel = new Dog();
            catel.setAge(12);
            catel.setName("Azorel");
            System.out.println(catel.getAge());
            System.out.println(catel.getName());
            Human boy = new Human();
            boy.setName("Mario");
            System.out.println();
            Food bread = new Food();
            bread.setPrice(10);
            System.out.println(bread.getPrice());
            Vet dr = new Vet();
            dr.setName("Dr. Smith");
            dr.setSpecialization("vet");
        }
    }


