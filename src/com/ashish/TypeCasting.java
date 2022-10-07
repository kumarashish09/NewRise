package com.ashish;
/**Rule of thumb: When doing an arithmetic calculation between two different built-in types,
 * the "smaller" type will be converted into the "larger" type.

 double > float > long long(C99) > long > short > char.

 b = (float)15/2 + 15/2;
 Here the first part, (float)15/2 is equivalent to 15.0f / 2.
 Because an operation involving a "larger" type and a "smaller" type will yield
 a result in the "larger" type, (float)15/2 is 7.500000, or 7.5f.

 When it comes to 15/2, since both operands are integers,
 the operation is done only on integer level.
 Therefore,the decimal point is stripped (from int), and only gives 7 as a result.
 So the expression is calculated into

 b = 7.5f + 7;
 No doubt you'll have 14.500000 as the final result, because it's exactly 14.5f.*/

import java.util.Scanner;

 class TypeCasting {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         //int i=sc.nextFloat();//error
//        float f= sc.nextInt();//eg 25
//        System.out.println(f);//o/p 25.0
//        float f1= sc.nextFloat();
//        System.out.println(f1);
//         int f = 5;
//         float f1 = 10.2f;
//         float sum = f + f1;
//         System.out.println(sum);//15.2



//narrow conversion eg float to  int conversion

//     int num = (int) (67.5f);
//         System.out.println(num);//67

         //automatic type promotion in expressions
         //maximum value that can be store in 1 byte is 256
//         byte b= (byte) 257;
//         System.out.println(b);//o/p is 1
//         byte b=50;
//         b= (byte) (b*6);
//         System.out.println(b);
//
//         int number ='A';
//         System.out.println(number);//65
//         //java follows unicode
//         System.out.println("नमस्ते");//नमस्ते
//         System.out.println('म');//म
//         System.out.println("你好");//你好
         /**UNICODE AND ASCII
         Unicode is the universal character encoding used to process,
          store and facilitate the interchange of text data in any language
          while ASCII is used for the representation of text such as symbols, letters, digits, etc.
          in computers*/

         //AUTOMATIC PROMOTION
        // System.out.println(3*5.6);//16.799999999999997
         //System.out.println(3*5.6f);//16.8

         byte b=42;
         char c='a';
         short s= 1024;
         int i=5000;
         float f=5.67f;
         double d=0.1234;
         double result=(f*b)+(i/c)-(d*s);
         System.out.println((f*b) + " " + (i/c) + " " +(d*s));//shorter data type
                                        // is converted into longer data type
         System.out.println(result);

}
}

