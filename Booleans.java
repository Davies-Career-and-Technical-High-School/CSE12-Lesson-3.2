import java.util.Scanner;

class Booleans {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        int grade = scan.nextInt();

        if(grade >= 80 && grade < 90)
        {
            System.out.println("B");
        }

    }
}