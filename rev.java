import java.io.*;
import java.util.*;
class rev
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
      StringBuffer buffer = new StringBuffer(s);
      buffer.reverse();
      System.out.println(buffer);
	}
}
