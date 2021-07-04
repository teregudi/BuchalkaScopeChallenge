import java.util.Scanner;

public class Main {

    public static void main(String[] params){

        X x = new X(x());
        x.x();
    }

    public static int x(){
        System.out.print("Please enter a number: ");
        Scanner x = new Scanner(System.in);
        return x.nextInt();
    }
}
