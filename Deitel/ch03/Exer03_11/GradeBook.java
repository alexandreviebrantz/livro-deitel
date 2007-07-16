//Parte do exerc�cio 3.11
package ch03.Exer03_11;

public class GradeBook {
	private String courseName;
	
	//Quest�o A - Vari�vel instrutor
	private String instrutor;

	//	Quest�o C - Modificar construtor
	public GradeBook( String name, String nomeInstrutor )                                       
	{                                                                     
		courseName = name;
		instrutor = nomeInstrutor;
	}

	//Quest�o B - Inserir get e set para instrutor
	public void serInstrutor(String instrutorNome){
		instrutor = instrutorNome;
	}
	public String getInstrutor(){
		return instrutor;
	}
	
	public void setCourseName( String name )
	{
		courseName = name;
	}

	public String getCourseName()
	{
		return courseName;
	}

	public void displayMessage()
	{
		System.out.printf( "Welcome to the grade book for\n%s!\n\n", 
				getCourseName() );
		System.out.printf("This couse is presented by:\n%s!\n",
				getInstrutor());
	}
}
