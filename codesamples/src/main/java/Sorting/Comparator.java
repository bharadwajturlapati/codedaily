package Sorting;

import java.util.Vector;

import HackerRank.HackerRankMeta;

/* URL
 * PracticeInterview Preparation KitSortingSorting: Comparator
 */
public class Comparator extends HackerRankMeta {
	
	private void simpletest() {
		
		Vector<Person> vector = new Vector<Person>();
		vector.add(buildPerson("Radha",24));
		vector.add(buildPerson("Krishna", 23));
		
		vector.sort(new Person());
		
		vector.forEach((i) -> {System.out.println(i.age);});
	}
	
	
	private Person buildPerson(String name, int age) {
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		return person;
	}


	@Override
	public String getURL() {
		String url = "https://www.hackerrank.com/interview/interview-preparation-kit/sorting/challenges";
		return url;
	}
	
	public static void main(String[] args) {
		Comparator c = new Comparator();
		c.simpletest();
	}

}

class Person implements java.util.Comparator<Person>{
	String name;
	int age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int compare(Person o1, Person o2) {
		return o2.age - o1.age;
	}
}
