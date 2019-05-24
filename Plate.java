public class Plate {

    private int vol ;
    private int food;

    public Plate(int vol){
        if (vol <= 0){
            System.out.println("Миска не может быть объемом: " + vol);
            this.vol = 20;
            System.out.println("Взяли стандартную миску объемом " + this.vol);
        }
        else {
            this.vol = vol;
            System.out.println();
            System.out.println("Взяли миску объемом " + vol);
        }
    }

    public Plate(){
        this.vol = 20;
        System.out.println();
        System.out.println("Взяли стандартную миску объемом " + vol);
    }

    public void setVol(int vol){
        this.vol = vol;
    }
    public int getVol(){
        return this.vol;
    }

    public void setFood(int food){
        this.food = food;
    }
    public int getFood(){
        return this.food;
    }

    public void fill(){
        this.food = this.vol;
        System.out.println("Наполнили миску до краев");
    }

}
