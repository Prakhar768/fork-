package day4_nestedLoop_Strings;
//wap to print table of number between 2 to 8 
public class TableRange {

	public static void main(String[] args) {

		int n;
		
		for(n=2 ;n<=8;n++)
		{
		for(int i=1;i<=10;i++)	
			System.out.print("  "+ n*i);
       
		  System.out.println();
		}
	}

}
