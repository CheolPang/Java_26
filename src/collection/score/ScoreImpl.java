package collection.score;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import generic.ex.Storage;

public class ScoreImpl implements Score {
	private List<ScoreVO> slist = new ArrayList<ScoreVO>();
	private Scanner sc = new Scanner(System.in);
	@Override
	public void input() {
		
		int num, kor, eng, math;
		String name;
		System.out.print("학번 : ");
		num = sc.nextInt();
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		ScoreVO sv = new ScoreVO(name, num, kor, eng, math, sum, avg);
		slist.add(sv);
	}
	
	@Override
	public void print() {
		for (ScoreVO sv : slist) {
	        System.out.println(sv.toString());
	    }
		
	}

	@Override
	public void printTitle() {
		System.out.println("학번	이름	국어	영어	수학	총점	평균");
		
	}

	@Override
	public void searchHak() {
		
		
		
	}

	@Override
	public void searchName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void descSortTot() {
		// Comparator<ScoreVO> comp = new 
		
	}

	@Override
	public void ascSortHak() {
		/* Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			
			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				return o1.getNum() //(o2.getNum());
			}
		};	
		Collections.sort(slist, comp);
		print();*/
	}

	@Override
	public void saveFile() {
		// BufferedWriter. 
		
	}

	@Override
	public void readFile() {
		// TODO Auto-generated method stub
		
	}
}
