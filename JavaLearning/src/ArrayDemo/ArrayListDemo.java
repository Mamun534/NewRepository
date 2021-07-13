package ArrayDemo;

import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {

		int student_id[] = new int[5];

		student_id[0] = 100;
		student_id[1] = 90;
		student_id[2] = 80;
		student_id[3] = 70;
		student_id[4] = 60;

		int len = student_id.length;
		
		System.out.println("This is lenght of array..." + len);

		for (int i = 0; i<len; i++) {

			System.out.println("This is value of student number Three..." + student_id[i]);

		}
	}

}
