import java.util.Random;
import java.util.Scanner;
/**
 * A classe {@code Main} contém a base para o jogo Roleta Russa
 * fazendo uso de vetores.
 * 
 * @author Guilherme Alves (g.alves001@edu.pucrs.br)
 * @version 2021-06-17
 */
public class Main
{
public static String[] init()
{
  String[] magazine;
  magazine = new String[6];
  magazine[0] = "Empty! You're alive to play again!";
  magazine[1] = "Empty! You're alive to play again!";
  magazine[2] = "Empty! You're alive to play again!";
  magazine[3] = "Empty! You're alive to play again!";
  magazine[4] = "You're dead !";
  magazine[5] = "Empty! You're alive to play again!";
  return magazine;
}

    public static void main(String[] args)
{  
  Scanner keyboard;
  keyboard = new Scanner(System.in);
  String[] magazine;
  magazine = Auxiliar.init();

  int random =(int)(Math.random()*6);
  System.out.println("You spin the cylinder, pull the trigger and......");
  System.out.println(magazine[random]);

 System.out.println("The End!");
 keyboard.close();
}
}