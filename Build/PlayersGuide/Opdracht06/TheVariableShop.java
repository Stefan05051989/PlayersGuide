package PlayersGuide.Opdracht06;
/*
Stefan Kiers
14-04-'25
Build a program with a variable of all eight primitive Java types (as well as the ‘text’ type).
Assign each of them a value using a literal of the correct type.
Use System.out.println to display the contents of each variable.

Syntax for declaring variables :
type variableName = value;
 */

public class TheVariableShop {
    public static void main(String[] args) {
        String name = null;
        // String name : Stefan
        byte newByte = -128;
        // Byte size : -128 t/m 127
        short newShort = -32768;
        // Short size : -32768 t/m 32767
        int newInt = -2147483648;
        // Int Size : -2147483648 t/m 2147483647
        long newLong = -9223372036854779L;
        // Long size :  -9223372036854775808 t/m 9223372036854775807
        float newFloat = 19.999999f;
        // Float : Sufficient for storing 6 to 7 decimal digits
        double newDouble = 1.0123456789123456d;
        // Double : Sufficient for storing 15 to 16 decimal digits
        boolean newBoolean = true;
        // Stores only 2 values : true or false!
        char newChar = 64;
        // Char stores single character/letters or values (as used above) from the ASCII table
        // 64 in the ASCII table = @
        System.out.println(name + "\n" + newByte + "\n" + newShort + "\n" + newInt + "\n" +
                           newLong + "\n" + newFloat + "\n" + newDouble + "\n" + newBoolean + "\n" + newChar);
    }
}
