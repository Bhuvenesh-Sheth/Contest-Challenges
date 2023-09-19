/*
 * Geek's island has weird rules. The king of the island ordered that if the price of any item is
 * even then, it can only be used by boys, and if the price is odd, it can only be used by girls.
A person can only buy one type of item else he/she is punished.
The gender of a person on the island  can be determined by the type of item which he/she bought.
Geek bought exactly two items, the cost of which is A and B respectively. 
Return "He" if Geek is a boy, return "She" if Geek is a girl else return "Punished" if Gender cannot be determined.

 

Example 1:

Input:
A = 3, B = 7
Output: 
She
Explanation: 
Both are odd.
Example 2:

Input:
A = 2, B = 5
Output: 
Punished
Explanation: 
A is even and B is odd.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function solve( ) which takes integers A and B as input parameters and returns the answer as a string.

Constraints:
1 ≤ A , B ≤ 109
 */
public class Weird_Island {
    static String solve(int A, int B) {
        // code here
        if ((A % 2 == 0) && (B % 2 == 0)) {
            return "He";
        } else if ((A % 2 != 0) && (B % 2 != 0)) {
            return "She";
        }

        return "Punished";
    }
}
