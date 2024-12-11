package com.gn.practice09.model.vo;

import java.util.Objects;

public class Person implements Comparable<Person>{
	 private String name;
	 private int age;
	 
	 public Person() {}
	 
	 public Person(String name, int age) {
		 this.name = name;
		 this.age = age;
	 }
	 
		@Override
		public int hashCode() {
			return Objects.hash(name,age);
		}
		
		@Override
		public boolean equals(Object obj) {
			boolean result = false;
			if(obj instanceof Person) {
				Person other = (Person)obj;
				if(other.name.equals(this.name)
						&&other.age == this.age) {
					result = true;
				}
			}
			return result;
		}
		
		@Override
		public String toString() {
			return name+"("+age+")";
		}

		@Override
		public int compareTo(Person other) {
			return this.name.compareTo(other.name);
		}
		
}
