/**
 * Created by Justyna on 22.05.2017.
 */
public class Calculator {
    public static void main(String[] args) {
        IntegerMath dodawanie = (a, b) -> a + b; //{return a+b;}
        IntegerMath odejmowanie = (a, b) -> a - b; //{return a-b;}
        IntegerMath mnozenie = (a, b) -> a * b;
        IntegerMath dzielenie = (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Nie dziel cholero przez zero");
            }
            return a / b;
        };
        System.out.println(additionBinary(5, 10, (a, b) -> a + b)); //15
        System.out.println(additionBinary(20, 10, (a, b) -> a - b));//10
        System.out.println(additionBinary(20, 10, (a, b) -> a * b));//200
        System.out.println(additionBinary(20, 0, (a, b) -> a / b));//2


        // System.out.println(additionBinary(5,10,dodawanie)); //15
        // System.out.println(additionBinary(20,10, odejmowanie));//10

    }

    public static int additionBinary(int a, int b, IntegerMath math) {
        return math.addition(a, b);
    }
    // private int addition( int a, int b){
    //return a+b;
}




//xd