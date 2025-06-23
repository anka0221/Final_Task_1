import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите длину забора (в сантиметрах): ");

        Scanner scanner = new Scanner(System.in);
        double fenceLength = scanner.nextDouble();

        if (((double) 15 * 62 /3) + (3 * 12) > fenceLength)
            System.out.println("Надпись не поместится на забор!");
        else System.out.println("Надпись поместится на забор.");
    }
}
