import java.util.Scanner;

class Geometerical{
    public static void main(String [] arg){
        chooseProcess();
    }
    //static int i =0;
    class g{
        static int i=0;
        static int u=0;
    }
    
    public static void perimeterSquare( ){
        
        while(true){
            try{
               
    System.out.print("Please enter the dimension of the square: ");
     String lenght=new Scanner(System.in).nextLine();
     if(Integer.parseInt(lenght) >0){
      System.out.println("Perimeter square = "+ Double.parseDouble(lenght)*4+" cm");}
      else{
        g.i ++;
        if(g.i == 5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
        System.out.println("Wrong! please try again");
      
        perimeterSquare();

      }
      break;
     }
     catch(Exception exception
     ){
        g.u ++;
        if(g.u+g.i==5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
       System.out.println("Wrong! please try again");
     }
       }
    }
    public static void squareArea(){
        
        while(true){
            try{
                System.out.print("Please enter the dimension of the square: ");
                String lenght=new Scanner(System.in).nextLine();
                if(Integer.parseInt(lenght) >0 ){
                 System.out.println("Area of square = "+ Double.parseDouble(lenght)*Double.parseDouble(lenght)+" cm^2");
             }
             else {
                g.i ++;
        if(g.i == 5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
                System.out.println("Wrong! please try again");
                squareArea();
             }
     break;
     }
     catch(Exception exception
     ){
        g.u ++;
        if(g.u+g.i==5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
       System.out.println("Wrong! please try again");
     }
       } 
    }
   
    
    public static void perimeterRectangle(){
        
        while(true){
            try{
     System.out.print("Please enter the rectangle length: ");
     String lenght=new Scanner(System.in).nextLine();
     System.out.print("Please enter the rectangle breadth: ");
     String breadth=new Scanner(System.in).nextLine();
     if(Integer.parseInt(lenght) >0 && Integer.parseInt(breadth)>0){
      
      System.out.println(" Perimeter Rectangle = "+ (Double.parseDouble(lenght)+Double.parseDouble(breadth))*2+" cm");  
  }
  else{
    g.i ++;
        if(g.i == 5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
    System.out.println("Wrong! please try again");
                perimeterRectangle();
  }

     
     break;
     }
     catch(Exception exception
     ){
        g.u ++;
        if(g.u+g.i==5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
       System.out.println("Wrong! please try again");
     }
       } 
   
    }
    public static void rectangleArea(){
        
        while(true){
            try{
     System.out.print("Please enter the rectangle length: ");
     String lenght=new Scanner(System.in).nextLine();
     System.out.print("Please enter the rectangle breadth: ");
     String breadth=new Scanner(System.in).nextLine();
     
     if(Integer.parseInt(lenght) >0 && Integer.parseInt(breadth)>0){
        System.out.println(" Area of Rectangle = "+ (Double.parseDouble(lenght) * Double.parseDouble(breadth))+" cm^2");
     }
      
     else{
        g.i ++;
        if(g.i == 5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
        System.out.println("Wrong! please try again");
                    rectangleArea();
      }
     
     break;
     }
     catch(Exception exception
     ){
        g.u ++;
        if(g.u+g.i==5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
       System.out.println("Wrong! please try again");
     }
       } 
   
  
    }
  
    public static void circumferenceOfCircle(){
        
        double pi=3.14;
        while(true){
            try{
                System.out.print("Please enter the radius of the circle: ");
                String radius=new Scanner(System.in).nextLine();
       if(Integer.parseInt(radius)>0){
        System.out.println("Circumference of a Circle = "+2 * pi* Double.parseDouble(radius)+" cm");
       }
       else{
        g.i ++;
        if(g.i == 5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
        System.out.println("Wrong! please try again");
        circumferenceOfCircle();
       }
     break;
     }
     catch(Exception exception
     ){
        g.u ++;
        if(g.u+g.i==5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
       System.out.println("Wrong! please try again");
     }
       }
   
    }
    public static void circleArea(){
        
        double pi=3.14;
        while(true){
            try{
                System.out.print("Please enter the radius of the circle: ");
                String radius=new Scanner(System.in).nextLine();
     if(Integer.parseInt(radius)>0){
        System.out.println("Circle Area = "+pi*Double.parseDouble(radius)*Double.parseDouble(radius)+" cm^2");
     }
     else{
        g.i ++;
        if(g.i == 5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
        System.out.println("Wrong! please try again");
        circleArea();
     }
     break;
     }
     catch(Exception exception
     ){
        g.u ++;
        if(g.u+g.i==5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
       System.out.println("Wrong! please try again");
     }
       }
   
    }
  
    public static void perimeterTriangle(){
        
        while(true){
            try{
System.out.print("Please enter the length of the first side: ");
String firstLength=new Scanner(System.in).nextLine();
     System.out.print("Please enter the length of the second side: ");
     String secondeLength=new Scanner(System.in).nextLine();
     System.out.print("Please enter the length of the third side: ");
     String thirdLength=new Scanner(System.in).nextLine();
    if(Integer.parseInt(firstLength)>0
    &&Integer.parseInt(secondeLength)>0
    &&Integer.parseInt(thirdLength)>0
    ){
        System.out.println("Perimeter Triangle = "+(Double.parseDouble(firstLength) +Double.parseDouble(secondeLength) +Double.parseDouble(thirdLength) )+" cm");
    }
    else{
        g.i ++;
        if(g.i == 5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
        System.out.println("Wrong! please try again");
        perimeterTriangle(); 
    }
     break;
     }
     catch(Exception exception
     ){
        g.u ++;
        if(g.u+g.i==5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
       System.out.println("Wrong! please try again");
     }
       } 
   
    }
    public static void triangleArea(){
        

        while(true){
            try{
System.out.print("Please enter the height: ");
String height=new Scanner(System.in).nextLine();
     System.out.print("Please enter the base length: ");
     String baseLength=new Scanner(System.in).nextLine();
     if(Integer.parseInt(height)>0&&
     Integer.parseInt(baseLength)>0
     ){
        System.out.println("Triangle Area = "+(0.5*Double.parseDouble(baseLength) *Double.parseDouble(height) )+" cm^2");
     }
     else{
        g.i ++;
        if(g.i == 5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
        System.out.println("Wrong! please try again");
        triangleArea();
     }
     break;
     }
     catch(Exception exception
     ){
        g.u ++;
        if(g.u+g.i==5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
       System.out.println("Wrong! please try again");
     }
       } 
   
    }
    
    public static void chooseCircumference(){
        
        while(true){
            try{
                System.out.println("Please enter the shape number ");
                System.out.println("1- Square");
                System.out.println("2- Rectangle");
                System.out.println("3- Circle");
                System.out.println("4- Triangle");
                System.out.print("Enter number : ");
                String index=new Scanner(System.in).nextLine();
                
                if(Integer.parseInt(index) ==1 ){
                    perimeterSquare();
                    
                }
                else if(Integer.parseInt(index)==2){
                    perimeterRectangle();
                }
                else if (Integer.parseInt(index)==3){
                    circumferenceOfCircle();
                }
                else if(Integer.parseInt(index)==4){
                    perimeterTriangle();
                }
                else{
                    g.i ++;
        if(g.i == 5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
                    System.out.println("out of range! please try again");
                    chooseCircumference();
                }
     break;
     }
            catch(Exception exception){
                g.u ++;
        if(g.u+g.i==5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
              System.out.println("Wrong! please try again");
            }
        }
    }
    public static void chooseArea(){
        
        while(true){
            try{
                System.out.println("Please enter the shape number ");
                System.out.println("1- Square");
                System.out.println("2- Rectangle");
                System.out.println("3- Circle");
                System.out.println("4- Triangle");
                System.out.print("Enter number : ");
                String index=new Scanner(System.in).nextLine();
                if(Integer.parseInt(index)==1){
                    squareArea();
                }
                else if(Integer.parseInt(index)==2){
                    rectangleArea();
                }
                else if (Integer.parseInt(index)==3){
                    circleArea();
                }
                else if(Integer.parseInt(index)==4){
                    triangleArea();
                }
                else{
                    g.i ++;
        if(g.i == 5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
                    System.out.println("out of range! please try again");
                    chooseArea();
                }
     break;
     }
     catch(Exception exception
     ){
        g.u ++;
        if(g.u+g.i==5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
       System.out.println("Wrong! please try again");
     }
        }
  
    }
    public static void chooseProcess(){
        
        while(true){
            try{
                System.out.println("Please enter the process number you want");
                System.out.println("1- circumference calculation");
                System.out.println("2- Area calculation");
                System.out.println("3- Cancel");
                System.out.print("Enter number : ");
                 String index=new Scanner(System.in).nextLine();
                
                if(Integer.parseInt(index) ==1 ){
                    chooseCircumference();
                    chooseProcess();
                }
                else if(Integer.parseInt(index)==2){
                    chooseArea();
                    chooseProcess();
                }
                
                else if(Integer.parseInt(index)==3){
                    System.out.println("Thank You...");
                
                }
                else{
                    g.i ++;
        if(g.i == 5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
                    System.out.println("out of range! please try again");
                    chooseProcess();
                }
     break;
     }
            catch(Exception exception){
                g.u ++;
        if(g.u+g.i==5){
            System.out.println("thanks! try again another time");  
            System.exit(0);
        }
              System.out.println("Wrong! please try again");

            }
     
             
     }
       } 
}