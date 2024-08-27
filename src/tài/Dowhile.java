
import java.util.Scanner;


public class Dowhile {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        String phrase;
        do {
            System.out.println("Nhap mat khau de dang nhap: ");
            phrase = scanner.next();
        } while (!phrase.equals("DuyTan"));
        {
            System.out.println(phrase);
        }
    }
    }
    

