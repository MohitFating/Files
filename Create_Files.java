package FileInputOutput;

import java.util.*;
import java.io.*;

public class Create_Files {

	public static void main(String[] args) {
		
		File file = new File ("mohit_txtFile.txt");
		try {
			boolean value = file.createNewFile();
			if(value)
			{
				System.out.println("The new file is created.");
			}
			else
			{
				System.out.println("The file already exist.");
			}
		}
		
		catch(Exception e)
		{
			e.getStackTrace();
		}

	}

}
