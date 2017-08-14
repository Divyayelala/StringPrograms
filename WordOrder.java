
public class WordOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "divya is a good girl";
		String[] s1 = s.split("\\s");
		int i ;
		for(i=0 ; i<s1.length;i++){
		System.out.println(s1[i]);
		char[] ch = s1[i].toCharArray(); 
		}
		char[] c =   new char[s1.length];
		for(i=0 ; i<s1.length;i++)
		{
		c[i] = s.charAt(i);
		System.out.print(c[i] + " ");
		}
		
		System.out.println();
		 char t = ' ';
		 for( i=0;i<c.length;i++)
		 {
		  for(int j=i+1;j<c.length;j++)
		  {
		   if(c[i]>c[j])
		   {
		    t=c[i];
		    c[i]=c[j];
		    c[j]=t;
		   }
		  }
		 }
		 for( i=0;i<c.length;i++)
		 {

		 System.out.print(c[i] + " ");
		 }
	}
	}