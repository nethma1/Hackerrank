/*Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If  and  are case-insensitive anagrams, return true; otherwise, return false instead.

Input Format

The first line contains a string denoting . 
The second line contains a string denoting .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Output Format

Return true if  and  are case-insensitive anagrams of each other; otherwise, return false instead.

Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we return true.

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
Explanation 1

Character	Frequency: anagramm	Frequency: marganaa
A or a	3	4
G or g	1	1
N or n	1	1
M or m	2	1
R or r	1	1
The two strings don't contain the same number of a's and m's, so we return false.

Sample Input 2

Hello
hello
Sample Output 2

Anagrams
Explanation 2

Character	Frequency: Hello	Frequency: hello
E or e	1	1
H or h	1	1
L or l	2	2
O or o	1	1
The two strings contain all the same letters in the same frequencies, so we return true.*/



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opex;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author HP
 */
public class Ex2 {
    
   static boolean isAnagram(String a, String b) {
        // Complete the function
       String a1=a.toLowerCase();
       String b1=b.toLowerCase();
        int[] m=new int[124];
        int[] n=new int[124];
        for(int i=0;i<a1.length();i++){
           m[(int)(a1.charAt(i))]+=1;
            
           
        }
        
        for(int j=0;j<b1.length();j++){
           n[(int)(b1.charAt(j))]+=1;
            
           
        }
        
        for(int k=0;k<124;k++){
            if(m[k] != n[k]){
              return false;
              
            }
            
        
        }
        return true;
        
    }
   
    
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        String h=a.next();
        String j=a.next();
        boolean z=isAnagram(h,j);
        System.out.println((z)? "Anagrams":"Not Anagrams");
       
    }
    
}
