public class hourglassSum {
/*2D Array - DS*/
    public static int findMaxSum(int [][] mat, int v, int b){
        v  = mat[0].length;
        b  = mat[1].length;
        if (v < 3 || b < 3){
            System.out.println("Not possible");
            System.exit(0);
        }
        int newInt =  v - 2;
        int secInt =  b - 2;



        int max_sum =
                Integer.MIN_VALUE;
        System.out.println("min_value: "+ max_sum);
        for (int i = 0; i < v - 2; i++){
            for (int j = 0; j < b - 2; j++){
                int sum = (mat[i][j] + mat[i][j + 1] +
                        mat[i][j + 2]) + (mat[i + 1][j + 1]) +
                        (mat[i + 2][j] + mat[i + 2][j + 1] +
                                mat[i + 2][j + 2]);

                /*for(int i=0; i<v-2; i++){
                    for(int j=0; j<b-2;j++){
                        int sum = (arr.get(i).get(j) + arr.get(i).get(j+1) +
                                arr.get(i).get(j+2) + (arr.get(i+1).get(j+1)) +
                                (arr.get(i+2).get(j) + arr.get(i+2).get(j+1) +
                                        arr.get(i+2).get(j+2)));
                        max_sum = Math.max(max_sum, sum);
                    }*/
                /*
                System.out.println("horizontal: "+  newInt);
                System.out.println("vertical: "+  secInt);
                System.out.println("mat[i][j]: "+ mat[i][j]);
                System.out.println("mat[i][j + 1]: "+ mat[i][j + 1]);
                System.out.println("mat[i][j + 2]): "+ mat[i][j + 2]);
                System.out.println("(mat[i + 1][j + 1]): "+ (mat[i + 1][j + 1]));
                System.out.println("mat[i + 2][j]: "+ mat[i + 2][j]);
                System.out.println("mat[i + 2][j + 1]: "+ mat[i + 2][j + 1]);
                System.out.println("mat[i + 2][j + 2]: "+ mat[i + 2][j + 2]);*/
                max_sum = Math.max(max_sum, sum);
            }
        }

        System.out.println(max_sum);
        return max_sum;
    }

    public static void main(String[] args) {

        int[][] arr ={{-9,-9,-9,1, 1, 1,},
                      {0, -9, 0, 4, 3, 2},
                      {-9, -9, -9, 1,2,3},
                      {0,  0,  8,  6,6,0},
                      {0, 0,  0, -2, 0,0},
                      {0,  0,  1, 2,4,0}};
        int n = arr[0].length;
        int b = arr[0].length;
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        findMaxSum(arr,n,b);
    }
}
/*// Java program to find maximum
// sum of hour glass in matrix
import java.io.*;

class GFG {

static int R = 5;
static int C = 5;

// Returns maximum sum of
// hour glass in ar[][]
static int findMaxSum(int [][]mat)
{
	if (R < 3 || C < 3){
		System.out.println("Not possible");
		System.exit(0);
	}

	// Here loop runs (R-2)*(C-2)
	// times considering different
	// top left cells of hour glasses.
	int max_sum = Integer.MIN_VALUE;
	for (int i = 0; i < R - 2; i++)
	{
		for (int j = 0; j < C - 2; j++)
		{
			// Considering mat[i][j] as top
			// left cell of hour glass.
			int sum = (mat[i][j] + mat[i][j + 1] +
					mat[i][j + 2]) + (mat[i + 1][j + 1]) +
					(mat[i + 2][j] + mat[i + 2][j + 1] +
					mat[i + 2][j + 2]);

			// If previous sum is less than
			// current sum then update
			// new sum in max_sum
			max_sum = Math.max(max_sum, sum);
		}
	}
	return max_sum;
}

	// Driver code
	static public void main (String[] args)
	{
		int [][]mat = {{1, 2, 3, 0, 0},
					{0, 0, 0, 0, 0},
					{2, 1, 4, 0, 0},
					{0, 0, 0, 0, 0},
					{1, 1, 0, 1, 0}};
		int res = findMaxSum(mat);
		System.out.println("Maximum sum of hour glass = "+ res);
	}

}

// This code is contributed by vt_m .
// Code is modified by Susobhan Akhuli
*/