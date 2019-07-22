package com.stackroute.pe2;

public class ReversePalindrome {

    public String palindromeCheck(String input){
        if (input == null)
            return null;
        String  reverse = "";
        for ( int i = input.length() - 1; i >= 0; i-- )
            reverse = reverse + input.charAt(i);

        if (input.equals(reverse))
            return "palindrome";
        else
            return "not palindrome";
    }
}
