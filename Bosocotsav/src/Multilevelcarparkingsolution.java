import java.util.HashMap;
import java.util.Scanner;

public class Multilevelcarparkingsolution {

    public static int Takeintinp(String msg) {
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        int number = 0;
        try{
            number = sc.nextInt();

        }
        catch (Exception e){
            System.out.println("Invalid Input,Try again");
            number = Takeintinp(msg);
        }
        return number;
    }
        public static String Takestrinp (String msg) {
            System.out.println(msg);
            Scanner sc = new Scanner(System.in);
            String text = "";
            try {
                text = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid Input,try again");
                text = Takestrinp(msg);
            }

            return text;
        }


        public static void Display_comands() {
            System.out.println("Your Options are: ");
            System.out.println("0.Exit");
            System.out.println("1.Park a car");
            System.out.println("2.Unpark a car");
            System.out.println("3.Display slot status");
            System.out.println("4.Calculate Remaining Slot");
        }
        public static void multilevelparking ( int x, int y){
            HashMap<Integer, String> s = new HashMap<Integer, String>();
            Scanner sc = new Scanner(System.in);
            int k = 1;
            Display_comands();
            k = sc.nextInt();
            while (k != 0)
                switch (k) {
                    case 1:
                        int pos = Takeintinp("Enter postition to be inserted int");
                        String colour = Takestrinp("Enter colour of car");

                        if (s.size()-1 <= x * y) {
                            s.put(pos, colour);
                            System.out.println("Your car is parked");
                        } else {
                            System.out.println("Parking is full");
                        }
                        Display_comands();
                        k = Takeintinp("Enter your choice");
                        break;

                    case 2:
                        if(s.isEmpty()){
                            System.out.println("The parking lot is empty");
                            Display_comands();
                            k = Takeintinp("Enter Your Choice: ");
                            break;
                        }
                        int car_postition_removal = Takeintinp("Enter the slot no from which the car is to be removed");
                        if (s.containsKey(car_postition_removal)) {
                            s.remove(car_postition_removal);
                        }
                        else {
                            System.out.println("No car is parked at that position");
                        }
                        Display_comands();
                        k = Takeintinp("Enter your choice");
                        break;
                    case 3:
                        System.out.print("[");
                        int i = 0;
                        for (int j : s.keySet()) {
                            System.out.print("(" + j + "," + s.get(j) + "),");
                            i++;

                        }
                        for (int j = 0; j <= (x * y) - i - 1; j++) {
                            System.out.print("( , )");

                        }
                        System.out.println("]");
                        Display_comands();
                        k = Takeintinp("Enter Your Choice: ");
                        break;
                    case 4:
                        int remaining_slots = (x * y) - s.size();
                        System.out.println("Remaining slots are " + remaining_slots);
                        Display_comands();
                        k = Takeintinp("Enter Your Choice: ");
                        break;

                }



        }
    public static void main(String[]args){
        int Parkinglevel1no = Takeintinp("Enter the value of Level of parking slot");
        int Parkinglevel2no = Takeintinp("Enter the no of Level of parking slot");

        multilevelparking(Parkinglevel1no, Parkinglevel2no);

    }
}
