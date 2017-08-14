
public class SplitPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hih how ara you";
		String[] s2 = s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			System.out.println("[" +i +"] " + "= " +s2[i]);

		}
		
		//palindrome in string 
		String temp = "";
		String rev = "";
		
		for(int i=0;i<s2.length;i++)
		{
			temp = s2[i];
			StringBuffer sb = new StringBuffer(temp);
			rev = sb.reverse().toString();
			if(temp.equalsIgnoreCase(rev))
			{
				System.out.println(temp);

			}
		}

	}

}
