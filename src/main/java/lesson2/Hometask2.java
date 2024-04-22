package lesson2;

public class Hometask2 {
    public static void main(String[] args) {
        int[] hometask_numbers = {12, 123, 324, 3, 2, 3, 9, 45, 5, 7, 8, 9, 13, 6, 12, 43, 22, 34, 0, 0};
        System.out.println("TASK 1");
        int sum = 0;
        for (int i = 0; i < hometask_numbers.length; i++) {
            if (hometask_numbers[i] > 5 && hometask_numbers[i] < 45) {
                sum=sum+hometask_numbers[i];
            }
        }
        System.out.println(sum);

        System.out.println("\nTASK 2");
        for (int i = 0; i < hometask_numbers.length; i++) {
            if (hometask_numbers[i] % 2 == 0 && hometask_numbers[i] > 0) {
                System.out.println(hometask_numbers[i]);
            }
        }

    }
}
