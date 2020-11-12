import java.util.Scanner;

class ShortCircuit {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
         
        int y = scan.nextInt();

        if ( y < 0 || y > 100)
        {
            System.out.println( "Not a valid grade.");
        }

    }
}