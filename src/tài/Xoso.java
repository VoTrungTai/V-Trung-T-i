
package tài;

import java.util.Random;
import java.util.Scanner;

public class Xoso {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int sotrungthuong = rand.nextInt(100)+1;
        int sodudoan;
        
        
        System.out.println("*Chao mung ban den voi xo so DuyTan*");
        System.out.println("Moi ban doan tu 1-100: ");
        do {
            System.out.println("So ban du doan: ");
            sodudoan = scanner.nextInt();
            if (sodudoan > sotrungthuong) {
                System.out.println("SO BAN DOAN LON HON SO TRUNG THUONG <- ");
            } else if (sodudoan < sotrungthuong) {
                System.out.println("SO BAN DOAN NHO HON SO TRUNG THUONG -> ");
            } else {
                System.out.println("Chuc mung ban! BAN ĐA NHAN DUOC GIAI THUONG ");
            }
        } while (sodudoan != sotrungthuong);

        scanner.close();
        }
    }
    

