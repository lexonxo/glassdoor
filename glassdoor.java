//APCSA Andrew Hardman Period 7
import java.util.*;
public class glassdoor {
    public static void green() throws InterruptedException {
        System.out.println("Enter Green Glass Door:");
        Scanner scanner = new Scanner(System.in);
        String passcode = scanner.nextLine();
        boolean ans = false;
        for (int i = 0; i < passcode.length() - 1; i++) {
            if (passcode.charAt(i) == passcode.charAt(i + 1)) {
                ans = true;
                break;
            }
        }
        if (ans) {
            System.out.println("Green Gate Unlocked.");
            Thread.sleep(1000);
            System.out.println("You Must Now Answer the Security Question");
            Thread.sleep(2000);
            System.out.println("What is the Airspeed Velocity of an Unladen Swallow?");
            String enterB = scanner.nextLine().toLowerCase(Locale.ROOT);
            enterB = enterB.replace("?", "");
            boolean ansB = enterB.equals("african or european");
            if (ansB) {
                System.out.println("Uh.. I don't know that...");
                Thread.sleep(1500);
                System.out.println("You have passed.");
            } else {
                System.out.println("Incorrect.");
            }
        } else
            System.out.println("Incorrect Password");

    }


    public static void main(String[] args) throws InterruptedException {
        green();
    }
}
