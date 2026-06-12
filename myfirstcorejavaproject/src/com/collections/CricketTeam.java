package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CricketTeam {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		
		Collection<String> bowlers = new ArrayList<>();
//		Ensures that this collection contains the specified element 
		bowlers.add("Bhumrah");
		bowlers.add("Siraj");
		bowlers.add("Bhuvi");
		bowlers.add("Aswin");
		bowlers.add("Harshadeep");
		bowlers.add("Harshit Rana");
		bowlers.add("Kuldeep");
		
		System.out.println("Bowlers : " + bowlers);
		
		Collection<String> batsmens = new ArrayList<>();
		batsmens.add("Virat");
		batsmens.add("Rohit");
		batsmens.add("Iyer");
		batsmens.add("Dhoni");
		batsmens.add("Tilak");
		batsmens.add("Vaibhav");
		batsmens.add("Gill");
		batsmens.add("Rahul");
		System.out.println("Batsmens : " + batsmens);
		
		Collection<String> allRounders = new ArrayList<>();
		allRounders.add("Jadeja");
		allRounders.add("Srikanth");
		
		Collection<String> indianTeam = new ArrayList<>();
//		Adds all of the elements in the specified collection to this collection
		indianTeam.addAll(bowlers);
		indianTeam.addAll(batsmens);
		indianTeam.addAll(allRounders);
		
//		Removes all of the elements from this collection 
		bowlers.clear();
		
		System.out.println("IndianTeam : " + indianTeam);
		
//		Returns true if this collection contains the specified element.
		System.out.println(batsmens.contains("Akshara"));//false
		System.out.println(batsmens.contains("Virat"));//true
		
		
		 
//		Returns true if this collection contains all of the elements in the specified collection
		System.out.println(indianTeam.containsAll(bowlers));//true
		System.out.println(indianTeam.containsAll(allRounders));//false
		
//		indianTeam.clear();
		if(!indianTeam.isEmpty()) {
			System.out.println("Welcome to Indian team !! All the Best");
		}
		
		System.out.println("All Rounders : " + allRounders);
		System.out.println("Batsmens : " + batsmens);
		System.out.println("Bowlers : " + bowlers);
		System.out.println("------------------------------");
//		Removes a single instance of the specified element from this collection
		System.out.println(batsmens.remove("Dhoni"));//true
		System.out.println(batsmens);//without dhoni gives all  batsmens names
		System.out.println("------------------------------");
		System.out.println("Indian Team : " + indianTeam);
//		Removes all of this collection's elements that are also contained in the specified collection
		indianTeam.removeAll(allRounders);
		System.out.println("Indian Team : " + indianTeam);
		
	}

}
