package collection;

import org.testng.annotations.Test;

public class Exercise13 {
		
	@Test
	void Stringduplicate()
    {
        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
 
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if( (my_array[i].equals(my_array[j]))  )
                {
                    System.out.println("Duplicate Element is : "+my_array[i]);
                }
            }
        }
    }    


@Test
void Charactersdupicate()
{
	 String str = "Bengaluru";
	  int cnt = 0;
	  char[] inp = str.toCharArray();
	  System.out.println("Duplicate Characters are:");
	  for (int i = 0; i < str.length(); i++) {
	   for (int j = i + 1; j < str.length(); j++) {
	    if (inp[i] == inp[j]) {
	     System.out.println(inp[i]);
	     cnt++;
	     break;
	    }
	   }
	  }
	 }
	}





