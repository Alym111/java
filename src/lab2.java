import java.util.Arrays;
import java.util.Scanner;

public class lab2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите числа через пробел:");
        String input = scan.nextLine(); // Считываем строку

        String[] parts = input.split(" "); // Разделяем по пробелу
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]); // Преобразуем строки в числа
        }
        int sum=0;
        for (int num:arr){
            sum+=num;
        }
        System.out.println("Summa"+sum);
        double avg= (double) sum /arr.length;
        System.out.println("average: "+avg);
        int min=arr[0];
        int max=arr[0];
         
        for (int num:arr){
            if (num<min) min=num;
            if (num>max) max=num;
        }
        System.out.println("min: "+min+" max: "+max);
        Arrays.sort(arr);
        int min2=arr[1];
        int max2=arr[arr.length-2];
        System.out.println("predposledniy"+min2);
        System.out.println("2 po velichine"+max2);
    }
}