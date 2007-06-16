package ch07;
// Fig. 7.10: DeckOfCards.java
// classe DeckOfCards representa um baralho.
import java.util.Random;

public class DeckOfCards
{
   private Card deck[]; // array de objetos Card
   private int currentCard; // �ndice do pr�ximo Card a ser distribu�do
   private final int NUMBER_OF_CARDS = 52; // n�mero constante de Cards
   private Random randomNumbers; // gerador de n�mero aleat�rio

   // construtor preenche baralho de cartas
   public DeckOfCards()
   {
      String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };    
      String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };     

      deck = new Card[ NUMBER_OF_CARDS ]; // cria array de objetos Card
      currentCard = 0; // configura currentCard ent�o o primeiro Card distribu�do � deck[ 0 ]
      randomNumbers = new Random(); // cria gerador de n�mero aleat�rio

      // preenche baralho com objetos Card
      for ( int count = 0; count < deck.length; count++ )        
         deck[ count ] =                                         
            new Card( faces[ count % 13 ], suits[ count / 13 ] );
   } // fim do construtor DeckOfCards

   // embaralha as cartas com um algoritmo de uma passagem
   public void shuffle()
   {
      // depois de embaralhar, a distribui��o deve iniciar em deck[ 0 ] novamente
      currentCard = 0; // reinicializa currentCard

      // para cada Card, seleciona outro Card aleat�rio e os compara
      for ( int first = 0; first < deck.length; first++ )
      {
         // seleciona um n�mero aleat�rio entre 0 e 51
         int second =  randomNumbers.nextInt( NUMBER_OF_CARDS );

         // compara Card atual com Card aleatoriamente selecionado
         Card temp = deck[ first ];     
         deck[ first ] = deck[ second ];
         deck[ second ] = temp;         
      } // for final
   } // fim do m�todo shuffle

   // distribui um Card
   public Card dealCard()
   {
      // determina se ainda h� Cards a serem distribu�dos
      if (currentCard < deck.length)
         return deck[ currentCard++ ]; // retorna Card atual no array
      else        
         return null; // retorna nulo p/ indicar que todos os Cards foram distribu�dos
   } // fim do m�todo dealCard
} // fim da classe DeckOfCards


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/