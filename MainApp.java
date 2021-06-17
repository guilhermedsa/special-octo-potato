import java.util.Random;
import java.util.Scanner;
/**
 * A classe {@code MainApp} contém um programa baseado no jogo mortal, roleta russa.
 * O programa nesta classe, possui verificação de entrada e mensagem ao usuário.
 * 
 * 
 * @author Guilherme Alves (g.alves001@edu.pucrs.br)
 * @version 2021-06-17
 */
public class MainApp
{
    public static void main(String[] args)
 {  
  Scanner keyboard;
  keyboard = new Scanner(System.in);
  String[] magazine;
  magazine = Auxiliar.init();
  int x;
  int y;
  y = 0;
  System.out.println("Press any button to start!");
  x = keyboard.nextInt();
 while(y != 2)
{
 int random =(int)(Math.random()*6);
 System.out.println("You spin the cylinder, pull the trigger and......");
 System.out.println(magazine[random]);
 System.out.println("Would you like to keep playing? ");
 System.out.println(" 1 - Yes || 2 - No ");
 y = keyboard.nextInt();
 while( y > 2 || y < 1 )
 {
   System.out.println("Invalid option, please select again.");  
   System.out.println(" 1 - Yes || 2 - No ");
   y = keyboard.nextInt();
 }
 }
 keyboard.close(); 
 System.out.println("The End!");
}
}