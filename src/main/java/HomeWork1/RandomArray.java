package HomeWork1;
import java.util.Arrays;
import java.util.Random;

public class RandomArray {

        public static void main(String[] args) {
            Random newArray = new Random();
            int arr[] = new int[15];
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = newArray.nextInt(9);
                System.out.println(arr[i]);
                if (arr[i] % 2 == 0) {
                    sum += 1;
                }
            }
            System.out.println("Количество парных чисел в массиве : " + sum);
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
