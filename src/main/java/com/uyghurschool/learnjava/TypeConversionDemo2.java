package com.uyghurschool.learnjava;

public class TypeConversionDemo2 {
    public static void main(String[] args) {
        String myNumber="1234567"; //numeric String
        int i=123;
        int sum=i+Integer.parseInt(myNumber);
        System.out.println(sum);
        String myNumber2="1234567.123";
        float f2=Float.parseFloat(myNumber2);
        double d2=Double.parseDouble(myNumber2);
        double d=d2+i;
        System.out.println(d);
        //convert number to String
        int x3=985;
        float f4=(float)595.123456;
        String x3String=String.valueOf(x3);
        String f4String=String.valueOf(f4);
        System.out.println(x3String +f4String);

        //
        String m1="  fkdfjdkfd   ";
        System.out.println(m1);
        System.out.println(m1.trim());
        System.out.println(m1.replace(" ",""));
    }
}
