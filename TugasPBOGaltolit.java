package tugas.pbo.galtolit;
import java.util.Scanner;
public class TugasPBOGaltolit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int gallons;
        System.out.print("input gallon : ");
        gallons = input.nextInt();
        double liters = gallons * 3.785;
        System.out.println("\nNilai dari liters adalah "+liters);
    }
    
}
