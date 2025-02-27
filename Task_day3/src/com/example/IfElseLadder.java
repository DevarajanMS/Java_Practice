package com.example;
import java.util.Scanner;
public class IfElseLadder
{
    String candName=new String();
    int test_rank;
    String branch;
    int mark1,mark2,mark3,mark4,mark5;
    int total=mark1+mark2+mark3+mark4+mark5;
    int avg=total/5;
    String grade;
    String address=new String();
    String uni;
    String doj="01/01/25";
    public void Input()
    {
        Scanner sc=new Scanner(System.in);
        candName=sc.nextLine();
        address=sc.nextLine();
        mark1=sc.nextInt();
        mark2=sc.nextInt();
        mark3=sc.nextInt();
        mark4=sc.nextInt();
        mark5=sc.nextInt();
        sc.close();
    }
    public void gradeCal()
    {
        if(avg > 90 )
            grade="A";
        else if(avg < 90 || avg >=80)
            grade="B";
        else if (avg < 80 || avg >=70)
            grade="C";
        else if (avg < 70 || avg >=60)
            grade="D";
        else
            grade="S";
    }
    public void uniAllotment() {
        switch (grade) {
            case "A": {
                uni = "ABC University";
                branch = "CSE";
                break;
            }
            case "B": {
                uni = "BCD University";
                branch = "IT";
                break;
            }
            case "C": {
                uni = "EFG University";
                branch = "ECE";
                break;
            }
            case "D": {
                uni = "HIJ University";
                branch = "EEE";
                break;
            }
            default: {
                System.out.println("Better luck next time");
                break;
            }
        }
    }
    public void classAllotmentOrder()
    {
            System.out.println
            (
                    "Name:" + candName + "\n" +
                    "Address: "+address+"\n"+
                    "Grade: "+ grade+"\n"+
                    "University: " + uni + "\n" +
                    "Branch: " + branch + "\n" +
                    "DOJ: " + doj
            );

    }
    public static void main(String[] args)
    {
        IfElseLadder t=new IfElseLadder();
        t.Input();
        t.gradeCal();
        t.uniAllotment();
        t.classAllotmentOrder();
    }
}
