import java.util.Arrays;

 
public class AlphaOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java programs";
		System.out.println("1 ) original string : "+s);
		System.out.println("2 ) length of string is   :  "+s.length());
		char c[] = s.toCharArray();
				
		/*Arrays.sort(c);int a = 'j';
		System.out.println(a);
		System.out.println("using sort() :  ");
		System.out.println(c);*/
		
		// Ascii value of j = 106 ,  a = 97 ,  v = 118
		char temp = ' ';
		for(int i=0 ;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					temp = c[i];
					c[i] = c[j] ;
					c[j] = temp;
				}
			}
		}
		System.out.println("3 ) using loop : in alphabetical order ");
		for(int k=0;k<c.length;k++)
		{
			System.out.print( c[k]);

		}
		System.out.println();

	}
	}