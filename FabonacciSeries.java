import java.util.Scanner;

public class FabonacciSeries {
    public int nthEvenFabonacci(int number){
        System.out.println("Give value of n");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        if (number < 1)
            return number;
        if (number == 1)
            return 2;

        return ((4 * nthEvenFabonacci(number - 1)) + nthEvenFabonacci(number - 2));
    }
}
