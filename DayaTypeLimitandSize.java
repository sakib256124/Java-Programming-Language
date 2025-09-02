public class DayaTypeLimitandSize {

    public static void main(Strings[] args) {


        //Size in bit
        System.out.println("Size of int: " + Integer.SIZE + " bits");
        System.out.println("Size of long: " + Long.SIZE + " bits");
        System.out.println("Size of float: " + Float.SIZE + " bits");
        System.out.println("Size of double: " + Double.SIZE + " bits");
        System.out.println("Size of char: " + Character.SIZE + " bits");
        System.out.println("Size of short: " + Short.SIZE + " bits");
        System.out.println("Size of byte: " + Byte.SIZE + " bits");


        //Limit
        System.out.println("int:    " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long:   " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("short:  " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("byte:   " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("float:  " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("char:   " + (int)Character.MIN_VALUE + " to " + (int)Character.MAX_VALUE);
    }
}