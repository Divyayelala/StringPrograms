
public class DuplicateChar {

	public static void main(String[] args) {
		// occurance of charcteres 
				String s1 = "java programming language";
				System.out.println("1 ) original string : " + s1);
				char c1[] = s1.toCharArray();
				int count =0 ;
				char c;
				for( c = 'A';c<='z';c++)
				{
					count=0;
					for(int j=0;j<s1.length();j++)
					{
						char ch = s1.charAt(j);
						if(ch == c)
						{
							count ++;
						}
					}
					if(count>0)
					{
						System.out.println( "	" + c + " --------- " + count + " times");
					}
				}
				//---------------------------------------
				System.out.println("2 ) repeated elements are");
				
				
				for(int i=0;i<c1.length;i++)
				{
					for(int j =i+1;j<c1.length;j++)
					{
						if(c1[i] == c1[j])
						{
								System.out.print(c1[i]+"");
						}
					}
				}System.out.println();
				//---------------------------------------
				String s2= "";
				int count1=0;
				for(int i=0; i<s1.length(); i++)
		        {
		            char ch = s1.charAt(i);
		            if(ch!=' ')
		                s2 = s2 + ch;
		            s1 = s1.replace(ch,' '); //Replacing all occurrence of the current character by a space
		        }
		 
		       System.out.println("3 ) Word after removing duplicate characters : " + s2);

		       
		       
		      count1 = count1+1;
		       

       	}

}
