package com.uyghurschool.learnjava.datastructure;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //two dimensional array
        int row=3;
        int column=4;
        //(0,0) (0,1), (0,2), (0,3)
        //(1,0) (1,1), (1,2), (1,3)
        //(2,0) (2,1), (2,2), (2,3)
        String[][] seats=new String[row][column];
        seats[0][0]="Dolkun";
        seats[0][1]="Erkin";
        seats[0][2]="Emily";
        seats[0][3]="Jake";
        //we use nested for loop
        for(int r=0;r<row;r++)
        {
            for(int c=0;c<column;c++)
            {
                //if the seat is not assigned , print unassigned
                if(seats[r][c]==null)
                {
                    seats[r][c]="unassigned";
                }
                System.out.println("Row "+(r+1)+ " Column "+(c+1) + " assigned " +seats[r][c]);
            }
        }
    }
}
