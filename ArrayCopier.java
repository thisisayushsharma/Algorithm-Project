import java.text.NumberFormat;
import java.text.DecimalFormat;

public class ArrayCopier{

	public static int[][] small = new int[200][250];
	public static int[][] med = new int[625][800];
	public static int[][] large = new int[3125][3200];

	public static int[][] dstsmall = new int[200][250];
	public static int[][] dstmed = new int[625][800];
	public static int[][] dstlarge = new int[3125][3200];

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		copyRows(small, dstsmall);
		long end = System.currentTimeMillis();

		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time for rows is " + formatter.format((end - start) / 1000d) + " seconds");
		System.out.println();

		start = System.currentTimeMillis();
		copyColumns(small, dstsmall);
		end = System.currentTimeMillis();

		formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time for column is" + formatter.format((end - start) / 1000d) + " seconds");
		System.out.println();

		start = System.currentTimeMillis();
		copyColumns(med, dstmed);
		end = System.currentTimeMillis();

		formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time for row is" + formatter.format((end - start) / 1000d) + " seconds");
		System.out.println();

		start = System.currentTimeMillis();
		copyColumns(med, dstmed);
		end = System.currentTimeMillis();

		formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time for column is" + formatter.format((end - start) / 1000d) + " seconds");
		System.out.println();

		start = System.currentTimeMillis();
		copyColumns(large, dstlarge);
		end = System.currentTimeMillis();

		formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time for row is" + formatter.format((end - start) / 1000d) + " seconds");
		System.out.println();

		start = System.currentTimeMillis();
		copyColumns(large, dstlarge);
		end = System.currentTimeMillis();

		formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time for column is" + formatter.format((end - start) / 1000d) + " seconds");
		System.out.println();
	}

	public static void copyRows(int[][] src, int[][] dst){
		for (int i = 0;i < src.length ; i++) {
			for (int j = 0;j < src[i].length ; j++) {
				dst[i][j] = src[i][j];
			}
		}
	}

	public static void copyColumns(int [][] src, int[][] dst){
		for (int j = 0;j < src[0].length ; j++) {
			for (int i = 0;i < src.length ; i++) {
				dst[i][j] = src[i][j];
			}
		}
	}
}