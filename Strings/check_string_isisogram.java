package strings;

import java.io.*;
//for hashmap
import java.util.*;
public class check_string_isisogram {
 static boolean isIsogram(String input)
	{
		//convert string to character
				char[] input_array=input.toCharArray();
				boolean flag=false;
				HashMap<Character, Integer> hm=new HashMap<>();
				for(char a : input_array)
				{
					if(hm.containsKey(a))
					{
						hm.put(a,hm.get(a)+1);
						if(hm.get(a)>1)
						{
							flag=true;
							return flag;
						}
							
					}
					else
						hm.put(a, 1);
				}
		return flag;
		
	}
 	static boolean isIsogram_Set(String input)
 	{
 		boolean flag=false;
 		char input_array[]=input.toCharArray();
 		//
 		Set<Character> set=new HashSet<>();
 		for(Character a:input_array)
 		{
 			set.add(a);
 		}
 		if(input.length()!=set.size())
 			return flag;
 		else
 		{
 			flag=true;
 			return flag;
 		}
 	}
 
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String input=br.readLine().trim();
		
		boolean output=isIsogram_Set(input);
		System.out.println("OUTPUT "+output);
		//print all the elements in the hashmap
		/*for(char i:hm.keySet())
		{
			System.out.println("KEY "+i+" VALUE "+hm.get(i));
		}*/
	}

}
