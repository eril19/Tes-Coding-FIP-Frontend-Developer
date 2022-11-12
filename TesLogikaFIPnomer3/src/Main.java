import java.util.Scanner;

//Muhammad Eril Fario
//Nomor 3

public class Main {

	Scanner sc = new Scanner(System.in);
	
	public Main() {
		
		String username;
		String output;
		
		System.out.print("Masukkan Username: ");
		username = sc.nextLine();
		
		output = checkUsername(username);
		
		System.out.println(output);
		
	}
	
	private String checkUsername(String username) {

		char usernameArray[] = username.toCharArray();
		char character;
		int len = username.length();
		Boolean numFlag = false;
		Boolean lowerFlag = false;
		Boolean upperFlag = false;
		Boolean firstisNum = Character.isDigit(usernameArray[0]);
		
		for(int i = 0; i< len ; i++) {
			
			character = username.charAt(i);
			
			if(Character.isDigit(character)) {
				numFlag = true;
			}
			else if(Character.isUpperCase(character)) {
				upperFlag = true;
			}
			else if(Character.isLowerCase(character)) {
				lowerFlag = true;
			}
		}
		
		if(username.length() < 8) {
			return "Sandi tidak boleh kurang dari 8 karakter!";
		}
		else if(username.length() > 32) {
			return "Sandi tidak boleh lebih dari 32 karakter!";	
		}
		else if(firstisNum) {
			return "Karakter awal tidak boleh angka";
		}
		else if(numFlag == false) {
			return "Sandi harus memiliki angka";
		}
		else if(upperFlag == false || lowerFlag == false) {
			return "Sandi harus memiliki huruf kapital dan huruf kecil";
		}
		else {
			return "Kata sandi valid";
		}
				
	}

	public static void main(String[] args) {
		new Main();
	}

}
