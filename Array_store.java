
public class Array_store {

	private String[] array_store = new String[100];
	void setArray(String a,int index)
	{
		array_store[index]=a;
		
	}
	public void printReverseArray(int upperBound)
	{
		int counter;
		for(counter=upperBound;counter>=0;counter--)
		{
			System.out.println(array_store[counter]);
		}
	}


}
