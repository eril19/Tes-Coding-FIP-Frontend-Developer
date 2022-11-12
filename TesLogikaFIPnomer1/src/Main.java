import java.util.Scanner;
import java.util.Vector;

//Muhammad Eril Fario
//Nomor 1

public class Main {	
	Scanner sc = new Scanner(System.in);
	Vector<String> array = new Vector<>();
	
	public Main() {
		Integer N;
		
		System.out.print("Masukkan N: ");
		N = sc.nextInt(); sc.nextLine();

		printNumbers(N);
	}

	public void printNumbers(Integer N) {
		
		Integer i = 0;
		Integer j = 1;
		
		while(i<N) {
			
			if(j%3 == 0 || j%7 == 0) {	
				
				if(j%3 == 0 && j%7==0) {
					array.add("z");	
					i++;
				}
				else {
					array.add(j.toString());
					i++;					
				}
			}
			
				j++;
		}
		
		for(int k = 0; k<array.size(); k++) {
			if(k == array.size()-1) {
				System.out.print(array.get(k)+ " ");
			}else {
				System.out.print(array.get(k)+ ", ");	
			}
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
