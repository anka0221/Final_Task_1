import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int userScore = 0;
        int computerScore = 0;
        String userValue;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Раунд " + i);

            while (true) {
                System.out.print("Введите одно из значений: К - камень, Н - ножницы, Б - бумага: ");
                Scanner scanner = new Scanner(System.in);
                userValue = scanner.nextLine();
                System.out.print("Значение пользователя: " + userValue);

                if (userValue.equals("К") || userValue.equals("Н") || userValue.equals("Б"))
                    break;
                System.out.println("\nНеккоректный ввод! Попробуйте еще раз. ");
            }

            Random random = new Random();
            int computerIntValue = random.nextInt(3) + 1;
            String computerValue;
            if (computerIntValue == 1) computerValue = "К";
            else if (computerIntValue == 2) computerValue = "Н";
            else computerValue = "Б";
            System.out.println(". Значение компьютера: " + computerValue);

            // Камень (К) ломает ножницы (Н)
            if (userValue.equals("К") && computerValue.equals("Н")) {
                userScore = userScore + 1;
                System.out.println("Выиграл пользователь. +1");
            } else if (computerValue.equals("К") && userValue.equals("Н")) {
                computerScore = computerScore + 1;
                System.out.println("Выиграл компьютер. +1");
            }

            // Ножницы (Н) режут бумагу (Б)
            else if (userValue.equals("Н") && computerValue.equals("Б")) {
                userScore = userScore + 2;
                System.out.println("Выиграл пользователь. +2");
            } else if (computerValue.equals("Н") && userValue.equals("Б")) {
                computerScore = computerScore + 2;
                System.out.println("Выиграл компьютер. +2");
            }

            // Бумага (Б) заворачивает камень (К)
            else if (userValue.equals("Б") && computerValue.equals("К")) {
                userScore = userScore + 5;
                System.out.println("Выиграл пользователь. +5");
            } else if (computerValue.equals("Б") && userValue.equals("К")) {
                computerScore = computerScore + 5;
                System.out.println("Выиграл компьютер. +5");
            } else System.out.println("Ничья");

        }
        System.out.println("Итоговый счёт: " +
                "\n\t Количество очков юзера: " + userScore +
                "\n\t Количество очков компьютера: " + computerScore);
        if (userScore > computerScore) System.out.println("Победу одержал юзер");
        else if (computerScore > userScore) System.out.println("Победу одержал компьютер");
        else System.out.println("Ничья");
    }
}

