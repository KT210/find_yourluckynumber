//Number Guessing game <3 <3 <3
//Find your lucky num in int array(1D) of 0 to 100 
import java.util.*;
public class findthemissingnum {


    public static void main (String args[]){
        String h;
        int usernum;
        String next;
        

        //initialize array
        int intarray [] = new int [100];
        //do while for asking the user again and again

        do{
            var scan = new Scanner(System.in);
        
            System.out.println("This is a number finding game in a 1D random array\nNumbers are gererated randomly to an array if the user wants to play!\nIf u want to start or continue the program Enter Y or y\nOR Enter anything to be asked again \nOR Enter N or n to quit!!!");
            h = scan.nextLine(); 

            if(h.equals("Y")||h.equals("y")){
                
                System.out.println("Enter your lucky number!!!");
                //usernum = scan.nextInt();
                
                usernum = getInt();   // good but need modi
                
                
                ranmaker(intarray);
                check(intarray,usernum);

                do{
                    System.out.println("Want to try again(Y/N)?\n(Y|y)for continue trying the existing array\n(N|n) for end this game and Start new Game:)\nOr Put anything to EXIT from game");
                    next    = scan.next();
                    if(next.equals("Y")||next.equals("y")){
                    
                        System.out.println("Enter your lucky number again!!!");
                        usernum = getInt();
                        check(intarray,usernum);
                        continue;
                    }
                    else if(next.equals("N")||next.equals("n")) {
                        System.out.println("Ok New Game Then!!");
                        continue;
                    }
                    else{
                        System.out.println("GOOD BYE___________________________________________________________________________________________________________________");
                        scan.close();
                        System.exit(0);
                    }
                }while(next.equals("Y")||next.equals("y"));
                

            }
            else if(h.equals("N")||h.equals("n")){
                System.out.println("Good Bye___________________________________________________________________________________________________________________");   
                scan.close();
                System.exit(0);
            }
            else{
                System.out.println("Enter only (Y,y) to run again or (N,n) to get out");
                h = scan.nextLine(); 
                continue;
            }

        }while(h.equals("Y")||h.equals("y"));

        
    }
    
    public static void ranmaker(int intarray[]) {
            
            
        //put int randomly in 1D array
        Random ran = new Random();

        for (int i=0; i<100; i++){
        
        intarray [i] = ran.nextInt(101);
        }
            
        for (int x=0; x<100; x++){
            System.out.print(intarray[x]+"_");
        }
        

    }

    public static void check(int intarray[],int num){
        int count = 0;
        boolean tf = false;
        for (int i=0; i<100; i++){
            if (intarray[i] == num){
                count += 1;
                if(count>0){
                    tf = true;
                }
                
            }
            
        }
        if (tf == true){
            
            System.out.println("\n"+"Your number "+num+" exists in our array\nAnd it exists "+count+" times\nHURRAY!!!");
            
        }
        else{

            System.out.println("\n"+"Sorry your number doesnt exist in our array\nGAME OVER!!!!");
        }
    }

    public static int getInt(){
        var scann = new Scanner(System.in);
        int b     = 0;
        while(true){
            try{
                return scann.nextInt();                
                           
            }
            catch(InputMismatchException e){
                scann.next();
                System.out.println("Thats not a number\n Try agatin!!!");
                b += 1;
                
            }
            
            finally{
                if(b == -1){
                    scann.close();
                }
            }
            
        }
        

        
        
    }
    

        
}