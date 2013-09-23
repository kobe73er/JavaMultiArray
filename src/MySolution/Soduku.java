package MySolution;

import java.util.Arrays;
import java.util.Scanner;

public class Soduku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][];

		grid = readSolution();
		System.out.println(isValid(grid));
	}

	private static boolean is1To9(int[] list) {
		int[] temp = new int[list.length];
		System.arraycopy(list, 0, temp, 0, list.length);

		Arrays.sort(temp);
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != temp[i + 1]) {
				return false;
			}
		}
		return true;

	}

	private static int[][] readSolution() {
		int grid[][] = new int[9][9];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				grid[i][j] = input.nextInt();
			}
		}
		return grid;
	}

	private static boolean isValid(int[][] grid) {
		// 检查行
		for (int i = 0; i < 9; i++) {
			if (!is1To9(grid[i])) {
				return false;
			}
		}
		// 检查列
		for (int j = 0; j < 9; j++) {
			int[] column = new int[9];
			for (int i = 0; i < 9; i++) {
				column[i] = grid[i][j];
				if (!is1To9(column)) {
					return false;
				}
			}
		}
		// 检查一个正方形小区域
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int[] list = new int[9];
				int k = 0;
				for (int row = i * 3; row < row + 3; row++) {
					for (int column = j * 3; column < j + 3; column++) {
						list[k++] = grid[i][j];
					}
				}
				if (!is1To9(list)) {
					return false;
				}

			}
		}
		return false;

	}
}
