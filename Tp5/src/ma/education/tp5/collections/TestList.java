package ma.education.tp5.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.*;
public class TestList {

	public static void main(String[] args) {
		List<Integer> list1= new ArrayList<Integer>();
		list1.add(12);
		list1.add(23);
		list1.add(23);
		list1.add(12);
		
		// Affichage en utilisant la boucle for classique
		for(int i = 0;i<list1.size();i++){
		Integer e = (Integer) list1.get(i);
		System.out.println(" element "+i +" : "+e);
		}
		// Affichage en utilisant la boucle for avanc�e
		for(Integer e :list1){
		System.out.println(" element "+e);
		}
		// Affichage en utilisant un iterator
		Iterator<Integer> iter = list1.iterator();
		while(iter.hasNext()){
		Integer e = iter.next();
		System.out.println("element : "+e);
		}
		// Affichage en utilisant un iterator
		list1.forEach(i-> System.out.println(" element "+i));
		}
		/**
		 * Quelle est la meilleure fa�on pour it�rer sur une collection?
		 */
	//4		
	//List<Integer> list2= Arrays.asList(1,5,6,9,16);
	//list2.stream().map(i->i*i).filter(i->i>37).forEach(i->System.out.println(i));
	list2.stream().map(i->i*i).filter(i->i>37).forEach(i->System.out.println(i));
	//5
	List<Integer> list3= new ArrayList<>();
	list3.add(5);
	list3.add(10);
	list3.add(15);
	list3.add(20);
	list3.add(2,10);
	list3.forEach(i-> System.out.println(i));
	}
		
		}
		

	


