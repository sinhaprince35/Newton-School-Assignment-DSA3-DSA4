/*
Virus Affinity
easy
Time Limit: 1 sec
Memory Limit: 128000 kB


Problem Statement
There are N types of virus also each virus has an affinity equal to A[i]. You want to find the top 10 virus with the highest affinity.

Expected Time Complexity: O(N)
Input
First line contains an integer N.
Next line contains N space separated integers denoting elements of array.

Constraints
10 <= N <= 10^7
1 <= Ai <= 10^5
Output
Print the affinity of top 10 virus in sorted order.
Example
Sample Input 1:
10
1 2 3 4 5 6 7 8 9 10

Output
1 2 3 4 5 6 7 8 9 10

Sample Input 2:
15
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

Output
6 7 8 9 10 11 12 13 14 15
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException{
                      // Your code here
                      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                      int n=Integer.parseInt(br.readLine());
                      int[] arr=new int[n];
                    //   int max=10;
                    String[] str=br.readLine().split(" ");
                      PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
                      for(int i=0;i<n;i++){
                          pq.add(Integer.parseInt(str[i]));
                      }
                    //   if(n>=10){
                        Stack<Integer> stack=new Stack<>();
                          for(int i=0;i<10;i++){
                              stack.push(pq.poll());
                          }
                          for(int i=0;i<10;i++){
                              System.out.print(stack.pop()+" ");
                          }
                    //   }
    }
}