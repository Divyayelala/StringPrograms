
public class CapitalizeWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java programming language";
		System.out.println("1 ) original string : "+s1);
		System.out.println("2 ) spliting the given words----");
		String[] w = s1.split(" ");
		for(int i=0;i<w.length;i++)
		{
		System.out.println("  . "+w[i]);
		}
		int count = 1;
		for(int j=0;j<=s1.length()-1;j++)
		{
			if(s1.charAt(j) == ' ' && s1.charAt(j+1)!= ' ')
			{
				count++;
			}
		}
		System.out.println("3 ) no of words are -----  "+count);
		System.out.println("4 ) Capitalizing first letter of each word -----");
		
		for(int i =0 ;i<w.length;i++)
		{
			String f = w[i].substring(0, 1).toUpperCase() + w[i].substring(1);
			System.out.print( " "+ f + "");
		}
		System.out.println();
		/*
		String s = "";
		for(String w2 : w )
		{
			String first = w2.substring(0, 1);
			System.out.println(first.toUpperCase());

			String after = w2.substring(1);
			s = s+first.toUpperCase()+after+" ";
		}
		System.out.println(s);
		*/

	}

}
