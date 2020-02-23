package lab4.animalRescuer;
    public class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
        private String name;
        private float age;
        private int healty;
        private String hunger;
        private String mood;
        private String favActivity;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public float getAge() {
            return age;
        }
        public void setAge(float age) {
            this.age = age;
        }
        public int getHealty() {
            return healty;
        }
        public void setHealty(int healty) {
            this.healty = healty;
        }
        public String getHunger() {
            return hunger;
        }
        public void setHunger(String hunger) {
            this.hunger = hunger;
        }
        public String getMood() {
            return mood;
        }
        public void setMood(String mood) {
            this.mood = mood;
        }
        public String getFavActivity() {
            return favActivity;
        }
        public void setFavActivity(String favActivity) {
            this.favActivity = favActivity;
        }
    }


