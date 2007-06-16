package ch03;
//Fig. 3.11: GradeBookTest.Java
//construtor GradeBook utilizado para especificar o nome do curso na
//hora em que cada objeto GradeBook � criado.

public class GradeBookTest03_11
{
	// m�todo main inicia a execu��o do programa
	public static void main( String args[] )
	{ 
		// cria objeto GradeBook
		GradeBook03_10 gradeBook1 = new GradeBook03_10(
		"CS101 Introduction to Java Programming" );
		GradeBook03_10 gradeBook2 = new GradeBook03_10(
		"CS102 Data Structures in Java" );

		// exibe valor inicial de courseName para cada GradeBook
		System.out.printf( "gradeBook1 course name is: %s\n",
				gradeBook1.getCourseName() );
		System.out.printf( "gradeBook2 course name is: %s\n",
				gradeBook2.getCourseName() );
	} // fim de main

} // fim da classe GradeBookTest


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