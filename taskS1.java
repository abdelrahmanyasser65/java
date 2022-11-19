import java.util.Scanner;

class calasss {
    public static void main(String[] args) {  
    
       factorial();

    }
    public static void factorial(){

        while(true){
            try{
                
              System.out.print("Please enter the number: ");
              String number =new Scanner(System.in).nextLine();
              int fact=1;
              if(Integer.parseInt(number)>0){
                for(int i=1;i<=Integer.parseInt(number);i++){
                  fact=fact*i;
                 
                }
                System.out.println("Factorial of "+number +" is "+fact);
              }
              else{
                  System.out.println("Wrong!");
              }
  
     
     break;
     }
     catch(Exception exception
     ){
       System.out.println("Wrong! please try again");
     
       }
    }}
                  
    }