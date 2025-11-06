package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal() {}

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() { return family; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean getIsMammal() { return isMammal; }

    public void setFamily(String family) { this.family = family; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setIsMammal(boolean isMammal) { this.isMammal = isMammal; }

    @Override
    public String toString() {
        return "Family: " + family + ", Name: " + name + ", Age: " + age + ", Mammal: " + isMammal;
    }
}