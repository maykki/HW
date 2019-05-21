public abstract class Animal {

    String name;
    int distance;
    double hight;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void  run (int distance);
    public abstract void swim (int distance);
    public abstract void jumpHight (double hight);


}
