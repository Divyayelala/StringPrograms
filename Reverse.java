
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//----each word reversing 
		
				String x = "hi welcome to java";
				String y[] = x.split(" ");
				String z = "";
				for(int i=0;i<y.length;i++)
				{
					String w = y[i];
					String reverseWord = "";
			 		for(int j=w.length()-1;j>=0;j--)
					{
						reverseWord = reverseWord + w.charAt(j);
					}
					z = z+reverseWord+" ";
				}
				System.out.println("1 )" + x);

				System.out.println( z);
				System.out.println();

				
				
			

				//--------------------- preserve space and print string reverse 
				
				
				char c1[] = x.toCharArray();
				char c2[] = new char[c1.length];
				for(int i=0;i<c1.length;i++)
				{
					if(c1[i] == ' ')
					{
						c2[i] = ' ';
					}
				}			int j = c2.length-1;

					for(int i=0;i<c1.length;i++)
					{ 
						if(c1[i] != ' ')
						{
							if(c2[j] == ' ')
							{
							j--;
							}
						c2[j] = c1[i];
						j--;
						}
					}
					System.out.println("2 )" +x);

					System.out.println(String.valueOf(c2));
					System.out.println();

					//----word reverse in string
					String x1 = "hi divya how r u";
					String y1[] = x1.split(" ");
					String s = "";
					for(int i=y1.length-1;i>=0;i--)
					{
						s= s + y1[i] + " ";
					}

					System.out.println("3 )" +x1);
					System.out.println(s); 
					System.out.println();
					

	}

}
