package chapter21;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex08_TreeSet {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
//	중복 제거, 글자의 경우 사전순으로 오름차순 정렬
		tree.add("홍길동");
		tree.add("전우치");
		tree.add("손오공");
		tree.add("멀린");
		tree.add("손오공");

		System.out.println("객체 수 : " + tree.size());

		for (Iterator<String> itr = tree.iterator(); itr.hasNext();) {
			System.out.print(itr.next().toString() + '\t');
			System.out.println();
		}
		
		System.out.println();

		TreeSet<Integer> numTree = new TreeSet<>();
//	중복 제거, 숫자는 크기순으로 오름차순 정렬
		numTree.add(5);
		numTree.add(2);
		numTree.add(3);
		numTree.add(1);
		numTree.add(4);
		
		numTree.add(5);
		numTree.add(2);
		numTree.add(3);
		numTree.add(1);
		numTree.add(4);

		System.out.println("객체 수 : " + numTree.size());

		for (Iterator<Integer> itr = numTree.iterator(); itr.hasNext();) {
			System.out.print(itr.next().toString() + '\t');
			System.out.println();
		}
	}

}
