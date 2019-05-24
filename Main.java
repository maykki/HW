public class Main {

    public static void main(String[] args) {
       Cat cats [] = new Cat[4];
        cats[0] = new Cat("Myrka", 30);
        cats[1] = new Cat("Markiz", 1);
        cats[2] = new Cat("Red", 0);
        cats[3] = new Cat("cherhysh", 2);

        Plate plate = new Plate(30);
        plate.fill();

        for (Cat cat : cats) {

            cat.setPlate(plate);

            boolean satiety = cat.eat();
            System.out.println(satiety);
            if(plate.getFood() == 0) {
                System.out.println("Еда в миске кончилась");
                plate.fill();

            }
        }






    }





}
