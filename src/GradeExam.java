import java.util.ArrayList;
import java.util.Iterator;

public class GradeExam {
	/** Main method */
	public static void main(String args[]) {
		// Students' answers to the questions
		char[][] answers = {
				{ 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };

		// Key to the questions
		char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
		ArrayList<Integer> resultArray=new ArrayList<Integer>();
		for (char[] s : answers) {
			int j = 0;
			int rightAnswer=0;
			for (char c : s) {

				// System.out.print(c + " ");
				// System.out.print(c + " ");
				//System.out.print(" keys==>" + keys[j]);
				if (c == keys[j]) {
					System.out.print(" Y ");
					rightAnswer++;
				}
				else{
					System.out.print(" X ");
				}
				j++;
			}
			resultArray.add(rightAnswer);
			System.out.println();
		}
		Iterator<Integer> itrator=resultArray.iterator();
		while(itrator.hasNext()){
			System.out.print(itrator.next()+" ");
		}
	}
}
