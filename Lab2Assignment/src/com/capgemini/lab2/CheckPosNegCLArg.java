package com.capgemini.lab2;

public class CheckPosNegCLArg {
public static void main(String[] args) {
if(Integer.parseInt(args[0])>0)
System.out.println("Positive number");
else
if(Integer.parseInt(args[0])<0)
System.out.println("Negative Number");

}
}


