import com.ncu.assignment.exception.*;
import com.ncu.assignment.validation.StudentValidationError;
package com.ncu.assignment.validation;
public class StudentValidation
{
public static void validateDate(Date D) throws DateFormatException
{
if ((D.day<0 || D.day>31) || (D.month<0 || D.month>12) || (D.year<0))
throw new DateFormatException (date);
}
public static void validateMandatoryFields(String fName, Address ad, Date dob, String email, String CNo) throws MandatoryMissingException
{
if (fname==null||ad==null||dob==null||email==null|| CNo==null)
throw new MandatoryMissingException (mandatory);
}
public static void validateSkills(int skill) throws MandatoryMissingException
{
if (skill<1)
throw new MandatoryMissingException (mandatory);
}
public static void validateQual(int qual) throws MandatoryMissingException
{
if (qual<1)
throw new MandatoryMissingException (mandatory);
}
}