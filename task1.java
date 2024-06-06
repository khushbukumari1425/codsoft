import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int score=0;
        int ch=0;
        int Totalscore=0;
  Scanner sc=new Scanner(System.in);

      
        do {
        Random random=new Random();
        int Secretnumber=random.nextInt(1, 100);
        System.out.println(Secretnumber);
        
            System.out.println("SELECT FOR THE NUMBER OF ATTEMPTS YOU WANT TO PLAY........ ");
            System.out.println("------ALERT!!  THE SCORES WILL BE GIVEN ON THE BASIS , IN HOW MANY ATTEMPTS YOU CAN GUESS THE NUMBER------");
            System.out.print("1. ONE ATTEMPTS ALLOWED  ");
            System.out.print("2. TWO ATTEMPTS ALLOWED  ");
            System.out.print("3. THREE ATTEMPTS ALLOWED  ");
            System.out.print("4. FOUR ATTEMPTS ALLOWED   ");
            System.out.println("5. FIVE ATTEMPTS ALLOWED   ");
            System.out.print(" ENTER YOUR CHOICE FOR THE ABOVE OPTIONS :   ");

      
       int choice=sc.nextInt();
       int a = choice;
       int guessedbyuser=0;
       switch (choice) {
           case 1:
           System.out.println("guess a number.......");
           guessedbyuser=sc.nextInt();

           if(Secretnumber==guessedbyuser)
           {  score=10;
               
               System.out.println("your score is "+score+" in "+a+" attempts " );
               
               break;
               
           }
           else if (guessedbyuser<Secretnumber) {
               System.out.println("number too lowww....");
                System.out.println("number of attempts left are "+(a-1));
                }
           else{
               System.out.println("number too high...");
               System.out.println("number of attempts left are "+(a-1));
               }
           

           break;
            case 2:
            for (int i = 1; i <= choice; i++) {
                
            System.out.println("guess a number.......");
            guessedbyuser=sc.nextInt();
            
            if(Secretnumber==guessedbyuser)
            {   score=11-i;
                System.out.println("your score is "+score+" in "+(i)+" attempts " );
                
                break;
                
            }
            else if (guessedbyuser<Secretnumber) {
                System.out.println("number too lowww....");
                 System.out.println("number of attempts left are "+(a-i));
                 }
            else{
                System.out.println("number too high...");
                 System.out.println("number of attempts left are "+(a-i));
                }
            }
            

                
                break;
            case 3:
            for (int i = 1; i <= choice; i++) {
                
                System.out.println("guess a number.......");
                guessedbyuser=sc.nextInt();
                
                if(Secretnumber==guessedbyuser)
                {   score=11-i;
                    System.out.println("your score is "+score+" in "+(i)+" attempts " );
                    break;
                    
                }
                else if (guessedbyuser<Secretnumber) {
                    System.out.println("number too lowww....");
                    System.out.println("number of attempts left are "+(a-i));
                     }
                else{
                    System.out.println("number too high...");
                    System.out.println("number of attempts left are "+(a-i));

                    }
                }
                

                break;
            case 4:
            for (int i = 1; i <= choice; i++) {
                
                System.out.println("guess a number.......");
                guessedbyuser=sc.nextInt();
                
                if(Secretnumber==guessedbyuser)
                {   score=11-i;
                    
                    System.out.println("your score is "+score+" in "+(i)+" attempts " );
                    break;
                    
                }
                else if (guessedbyuser<Secretnumber) {
                    System.out.println("number too lowww....");
                     System.out.println("number of attempts left are "+(a-i));
                     }
                else{
                    System.out.println("number too high...");
                     System.out.println("number of attempts left are "+(a-i));
                    }
                }
          break;
                case 5:
                for (int i = 1; i <= choice; i++) {
                
                    System.out.println("guess a number.......");
                    guessedbyuser=sc.nextInt();
                    
                    if(Secretnumber==guessedbyuser)
                    {   score=11-i;
                        System.out.println("your score is "+score+" in "+(i)+" attempts " );
                       
                        break;
                        
                    }
                    else if (guessedbyuser<Secretnumber) {
                        System.out.println("number too lowww....");
                         System.out.println("number of attempts left are "+(a-i));
                         }
                    else{
                        System.out.println("number too high...");
                        System.out.println("number of attempts left are "+(a-i));
                        }
                    }
                 

                    
                    break;
                
           default:
               System.out.println("invalid option....");


            }
        Totalscore=Totalscore+score;
        System.out.println("THE SECRET NUMBER WAS :  "+ Secretnumber);
        System.out.print("DO YOU WANT TO CONTINUE GUESSING THE NEXT SECRET NUMBER....?---1.YES/0.NO.---  ");
        ch=sc.nextInt();
        
           
        } while (ch!=0 );
if(Totalscore==0)
{
System.out.println("OH NO!,YOU LOST........");

System.out.println("your total score is  " +Totalscore);
}
else{
System.out.println("Congratulationssss!!!......");
System.out.println("your total score is  " +Totalscore);
}


       }
}