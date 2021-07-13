package HashMapCollision;
import java.util.*;

public class HashMap_Collision {

	public static void main(String[] args) {
		
		HashMap<Person, String> map=new HashMap<Person, String>();
		
		 Person p1 = new Person(1,"ABC");
		 Person p2 = new Person(2,"DEF");
		 Person p3 = new Person(1,"XYZ");
		 Person p4 = new Person(1,"PQR");
		 Person p5 = new Person(1,"PQR");
		 System.out.println("Adding Entries ...."); 
		 map.put(p1,"ONE");
		 map.put(p2,"TWO");
		 map.put(p3,"THREE");
		 map.put(p4,"FOUR");
		 map.put(p5,"FIVE");

		 System.out.println("\nComplete Map entries \n" + map);

		/* System.out.println("\nAccessing non-collided key");  
		 System.out.println("Value = "+map.get(p2));
		 System.out.println("\nAccessing collided key");    
		 System.out.println("Value = " + map.get(p1));*/
		 System.out.println("P1 hashcode is:"+map.get(p1).hashCode()+" And value is:"+map.get(p1));
		 System.out.println("P2 hashcode is:"+map.get(p2).hashCode()+" And value is:"+map.get(p2));
		 System.out.println("P3 hashcode is:"+map.get(p3).hashCode()+" And value is:"+map.get(p3));
		 System.out.println("P4 hashcode is:"+map.get(p4).hashCode()+" And value is:"+map.get(p4));
		 System.out.println("P5 hashcode is:"+map.get(p5).hashCode()+" And value is:"+map.get(p5));
		}
		
	}

