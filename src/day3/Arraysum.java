package day3;

public class Arraysum {
    public  static  void  main (String[] argd)
    {
//        int sum=0;
        int[] arrayInt={1,2,3,4,5,};
//        for (int i=0;i<arrayInt.length;i++)
//        {
//            sum += arrayInt[i];
//        }
//        System.out.println( sum);
      int rerult=  sumarray(arrayInt,0);

        System.out.println(rerult);

    }

    public  static  int sumarray(int [] array,  int index)
    {
        //trường hợp này khi tới phần tử cuối cùng thì trả về array
        if(index ==array.length-1)
        {
            return array[index];
        }
        return array[index]+ sumarray(array,index+1);
    }

    public static int sum(int a, int b)
    {
        return a + b;
    }


}

