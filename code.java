package com.company;

import java.util.Arrays;

public class Code
{
    private String myCode;
    //additional instance variables
    char [] a, b;

    public Code(String code)
    {
        myCode = code;
        //possibly additional statements
    }

    public String getCode()
    {
        return myCode;
    }

    //precondition: p1 >= 0, p1 < p2
    //                      p2 <= myCode.length()
    //Replaces the characters in the code starting at
    //position p1 until position p2 - 1 inclusive with an X

    public void hide(int p1, int p2)
    {
        //to be implemented
        Arrays.copy(a, p1, b, 0, p2-p1);
        for (int i = p1; i<=p2;i++) {
            a[i] = X;
        }
    }

    //precondition: p1 >= 0, p1 < p2
    //                      p2 <= myCode.length()
    //Restores to their original values the characters in
    //the code starting at position p1 until position
    //p2-1 inclusive
    public void recover(int p1, int p2)
    {
        //to be implemented
        Arrays.copy(b, 0, a, p1, p2-p1);
    }
}