import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, a;
        int c = 0;int n=1;
        num = (int) ((Math.random() * 100) + 1);
        while(n==1) {
            System.out.println("Enter the  number");
            a = sc.nextInt();
            if (num == a) {
                ++c;
                n = 0;
                System.out.println("Guessed and attempt counter =" + c);
            } else if(num>a) {
                System.out.println("number is higer!try again");
                ++c;
            }
            else {
                System.out.println("number is lower!try again");
                ++c;
            }
            }
        }
    }


