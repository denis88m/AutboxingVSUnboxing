package AutboxingVSUnboxing;

public class Main {
    // tipe Primitive
    public static void main(String[] args) {
        int numer = 2;
        byte byteValue = 21;
        long longValue = 2123;
        float floatValue = 21;
        double doubleValue = 212;
        boolean boolenValue = false;

        // outbox convertim
        Integer numberConvertedFromPrimitiv1 = numer;
        System.out.println("this proccess is Autboxing and value is" + numberConvertedFromPrimitiv1);
        Integer numberConvertedFromPrimitiv = Integer.valueOf(numer);
        System.out.println("this proccess is Autboxing and value is" + numberConvertedFromPrimitiv);

    }

    // unboxing
    Integer wraperClassValue = 9;
    int unboxingConvert = wraperClassValue;

    char charValue = 'c';
    Character autboxingChar = charValue;

    // unboxing procedure





}
