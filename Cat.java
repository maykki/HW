public class Cat {
    private  String name ;
    private boolean satiety = false;
    private int hungry;
    private Plate plate;

    public Cat(String name, int hungry) {
        this.name = name;
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public boolean eat () {
        int foodInBowl = plate.getFood();
        if (hungry > foodInBowl){
            satiety = false;
        }
        else if (hungry <= foodInBowl){
            plate.setFood(foodInBowl - hungry);
            satiety = true;
        }
        return satiety;
    }

    public Plate getPlate() {
        return plate;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }
}

