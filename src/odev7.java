import java.util.Scanner;

public class odev7 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner (System.in);
			
			
		double boy,kilo,indeksi ; 
			
			System.out.print("Boyunuzu Giriniz : ");
			
			boy = inp.nextDouble();
			
			System.out.print("Kilonuzu Giriniz : ");
			
			kilo = inp.nextDouble();
			
			indeksi = kilo/(boy*boy);
			
			System.out.println ("Beden Kitle İndeksiniz = "+ indeksi);
	}
	

}
