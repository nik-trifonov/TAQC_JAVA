import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        /*int[] da = new int[4];
        da[0] = 1;
        da[1] = 2;
        da[2] = 3;
        da[3] = 4;
        int sum = 0;
        for (int i = 0; i < da.length; i++) {
            sum += da[i];
        }

        double mean = sum / da.length;
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
    }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your top five fav foods");

        String[] foods = new String[3];
        for(int i=0; i <foods.length; i++){
            System.out.println("Food " + (i + 1) + ": ");
            foods[i] = scanner.nextLine();
        }
        System.out.println("No more space");
        System.out.println("Your favorite foods are");
        for(int i = 0; i < foods.length; i++){
            System.out.println(" - " + foods[i]);
        }*/

        int[] x = {1,2,3,4};
        int[] y = x;
        int sum=0;
        for(int i = 0; i< x.length;i++) {
            x[2] = 4;
            sum = x[i];
            System.out.println(sum);
        }
        //System.out.println(y[i]);
    }
        public static int add(int a, int b){
            return a + b;
        }

    }


