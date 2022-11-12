import java.util.Iterator;
import java.util.Scanner;

//Muhammad Eril Fario
//Nomor 5

public class Main {

	Scanner sc = new Scanner(System.in);
	
	public Main() {
	
		Integer N = 0;
		System.out.print("input N: ");
		N = sc.nextInt();sc.nextLine();
		createShape(N);
	}

	private void createShape(Integer N) {
		
		if(N%2 == 0) {
			System.out.println("Angka harus ganjil");
		}else {
			
			for (int i= 0; i<N; i++) {

				for(int j=0;j<N;j++) {
					if(i == 0 || i==N-1 || j==0||j==N-1) {
						System.out.print("X");						
					}
					else if((N-1) - 1 == 1) {
						System.out.print("X");	
					}
					else if(j == (N-1) - i ) {
						System.out.print("X");
					}
					else {
						System.out.print("O");
					}
				}
				System.out.println();
				
			}
			
		}
	}

	public static void main(String[] args) {
		new Main();
	}

}
