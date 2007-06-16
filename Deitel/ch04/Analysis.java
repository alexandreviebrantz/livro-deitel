package ch04;
//Fig. 4.12: Analysis.Java
//An�lise dos resultados dos exames.
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
			// solicita ao usu�rio uma entrada e obt�m valor fornecido pelo usu�rio
			System.out.print( "Enter result (1 = pass, 2 = fail): " );
			result = input.nextInt();

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