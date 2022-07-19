package pratice;
import java.util.*;
public class collectionAssisted {

	public static void main(String[] args) {
		
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("mumbai");//
	      city.add("pune");    	   
	      System.out.println(city);  
		
		
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(20); 
	      vec.addElement(40); 
	      System.out.println(vec);
		
		
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("suresh");  
	      names.add("ramesh");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(145);  
	       set.add(146);  
	       set.add(147);
	       set.add(148);
	       System.out.println(set);
	       
	       
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 
	      }  


}
