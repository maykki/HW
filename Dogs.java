public class Dogs extends Animal {

    public Dogs(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Dogs can't swim more than 10m");
        } else {
            System.out.println(name + "swam " + distance);
        }
    }

    @Override
    public void run(int distance) {

        if (distance > 500) {
            System.out.println("Dogs can't run more than 500m");
        } else {
            System.out.println(name + "ran " + distance);
        }

    }

    @Override
    public void jumpHight(double hight) {

        if (hight > 0.5) {
            System.out.println(name + " can't jump more than " + hight + " m high");

        }else {
            System.out.println(name + " jumped " + hight + "m");
        }
    }



}
