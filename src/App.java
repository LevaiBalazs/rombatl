// A program a rombusz területét hivaott kiszámítani, a felhasználó által megadott átlókkal
//Lévai Balázs István
//2024-09-30
//SZOFT II/1/N

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Rombusz területe számítás ");
        System.out.println("Lévai Balázs István, SZOFT II/1/N");

        Rombusz rombusz = new Rombusz();
        rombusz.inPut();
        System.out.println("A rombusz területe: " + rombusz.calcArea());
    }
}
