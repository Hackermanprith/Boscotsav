import java.util.Scanner;

public class Halistone_number_sequence {
    public static void halistone_number_finder(int halis_number){
        if(halis_number == 1){
            System.out.print(1);

        }
        else if(halis_number < 0){
            System.out.println("The no is a negetive whole number");
        }
        if(halis_number %2 == 0){
            System.out.print(halis_number + ">");
            halistone_number_finder((halis_number)/2);
        } else if(halis_number %2 != 0 && halis_number !=1){
            System.out.print(halis_number+">");
            halistone_number_finder((halis_number*3)+1);

        }

    }
    public static int Takeinp(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a halistone no ");
        int halistone_number = sc.nextInt();
        return halistone_number;
    }
    public static void main(String[]args){

        try {
            int hailstone_number = Takeinp();
            halistone_number_finder(hailstone_number);

        }
        catch (Exception e){
            System.out.println(e);
            while(e != null){
                try {
                    int hailstone_number = Takeinp();
                    halistone_number_finder(hailstone_number);
                    e = null;
                }
                catch (Exception j){
                    System.out.println(j);
                }

            }


        }



    }
}
