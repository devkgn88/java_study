package com.gn.practice05;

import java.util.HashSet;
import java.util.Set;

public class Run {
	public static void main(String[] args) {
		Set<Song> set1 = new HashSet<Song>();
		set1.add(new Song("APT.","로제"));
		set1.add(new Song("Whiplash","에스파"));
		set1.add(new Song("POWER","G-DRAGON"));
		
		Set<Song> set2 = new HashSet<Song>();
		set2.add(new Song("Whiplash","에스파"));
		set2.add(new Song("HAPPY","DAY6"));
		set2.add(new Song("HAPPY","DAY6"));
		System.out.println(set1);
		System.out.println(set2);
	}
}
