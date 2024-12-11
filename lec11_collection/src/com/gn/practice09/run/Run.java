package com.gn.practice09.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.gn.practice09.model.vo.Person;
import com.gn.study.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		// HashSet 객체 생성
		Set<Person> personSet1 = new HashSet<Person>();
		Set<Person> personSet2 = new HashSet<Person>();
      
	    // 학생 정보 추가
		personSet1.add(new Person("홍길동", 20));
		personSet1.add(new Person("이순신", 25));
		personSet1.add(new Person("유관순", 22));
	    
		personSet2.add(new Person("유관순", 22));
		personSet2.add(new Person("강감찬", 27));
		personSet2.add(new Person("을지문덕", 30));
    
	    // 두 집합의 합집합, 교집합, 차집합 구하기
	    // 결과 출력
	    System.out.println("=== 합집합 ===");
	    
	    Set<Person> union = new HashSet<Person>();
	    union.addAll(personSet1);
	    union.addAll(personSet2);
	    
	    Set<Person> ascUnion = new TreeSet<Person>();
	    ascUnion.addAll(union);
	
	    Iterator<Person> itr1 = ascUnion.iterator();
	    int count1 = 1;
		while(itr1.hasNext()) {
			Person p = itr1.next();
			System.out.println(count1+"번 "+p);
			count1++;
		}
		System.out.println("=== 교집합 ===");
	    Set<Person> inter = new HashSet<Person>();
	    inter.addAll(personSet1);
	    inter.retainAll(personSet2);
	    
	    Set<Person> ascInter = new TreeSet<Person>();
	    ascInter.addAll(inter);
	    
		Iterator<Person> itr2 = ascInter.iterator();
		int count2 = 1;
		while(itr2.hasNext()) {
			Person p = itr2.next();
			System.out.println(count2+"번 "+p);
			count2++;
		}
	
		System.out.println("=== 차집합 ===");
	    Set<Person> diff = new HashSet<Person>();
	    diff.addAll(personSet1);
	    diff.removeAll(personSet2);
	    
		Set<Person> ascDiff = new TreeSet<Person>();
		ascDiff.addAll(diff);
		Iterator<Person> itr3 = diff.iterator();
		
		int count3 = 1;
		while(itr3.hasNext()) {
			Person p = itr3.next();
			System.out.println(count3+"번 "+p);
			count3++;
		}
	}
}
