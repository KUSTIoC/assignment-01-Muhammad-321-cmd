/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems;
public class DateAndTime {
    private int Day , Month , Year, Hour, Minute;
    private static final int[] daysPerMonth = {0 , 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31};
    
    public DateAndTime(int day, int month, int year, int hour, int minute) {
        if (month <= 0 || month >= 12)
            throw new IllegalArgumentException("Month value is invalid");
        if (day <= 0 || day > daysPerMonth[month] && ! (day == 29 && month == 2))
            throw new IllegalArgumentException("Day is Invalid");        
        if (day == 29 && month == 2 && ! (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("There is no 29 in year " + year);
        if (hour > 24 || minute > 60)
            throw new IllegalArgumentException("Time is Incorrect");
        this.Day = day;
        this.Month = month;
        this.Year = year;
        this.Hour = hour;
        this.Minute = minute;
    }
    
    @Override
    public String toString() {
        return String.format("DateAndTime is: %d/%d/%d %d:%d", this.Day, this.Month, this.Year, this.Hour, this.Minute);
    }
    
}


