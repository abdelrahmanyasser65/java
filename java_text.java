// import java.util.Calendar;
// import java.util.Scanner;

// class test{
  
//     public static void main(String [] arg){
//        System.out.println("he");
//         /*
//          * print: System.out.println("text");
//          * input: String s = new Scanner (System.in).nextLine();
//          * input int:  int i = new Scann23er(System.in).nextInt();
//          * int[]x=new int[6];
//          * int[]y={44,44,5,5};
//          * for(var c :y ){
//          * System.out.println(c);
//          * }
//          * ArrayList<int>y =new ArrayList<int>();
//          */
             
//          /*
//           * Age Calculator
//            System.out.print("Entter Your Birth Year: ");
//           int birthYear=new Scanner(System.in).nextInt();
//           int currentYear=Calendar.getInstance().get(Calendar.YEAR);
//           int age=currentYear-birthYear;
//           System.out.println("Your age is : "+ age+" Years Old");
//           */
                        
//           /*
//            * Degree Calculator
//            *  System.out.print("Enter Your Degree: ");
//             int degree=new Scanner(System.in).nextInt();
//            if(degree>90){System.out.println("A");}
//            else if(degree>80){System.out.println("B");}
//            else if(degree>70){System.out.println("C");}
//            else if(degree>60){System.out.println("D");}
//            else{System.out.println("F");}
//            */
                     
//            /*
//             * Exception
//             While(true){
//                  try{
//             System.out.print("Entter Your Birth Year: ");
//           int birthYear=new Scanner(System.in).nextInt();
//           System.out.println(birthYear);
//           break;
//           }
//           catch(Exception exception
//           ){
//             System.out.println("Wrong!");
//           }
//             }
//             */
         
      
//      }

//      /*
//       * public static void printMax(double... numbers){
//         if(numbers.length==0){
//             System.out.println("No argument passed");
//             return ;
//         }
//         double result=numbers[0];
//         for(int i =1;i<numbers.length;i++){
//             if(numbers[i]>result)
//             result=numbers[i];
//         }
//         System.out.println("The max value is :"+result);
//      }
//       */
    
//     /*
//      *  public static int sum(){
//         System.out.print("Enter the first number: ");
//         int first = new Scanner(System.in).nextInt();
//         System.out.print("Enter the last number: ");
//         int secound = new Scanner(System.in).nextInt();
//         return first+secound;
//       }
//      */
// }
// import javax.swing.*;
// //import java.awt.FlowLayout;
// import java.awt.*;
// class Frame extends JFrame{
//     JButton button;
//     JLabel label;
//    public Frame(){
//     this.setTitle("Geometerical");
//     this.setSize(500,200);
//     this.setVisible(true);
//     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     this.setResizable(false);
//     // this.setLayout(new FlowLayout(
//     //     FlowLayout.CENTER,
//     //     30,40
//     // ) );
//     // this.setLayout(new GridLayout(2,3,10,10));
//     this.setLayout(null);
//     button=new JButton("Exit");
//     label=new JLabel("Hello ");
    
//     this.add(label);
//     this.add(button);
//     button.setBounds(10,10,150,50);

//    }
   
   
   
//     public static void main(String args[]){
//      new Frame();
//     }
// }