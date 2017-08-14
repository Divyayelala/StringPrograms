
public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java programming language";
		System.out.println("1 ) original string : "+s);

		System.out.println("2 ) with replace method : "+s.replace(" ", ""));
		System.out.println("3 ) with replaceAll method : " + s.replaceAll(" ", ""));
		
		StringBuffer sb = new StringBuffer();
		char[] c1 = s.toCharArray();
		/*for(int i = 0 ;i<c1.length;i++)
		{
			System.out.print(c1[i] + " ");
		}
		System.out.println();
		*/
		
		for(int i = 0 ;i<c1.length;i++)
		{
			if((c1[i] != ' ') && ( c1[i] != '\t') )
			{
				sb.append(c1[i]);	
			}
		}		System.out.println("4 ) using Stringbuffer and append()   : "+sb);

		

	}

}
