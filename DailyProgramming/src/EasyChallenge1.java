import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class EasyChallenge1 {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String name = null;
		System.out.println("Please enter your name: ");
		try {
			name = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int age = 0;
		System.out.println("Please enter your age: ");
		try {
			age = Integer.parseInt(reader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String username = null;
		System.out.println("Please enter your Reddit username: ");
		try {
			username = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Your name is " + name + ", you are " + age + " years old, and your username is " + username + ".");
		
		BufferedWriter output = null;
		try{
			File file = new File("EasyChallenge1.txt");
			output = new BufferedWriter(new FileWriter(file));
			output.write("Name: " + name);
			output.newLine();
			output.write("Age: " + Integer.toString(age));
			output.newLine();
			output.write("Username: " + username);
		}
		catch (IOException e){
			e.printStackTrace();
		}
		finally{
			if(output != null)
				try {
					output.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
}
