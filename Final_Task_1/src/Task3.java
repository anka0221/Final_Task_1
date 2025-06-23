import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[]arr = new int[]{1,5,7,3,2,0,4,9,6};

        int max = arr[0];
        int secondMax = arr[0];

        for (int i : arr) {
            if (i > max) max = i;
        }
        for (int i : arr) {
            if (i > secondMax && i < max) secondMax = i;
        }
        System.out.println("Второе по величине максимальное значение: " + secondMax);
    }
}

