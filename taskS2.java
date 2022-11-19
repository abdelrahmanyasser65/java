import java.util.Scanner;

class TaskS2 {
   static Scanner input=new Scanner(System.in);
 public static void main(String[]args){
       inputSalary();
 }   
 
 
 public static void inputHour(Double slary){
    while(true){
        try{
          
System.out.print("Please enter Hour : ");
 String hour=input.nextLine();
 if(Integer.parseInt(hour)>0){
  totalSalary(slary, Integer.parseInt(hour));
  target(slary);
}
 else{
    System.out.println("Wrong! please try again");
    inputHour(0.0);
 }
 break;
 }
 catch(Exception exception
 ){
    
   System.out.println("Wrong! please try again");
 }
   }


 } 

 public static void inputSalary(){
    while(true){
        try{
          
System.out.print("Please enter your salary : ");
 String salary=input.nextLine();
 if(Double.parseDouble(salary)>0){
  inputHour(Double.parseDouble(salary));
}
 else{
    System.out.println("Wrong! please try again");
    inputSalary();
 }
 break;
 }
 catch(Exception exception
 ){
    
   System.out.println("Wrong! please try again");
 }
   }


 } 
 public static void totalSalary(double salary,int hour){
    double totalSalary=0;
    if(salary>30000){
        totalSalary=salary-(salary*0.15);
        System.out.println("The salary after lessening = "+totalSalary);
    }else{
        totalSalary=salary-(salary*0.1);
        System.out.println("The salary after lessening = "+totalSalary);
    }
    int addition=hour*500;
    double finalTotal=addition+totalSalary;
    if(hour>15){
        finalTotal=finalTotal-(finalTotal*0.15);
        System.out.println("The salary  ="+finalTotal);
    }
    else{
        finalTotal=finalTotal-(finalTotal*0.1);
        System.out.println("The salary  ="+finalTotal);
    }
 }
 public static void target(double salary){
    for(int i =0;i<12;i++){
        salary=salary+(salary*0.05);
        System.out.println("target you be in the month "+ (i+1) +"= " +salary);

    }
    
 }
}
