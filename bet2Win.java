import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {

        Scanner input;
        double fact = 1.3;
        input = new Scanner(System.in);
        double[] arr = new double[10];
        System.out.println("enter the initial amount: ");
        double initial = input.nextFloat();
        arr[0] = initial;
        int i = 1;
        while (true)
        {
            System.out.println("enter odds: ");
            double odds = input.nextFloat();

            double amount = (fact * odds *initial)/(odds-1);
            double newAm = ((amount)/odds);

            arr[i]  = newAm;
            System.out.println("next ammount"+newAm);
            for (int j = i; j <arr.length ; j++) {

                if(arr[j] < 10 && arr[j] > 0)
                {
                    arr[j] = 10.0;
                }
                initial += arr[j];
            }
            i++;
        }
    }
}
