package com.company;

import java.util.Date;

/**
 * Created by olsen on 3/22/17.
 */
public class WaterHeater extends ServiceCall {

    private int age;
    static double MandatoryFee = 20.00;

    public WaterHeater(String serviceAddress, String problemDescription, Date date, int age) {

        super(serviceAddress, problemDescription, date);
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee+MandatoryFee);


        return "Water Heater Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Water Heater Age = " + age + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString ;

    }
}
