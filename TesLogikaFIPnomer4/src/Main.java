import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//Muhammad Eril Fario
//Nomor 4

public class Main {

	Scanner sc = new Scanner(System.in);
	
	public Main() {

		Integer output = 0;
		Integer size = 0;
		System.out.println("Masukkan ukuran array");
		size = sc.nextInt();sc.nextLine();
		Integer[] array = new Integer[size];
		for(int i = 0;i< size; i++) {
			array [i] = sc.nextInt();
		}
		
		
		Arrays.sort(array);
		
		for(int i = 0;i< size; i++) {
			if(array[i+1] - array[i] > 1) {
				output = array[i] + 1;
				break;
			}
		}
		
		System.out.print("Output: " + output);
		 
	}

	public static void main(String[] args) {
		new Main();
	}

}
