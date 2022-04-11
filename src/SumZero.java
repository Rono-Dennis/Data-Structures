public class SumZero {
// Java implementation to Print N distinct
// numbers such that their sum is 0



        // Function to print distinct n
// numbers such that their sum is 0
        public static int findNumbers(int N)
        {
            int sum=0;
            int sum2=0;
            int result = 0;
            int y = N/2;

            for (int i = 1; i <= y;  i++)
            {
                // Print 2 symmetric numbers
                System.out.print(i + ", " + -i + ", ");
                    sum = sum + i;
                    sum2 = sum2 + -i;
                    result += sum + sum2;
//                System.out.println("result is" + result);


            }

            if// Print a extra 0 if N is odd
             (N % 2 == 1)
                System.out.print(0);

            System.out.println("\n division gives: "+y);
            return  result;
        }

        // Driver code
        public static void main(String[] args)
        {
            int N = 11;
            findNumbers(N);
        }
    }

