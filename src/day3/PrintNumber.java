package day3;

public class PrintNumber {
    public  static  void main(String[] args)
    {
//        printChainOfNums(5);
        printChainOfNums2(5);

    }
//    public static void printChainOfNums(int n)
//    {
//        if(n==0)
//        {
//            return;
//        }
//        System.out.println(n);
//        printChainOfNums(n-1);
//    }
    public  static  void printChainOfNums2(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printChainOfNums2(n-1);
    }
    public  static  void printChainOfNums3()
    {
        System.out.println(1);
        printChainOfNums3();
    }
    public  static  void printChainOfNums4()
    {
        System.out.println(2);
        printChainOfNums3();
    }
}
