
public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java programming language java";
		System.out.println(" original string : "+s);
		int count = 1;

				for(int j=0;j<=s.length()-1;j++)
				{
					if(s.charAt(j) == ' ' && s.charAt(j+1)!= ' ')
					{
						count++;
					}
				}
				System.out.println(" no of words are :  "+count);
				
				String s1[] = s.split(" ");
				for(int i=0;i<s1.length;i++)
				System.out.println("a[ " + i + "]  = " + s1[i]);
				
				
				
	}

}
