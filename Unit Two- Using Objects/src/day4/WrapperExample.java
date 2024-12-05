package day4;

public class WrapperExample {
    public static void main(String[] args) {
      Integer int1 = new Integer(7);
        System.out.println(int1.intValue());

    Integer int2 = 8;               //took the primitive 8 and wrapped it in a Integer
                                    //auto-boxing
    System.out.println(int2);      //auto unboxing -> convers to a primitive without using intValue()

    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

}
}
