public class Staff {
    String fio;
    String position;
    String email;
    int telnumber;
    int salary;
    int age;


    public Staff (String fio, String position, String email, int telnumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.telnumber = telnumber;
        this.salary = salary;
        this.age = age;
    }

    public void printStaff (){
        System.out.println( "Staff " + fio + " " + position + " " + email + " " + telnumber + " " + salary +" " + age );

    }

    public int getAge() {
        return age;
    }
}
