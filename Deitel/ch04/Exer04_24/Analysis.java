package ch04.Exer04_24;

import java.util.Scanner; // classe utiliza a classe Scanner

public class Analysis 
{
   public void processExamResults()
   {
      // cria Scanner para obter entrada a partir da janela de comando
      Scanner input = new Scanner( System.in );

      // inicializando vari�veis nas declara��es
      int passes = 0; // n�mero de aprova��es
      int failures = 0; // n�mero de reprova��es
      int studentCounter = 1; // contador de alunos
      int result; // um resultado do exame (obt�m o valor a partir do usu�rio)

      // processa 10 alunos utilizando o loop controlado por contador
      while ( studentCounter <= 10 ) 
      {
    	  result = 0;

    	 // solicita ao usu�rio uma entrada e obt�m valor fornecido pelo usu�rio
         System.out.print( "Enter result (1 = pass, 2 = fail): " );

         while ((result != 1) && (result!=2)){
        	 result = input.nextInt();
        	 if ((result != 1) && (result!=2))
        		 System.out.println("Invalid input");
         }

         // if...else aninhado em while
         if ( result == 1 )          // if resultar 1,
            passes = passes + 1;     // incrementa aprova��es;
         else                        // else resultado n�o � 1, ent�o
            failures = failures + 1; // incrementa reprova��es

         // incrementa studentCounter at� o loop terminar
         studentCounter = studentCounter + 1;  
      } // fim do while

      // fase de t�rmino; prepara e exibe os resultados
      System.out.printf( "Passed: %d\nFailed: %d\n", passes, failures );

      // determina se mais de 8 alunos foram aprovados
      if ( passes > 8 )
         System.out.println( "Raise Tuition" );
   } // fim do m�todo processExamResults

} // fim da classe Analysis