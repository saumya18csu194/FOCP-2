package com.ncu.assignment.classes;
public class Qualification
{
String qualName;
String university;
String institute;
float cgpa;
Qualification(String qual, String uni, String inst, float cg)
{ 
this.qualName = qual;
this.university = uni;
this.institute = inst;
this.cgpa= cg;
}
public String display_qualification()
{
System.out.println("Qualification Name: " + qualName + "\nUniversity Name: " + university + "\nInstitute Name: " + institute + "\nCGPA: " + cgpa);
return "";}
}