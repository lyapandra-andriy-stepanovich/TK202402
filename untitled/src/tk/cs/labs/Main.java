package tk.cs.labs;

public class Main {
    public static void main(String[] args) {
       PrintAllTypes();
    }

    public static void PrintAllTypes()
    {
        char CharMinValue = Character.MIN_VALUE, CharMaxValue = Character.MAX_VALUE;
        byte ByteMinValue = Byte.MIN_VALUE, ByteMaxValue = Byte.MAX_VALUE;
        short ShortMinValue = Short.MIN_VALUE, ShortMaxValue = Short.MAX_VALUE;
        int IntMinValue = Integer.MIN_VALUE, IntMaxValue = Integer.MAX_VALUE;
        long LongMinValue = Long.MIN_VALUE, LongMaxValue = Long.MAX_VALUE;
        float FloatMinValue = Float.MIN_VALUE, FloatMaxValue = Float.MAX_VALUE;
        double DoubleMinValue = Double.MIN_VALUE, DoubleMaxValue = Double.MAX_VALUE;

        System.out.println("Byte min value : " + ByteMinValue + " Byte max value : " + ByteMaxValue);
        System.out.println("Short min value : " + ShortMinValue + " Short max value : " + ShortMaxValue);
        System.out.println("Char min value : " + (int)CharMinValue + " Char max value : " + (int)CharMaxValue);
        System.out.println("Int min value : " + IntMinValue + " Int max value : " + IntMaxValue);
        System.out.println("Long min value : " + LongMinValue + " Long max value : " + LongMaxValue);
        System.out.println("Float min value : " + FloatMinValue + " Float max value : " + FloatMaxValue);
        System.out.println("Double min value : " + DoubleMinValue + " Double max value : " + DoubleMaxValue);
    }
}