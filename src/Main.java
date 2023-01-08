import java.util.Scanner;

public class Main {
    static boolean isPrime(int num, int divisor){
if (num <= 2){
    return (num==2)?true: false;
}
if (num%divisor==0){
    return false;
}
if(divisor*divisor>num)
    return true;
return isPrime(num,divisor + 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("sayı giriniz ");
            int x = scan.nextInt();

            if (isPrime(x, 2)) {
                System.out.println(x + " number is prime");
            } else {
                System.out.println(x + " number is not prime");
            }
        }
    }
}