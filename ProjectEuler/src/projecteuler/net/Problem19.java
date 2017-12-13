/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.net;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * You are given the following information, but you may prefer to do some research for yourself.
 *  1 Jan 1900 was a Monday.
 *  Thirty days has September,
 *  April, June and November.
 *  All the rest have thirty-one,
 *  Saving February alone,
 *  Which has twenty-eight, rain or shine.
 *  And on leap years, twenty-nine.
 *  A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * 
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

 */
public class Problem19 {

    public static void main(String[] args) {

        Integer count = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
        Calendar calendar = new GregorianCalendar(1901, 0, 1);
        System.out.println("Date : " + sdf.format(calendar.getTime()) 
                + " DAY_OF_WEEK : " + calendar.DAY_OF_WEEK);

        while((""+calendar.get(Calendar.YEAR)).compareTo("2001") != 0) {
            calendar.add(Calendar.MONTH, +1);

            if(calendar.get(Calendar.DAY_OF_WEEK) == 1) {
                System.out.println("Date : " + sdf.format(calendar.getTime())
                + " . calendar.DAY_OF_WEEK : " + calendar.get(Calendar.DAY_OF_WEEK)
                + " Sunday!!! ");
                count++;
            }

        }
        
        System.out.println(". count : " + count);
        
    }

}
