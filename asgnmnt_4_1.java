import java.util.Objects;
import java.util.Scanner;
public class asgnmnt_4_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter elements in the array,enter EOF to end");
		String temp;
		short i = 0;
		Scanner sc = new Scanner(System.in);
		Array_store obj = new Array_store();
		temp=sc.next();
		while(!Objects.equals(temp, "EOF"))
		{
			obj.setArray(temp, i);
			temp=sc.next();
			i++;
		}
		System.out.println("The reverse of the entered array is \n");
		obj.printReverseArray(i-1);
		

	}

}
