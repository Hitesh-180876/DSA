package com.competitiveprogramming.DSA.strings;

public class CompareStrings {
    public static void main(String[] args){

        String s1 = "a" + "b";
        String s2 = "ab";

        /*
        in Java, the expression s1 == s2 will evaluate to true because both s1 and s2 refer to a string with the value "ab".

        In the expression s1 = "a" + "b", the concatenation operator + combines the two string literals "a" and "b" to form a new string "ab", which is then assigned to the variable s1.

        Similarly, in the expression s2 = "ab", the string literal "ab" is assigned to the variable s2.

        Since both s1 and s2 refer to the same string "ab", the expression s1 == s2 evaluates to true.
         */

        if(s1.equals(s2)){
            System.out.println("both are equal");
        }else {
            System.out.println("both are not equal");
        }
    }
}
