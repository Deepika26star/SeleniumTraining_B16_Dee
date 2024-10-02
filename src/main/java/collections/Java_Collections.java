package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Java_Collections {
	
	public static void main(String[] args) {
	//	col_list();
		//col_set();
		
	//	col_HashTable();
		
		col_HashMap();
	}
	
	public static void col_list()
	{
		// List is a collection of elements or records
		//Allow duplicates and null as well
		// allows null values
		
		System.out.println(" Col_List ");	
		List <String> studentList = new ArrayList<String>();
		studentList.add("ByMAT");
		studentList.add("Deepika");
		studentList.add("Vishal");
		studentList.add("Ajay");
		studentList.add("Vikram");
		studentList.add("Rani");
		studentList.add("ByMAT");
		studentList.add(" ");
		studentList.add(null);
		
		System.out.println(studentList);	
		System.out.println("  ");	
		System.out.println("new for loop ");
		
		for(String studentListinList : studentList )
		{
			System.out.println(studentListinList);
		}
		
		System.out.println("  ");
		System.out.println("old for loop ");
		for(int i=0; i<studentList.size();i++)
		{
			System.out.println(studentList.get(i));
		}
	}
	
	public static void col_set()
	{
		// Set is a collection of unique records
		//Doesnt Allow duplicates 
		System.out.println("Col_Set  ");	
		Set <String> studentSet = new HashSet<String>();
		studentSet.add("ByMAT");
		studentSet.add("Deepika");
		studentSet.add("Vishal");
		studentSet.add("Ajay");
		studentSet.add("Vikram");
		studentSet.add("Rani");
		studentSet.add("ByMAT"); //over writing...
		studentSet.add(" ");
		studentSet.add(null);
		
		System.out.println(studentSet);	
		System.out.println("  ");	
		System.out.println("new for loop ");
		
		for(String studentListinList : studentSet )
		{
			System.out.println(studentListinList);
		}
		
		/*System.out.println("  ");
		System.out.println("old for loop ");
		for(int i=0; i<studentSet.size();i++)
		{
			System.out.println(studentSet.get(i));
		}*/
		
		// iterator is the best way toget items out of SET
		System.out.println("  ");
		Iterator<String> itr = studentSet.iterator();
		while(itr.hasNext())
		{
			System.out.println("while...." +itr.next());
		}
	}
	
	public static void col_HashTable()
	{
		// Hashtable is a collection of key and values pair records
		// HT doesnt allow null record as Key and value.
		// Allow duplicates but it will over write records at run time.
		// Ht allows unique records
		
		System.out.println("Col_HashTable	  ");	

		Hashtable<String, String> hashT_Students = new Hashtable<>();
		
		hashT_Students.put("Name", "Deepika");
		hashT_Students.put("Mob", "999989898");
		hashT_Students.put("city", "pune");
		hashT_Students.put("city", "punjab"); // over write
		hashT_Students.put("state", "maharashtra"); 
		hashT_Students.put("Name", "Devisha"); // over write
		//hashT_Students.put(null, "Deepika"); not allowed
		//hashT_Students.put("Name", " "); not allowed
		
		System.out.println(hashT_Students);	
		
		System.out.println("hashT_Students , State:  " + hashT_Students.get("state"));	
		//System.out.println("new for loop ");
		
	}
	
	public static void col_HashMap()
	{
		// Hashtable is a collection of key and values pair records
		// HT doesnt allow null record as Key and value.
		// Allow duplicates but it will over write records at run time.
		// Ht allows unique records
		
		System.out.println("Col_HashTable	  ");	

		Hashtable<String, String> hashT_Students = new Hashtable<>();
		
		hashT_Students.put("Name", "Deepika");
		hashT_Students.put("Mob", "999989898");
		hashT_Students.put("city", "pune");
		hashT_Students.put("city", "punjab"); // over write
		hashT_Students.put("state", "maharashtra"); 
		hashT_Students.put("Name", "Devisha"); // over write
		//hashT_Students.put(null, "Deepika"); not allowed
		//hashT_Students.put("Name", " "); not allowed
		
		System.out.println(hashT_Students);	
		
		System.out.println("hashT_Students , State:  " + hashT_Students.get("state"));	
		//System.out.println("new for loop ");
		
	}
}
