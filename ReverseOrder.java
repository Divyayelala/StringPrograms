
public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java programming language";
		System.out.println(" original string : "+s);
		String rev = "";
		for(int i=0;i<s.length();i++)
		{
			rev = s.charAt(i) + rev;
		}
		System.out.println(" using loop1  :      " +rev);
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(" using loop2 :      " +rev);
		
		if(s.compareTo(rev) == 0)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");

		}

		StringBuffer sb = new StringBuffer(s);

		System.out.println(" using reverse()  : "+	sb.reverse());
			System.out.println(" using reverse()& toString() : " + sb.reverse().toString());
	}

}
