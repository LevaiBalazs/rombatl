import java.util.Scanner;

public class Rombusz {
    
    private double e;
    private double f;
    
    public void inPut() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adja meg az (e) átlót: ");
        e = Double.parseDouble(scanner.nextLine());
    
        System.out.print("Adja meg az (f) átlót: "); 
        f = Double.parseDouble(scanner.nextLine()); 
        scanner.close();
    }

       

    public double calcArea(){
        
        return (e * f) / 2;
    }

}
