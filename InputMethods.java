import java.io.*;
import java.util.Scanner;
class InputMethods {
		public static void main(String args[]) throws Exception {
		//Command Line Arguments Method
		int i= Integer.parseInt(args[0]);
		System.out.println("The factorial of the no. entered by command line is "+fact(i));
		bufferedReaderInput();
		scannerInput();
		fileInputStreamMethod();
		}
	
	public static int fact(int f) {
	
		int fact=1;
		for(int i=1;i<=f;i++)
		{
			fact=fact*i;

		}
		return fact;
	}
	private static void bufferedReaderInput() throws Exception
		{
			//BufferedReader Method
		InputStreamReader ir = new InputStreamReader(System.in);
		
		BufferedReader b = new BufferedReader(ir);
		
		System.out.println("Please enter the no. for buffered reader method");
		
		String s = b.readLine();
                
		int a= Integer.parseInt(s);
		
		System.out.println("The factorial of the no. entered by buffered reader method is "+fact(a));
		
		}
	private static void scannerInput() throws Exception
		{
			//Scanner Method
		System.out.println("Please enter the no. for scanner method");
		
		Scanner s= new Scanner(System.in);
		
		int j= s.nextInt();
		
		System.out.println("The factorial of the no. entered by Scanner method is "+fact(j));
		}
	private static void fileInputStreamMethod() throws Exception
		{
		FileOutputStream fos = new FileOutputStream("/home/chugh/data.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		int i=12;
		dos.writeInt(i);
		FileInputStream fis = new FileInputStream("/home/chugh/data.txt");
		DataInputStream dis = new DataInputStream(fis);
		int factorial=dis.readInt();
		System.out.println("The factorial of the no. entered by FIS method is "+fact(factorial));
		}
		
}
