import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        while(true)
        {
            int n = rand.nextInt(100);
            System.out.println("Podaj Liczbę od 0 do 100");
            int counter =0;
            while(true)
            {

                int number = 0;
                counter++;
                Scanner s = new Scanner((System.in));
                try
                {
                    number = s.nextInt();
                }
                catch(InputMismatchException e)
                {
                    System.out.println("It's not a number");
                    continue;
                }
                if(number == n)
                {
                    System.out.println("Brawo udało ci się, Liczba prób: " + counter);
                    System.out.println("Czy chesz grać dalej? Y/N");
                    char answer = s.next().charAt(0);
                    if(answer == 'Y' || answer == 'y')
                        break;
                    else
                        return;
                }
                else if(number < n)
                    System.out.println("Podaj większą liczbę");
                else
                    System.out.println("Podaj mniejszą liczbę");
            }
        }


    }
}
