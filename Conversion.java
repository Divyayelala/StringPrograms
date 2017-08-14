import java.util.Arrays;


public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 65;
		char alpha = (char) (a);
		System.out.println("1 ) Acii value of "+ a + "  is ----" +alpha);

		char x = 'T';
		int integ = x;
		System.out.println("2 ) integer value of "+x + " is ---- " +integ);

		String s1 = "1234";
		char c1[] = s1.toCharArray();
		System.out.println("3 ) using arrays method ---- " + Arrays.toString(c1));

		for(int i = 0;i<s1.length();i++)
		{
			System.out.println(" a [ "+i + "] " + "= "+  s1.charAt(i));
		}
		
		for(int i = 0;i<c1.length;i++)
		{
			System.out.println(" a [ "+i + "] " + "= "+  c1[i]);
		}
		
		char c2[] = {'b','h',' ','a','s','k','a','r'};
		String s2 = c2.toString();
		System.out.println("4 ) using valueOf method ---- "+String.valueOf(c2));	
		String s3 = new String(c2);
		System.out.println("5 ) using new string  ---- "+s3);
		System.out.println("6 ) using copyValueOf method ---- "+String.copyValueOf(c2));

		String s4 = "10";
		int n = Integer.parseInt(s4);
		System.out.println("7 ) using integer.parseint method ---- "+n);
		Integer n2 = Integer.valueOf(s4);
		System.out.println("8 ) using integer.valueOf method ---- "+ n2);

	}

}
