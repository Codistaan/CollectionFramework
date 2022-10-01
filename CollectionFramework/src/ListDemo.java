import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

//		//Creating a List of type String using ArrayList  
		List<String> list=new ArrayList<String>();  //dynamic polymorphism
//		  
//		//Creating a List of type Integer using ArrayList  
		List<Integer> list1=new ArrayList<Integer>();  
//		  		
//		//Creating a List of type Book using ArrayList  
			List<Book> list2=new ArrayList<Book>();  
//		  
//		//Creating a List of type String using LinkedList  
			List<String> list3=new LinkedList();  

		
		//Creating a List  
		 ArrayList<String> list4=new ArrayList<String>(); 
		 
		 //Adding elements in the List  
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");  
		 //Iterating the List element using for-each loop   
		  System.out.println(list);  
		  
		} 
	
	
	//wap to add and print element in LinkedList.

}
