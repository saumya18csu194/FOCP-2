package com.ncu.assignment.classes;
public class Date 
{
 
    int month;
    int day;
    int year;
     
    Date(int month, int day, int year) 
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setDate (int day, int month, int year) 
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
     


    public String displayDate () 
    {
        return (day + "/" + month + "/" + year);
    }
 
}