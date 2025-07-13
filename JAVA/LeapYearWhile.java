public class LeapYearWhile {
    public static void main(String[] args) {
        int year = 2000;

        System.out.println("Leap years between 2000 and 3000 (while loop):");

        while (year <= 3000) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year);
            }
            year++;
        }
    }
}

