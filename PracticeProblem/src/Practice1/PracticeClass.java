package Practice1;

public class PracticeClass {
	
public static void main(String[] args) {
		
		int count = 0 ;
		String name = "I LOVE MY COUNTRY India";
		char a = 'O';
		for(int i = 0; i<name.length();i++)
		{
			if(a==name.charAt(i))
			{
				count++;
				
			}
			
		}
		System.out.println("Frequency of Alphabet is :"+count);
	}

}


