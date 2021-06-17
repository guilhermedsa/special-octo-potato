/**
 * A classe {@code Auxiliar} contém um subprograma que retorna um vetor
 * com 6 matrizes do tipo String.
 * 
 * @author Guilherme Alves (g.alves001@edu.pucrs.br)
 * @version 2021-06-17
 */
class Auxiliar{
    /**
     *  O metódo init retorna o arranjo de 6 vetores, sendo eles
     *  todos do tipo String.
     *  
     *  @return todos os Strings dentro do vetor.
     */
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
}