public class Cats extends Animal {
    public Cats(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " is a cat and cats can't swim");
    }

    @Override
    public void run(int distance) {

        if (distance > 200) {
            System.out.println(name + " can't run more than 200m");
        } else {
            System.out.println( name +" ran " + distance + " m");
        }

    }

    @Override
    public void jumpHight(double hight) {

        if (hight > 2) {
            System.out.println("Cats can't jump more than 2m high");

        }else {
            System.out.println(name + " jumped " + hight + "m");
        }
    }


}
