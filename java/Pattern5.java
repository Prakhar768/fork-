package day4_nestedLoop_Strings;
/*
 *    ABCDE
 *    ABCD
 *    ABC
 *    AB
 *    A
 */
public class Pattern5 {

	public static void main(String[] args) {

        char k='A';
		for(int i=1;i<=5;i++)
		{  
			k='A';
			for(int j=5;j>=i;j--)
			{
				System.out.print(k++);  
			}
			System.out.println();
		}

	}

}
