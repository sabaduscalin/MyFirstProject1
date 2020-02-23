package lab2.animalRescuer;
public class Animal {
    private String name;
    private float age;
    private int healty;
    private String hunger;
    private String mood;
    private String favActivity;
    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    public void setAge(float newAge) {
        age = newAge;
    }
    public float getAge() {
        return age;
    }
    public void setHealty(int newHelty) {
        healty = newHelty;
    }
    public int getHelty() {
        return healty;
    }
    public void setHunger(String newHunger) {
        hunger = newHunger;
    }
    public String getHunger() {
        return hunger;
    }
    public void setMood(String newMood) {
        mood = newMood;
    }
    public String getMood() {
        return mood;
    }
    public void setFavActivity(String newFavActivity) {
        favActivity = newFavActivity;
    }
    public String getFavActivity() {
        return favActivity;
    }
}
