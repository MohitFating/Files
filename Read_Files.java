package FileInputOutput;

import java.io.FileReader;

public class Read_Files {

	public static void main(String[] args) {
		
		char [] array = new char[100];
		try {
			FileReader input = new FileReader("mohit_txtFile.txt");
			input.read(array);
			
			System.out.println("data in the file:");
			System.out.println(array);
			input.close();
		}
		catch(Exception e){
			e.getStackTrace();
			}

	}

}
