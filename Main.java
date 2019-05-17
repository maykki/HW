public class Main {

    public static void main(String[] args) {
        Staff staff = new Staff("Pypkin", "Eng", "pypkin@pup.ru", 557664, 1000, 45);

        staff.printStaff();



        Staff [] staffArray = new Staff[5];
        staffArray [0] = new Staff("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
        staffArray [1] = new Staff("Ivanov Semen", " mid Engineer", "ivsemen@mailbox.com", 892312313, 40000, 28);
        staffArray [2] = new Staff("Ivanov Andrey", " sen Engineer", "ivandrey@mailbox.com", 892312314, 50000, 49);
        staffArray [3] = new Staff("Ivanov Sergaey", " mid Engineer", "ivsergey@mailbox.com", 892312315, 40000, 35);
        staffArray [4] = new Staff("Ivanov Evgeniy", "jun Engineer", "ivevgeniy@mailbox.com", 892312316, 20000, 23);

        for (int i = 0; i < staffArray.length ; i++) {

            if (staffArray[i].getAge() > 40 ) {
                staffArray[i].printStaff();

            }


        }

    }







}
