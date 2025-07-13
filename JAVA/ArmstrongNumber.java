import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean armstrong = isArmstrong(num);
        System.out.println(armstrong);

        System.out.println("Enter range: ");
        int range = sc.nextInt();
        int numCount = armstrongNumberCount(range);
        System.out.println(numCount);
    }

    public static int pow(int num, int power){
        int finalNum = 1;
        for (int i = 1; i <= power; i++) {
            finalNum *= num;
        }
        return finalNum;
    }
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numCount = 0;
        int digit = 0;
        int tempNum = num;

        while (tempNum > 0) {
            tempNum /= 10;
            numCount++;
        }

        while (num > 0){
            digit = num % 10;
            sum += pow(digit, numCount);
            num /= 10;
        }

        if (originalNum == sum){
            return true;
        }
        return false;
    }

    public static int armstrongNumberCount(int range){
        int rangeCount = 0;
        for (int i = 1; i <= range ; i++) {
            if(isArmstrong(i)){
                rangeCount++;
            }
        }
        return rangeCount;
    }
}