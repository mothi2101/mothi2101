package java;
public class leapyear {
    public static void main(String[] args) {
        int year = 2000;
        if (year % 4 == 0) {
            if (year % 100 == 0)// check century or not
            {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap year");
                } else
                    System.out.println(" not a leap year");
            } else
                System.out.println(" not a leap year");
        } else
            System.out.println(" not a leap year");
    }
}
