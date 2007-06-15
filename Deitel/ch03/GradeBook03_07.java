package ch03;

//Fig. 3.7: GradeBook.java
//classe GradeBook que cont�m uma vari�vel de inst�ncia courseName
//e m�todos para configurar e obter seu valor.

public class GradeBook03_07
{
private String courseName; // nome do curso para esse GradeBook

// m�todo para configurar o nome do curso
public void setCourseName( String name )      
{                                             
   courseName = name; // armazena o nome do curso
} // termina o m�todo setCourseName

// m�todo para recuperar o nome do curso
public String getCourseName()        
{                                    
   return courseName;                
} // termina o m�todo getCourseName

// exibe uma mensagem de boas-vindas para o usu�rio GradeBook
public void displayMessage()
{
   // essa instru��o chama getCourseName para obter o
   // nome do curso que esse GradeBook representa
   System.out.printf( "Welcome to the grade book for\n%s!\n", 
      getCourseName() );
} // termina o m�todo displayMessage

} // fim da classe GradeBook