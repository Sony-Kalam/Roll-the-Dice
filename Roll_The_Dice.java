import java.util.*;
class Roll_The_Dice
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
int i=1;
while(i<100)
{
System.out.println("Round "+i);
System.out.println();
System.out.println("Player1 turn:");
System.out.print("roll die:");
Random rand=new Random();
int randomnum= rand.nextInt(6)+1;
s.nextLine();
System.out.println("you got:"+randomnum);
System.out.println("your score:"+randomnum);
System.out.println();
System.out.println("Player2 turn:");
System.out.print("roll die:");
int random=rand.nextInt(6)+1;
s.nextLine();
System.out.println("you got:"+random);
System.out.println("your score:"+random);
System.out.println();
if(randomnum>random)
{
System.out.println("Winner is Player1");
}
else if(random>randomnum)
{
System.out.println("Winner is Player2");
}
else
{
System.out.println("Both are Winners");
}
System.out.println();
System.out.println("Do you want to play again:(yes/no):");
String yn=s.nextLine();
if (yn.equalsIgnoreCase("yes"))
{
i++;
}
else if(yn.equalsIgnoreCase("no"))
{
System.out.println("thank you for playing the game!");
break;
}
else
{
System.out.println("Invalid Input");
break;
}
}
}
}
