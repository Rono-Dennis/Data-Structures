import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class dynamicArray {
    public static List<Integer> dynamicArrays(int n, List<List<Integer>> queries) {
        // Write your code here
        ArrayList<ArrayList<Integer>> seqs=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp= new ArrayList<Integer>();
        int lastAns=0;

        for(int i=0;i<n;i++)
        {
            seqs.add(new ArrayList<Integer>());
        }

        for(List<Integer> arr: queries)
        {
            int seq=(arr.get(1)^lastAns)%n;

            int size=seqs.get(seq).size();

            switch(arr.get(0))
            {
                case 1: seqs.get(seq).add(arr.get(2));
                    break;

                case 2: lastAns= seqs.get(seq).get(arr.get(2)%size);
                    temp.add(lastAns);
            }
        }
        return temp;

    }

    public static void main(String[] args) {
        // List of Lists
        ArrayList<List<Integer> > listOfLists
                = new ArrayList<List<Integer> >();

        // Create N lists one by one
        // and append to the list of lists
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(2);
        list1.add(5);
        listOfLists.add(list1);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(0);
        list2.add(5);
        listOfLists.add(list2);

        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(1);
        list3.add(1);
        list3.add(7);
        listOfLists.add(list3);

        List<Integer> list4 = new ArrayList<Integer>();
        list4.add(1);
        list4.add(0);
        list4.add(3);
        listOfLists.add(list4);

        List<Integer> list5 = new ArrayList<Integer>();
        list5.add(2);
        list5.add(1);
        list5.add(0);
        listOfLists.add(list5);

        List<Integer> list6 = new ArrayList<Integer>();
        list6.add(2);
        list6.add(1);
        list6.add(0);
        listOfLists.add(list6);

        //Array format
        int [][] data = {{2, 5,},
                {1, 0, 5,},
                {1, 1, 7,},
                {1, 0, 3,},
                {2, 1, 0,},
                {2, 1, 1,}};

        int n = data[0].length;
        dynamicArrays(n,listOfLists);
    }
}
/*Question*/
/**Declare a 2-dimensional array, , of  empty arrays. All arrays are zero indexed.
 Declare an integer, , and initialize it to .

 There are  types of queries, given as an array of strings for you to parse:

 Query: 1 x y
 Let .
 Append the integer  to .
 Query: 2 x y
 Let .
 Assign the value  to .
 Store the new value of  to an answers array.
 Note:  is the bitwise XOR operation, which corresponds to the ^ operator in most languages. Learn more about it on Wikipedia.  is the modulo operator.
 Finally, size(arr[idx]) is the number of elements in arr[idx]

 Function Description

 Complete the dynamicArray function below.

 dynamicArray has the following parameters:
 - int n: the number of empty arrays to initialize in
 - string queries[q]: query strings that contain 3 space-separated integers

 Returns

 int[]: the results of each type 2 query in the order they are presented
 Input Format

 The first line contains two space-separated integers, , the size of  to create, and , the number of queries, respectively.
 Each of the  subsequent lines contains a query string, .

 Constraints

 It is guaranteed that query type  will never query an empty array or index.
 Sample Input

 2 5
 1 0 5
 1 1 7
 1 0 3
 2 1 0
 2 1 1
 Sample Output

 7
 3
 Explanation

 Initial Values:


 = [ ]
 = [ ]

 Query 0: Append  to .

 = [5]
 = [ ]

 Query 1: Append  to .
 = [5]
 = [7]

 Query 2: Append  to .

 = [5, 3]
 = [7]

 Query 3: Assign the value at index  of  to , print .

 = [5, 3]
 = [7]

 7
 Query 4: Assign the value at index  of  to , print .

 = [5, 3]
 = [7]

 3
 */
