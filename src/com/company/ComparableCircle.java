package com.company;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
        //Comparable: hàm interface có sẵn trong java

    public ComparableCircle(){
    }
    public ComparableCircle(double radius){
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled){
        super(radius, color, filled);
    }
    @Override
    //ghi đè phương thức compareTo của Interface Comparable mặc định java.
    public int compareTo(ComparableCircle o){
        if(getRadius()> o.getRadius()){
            return 1;
        }else if(getRadius()<o.getRadius()){
            return -1;
        }else return  1;
    }
}
