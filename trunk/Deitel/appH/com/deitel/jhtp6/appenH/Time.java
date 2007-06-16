// Fig. H.1: Time.java
// Declara��o da classe Time com os m�todos set e get.
package appH.com.deitel.jhtp6.appenH; // coloca a classe Time em um pacote

/**
 * Essa classe mant�m a hora no formato de 24 horas.
 *  @see java.lang.Object
 *  @author Deitel & Associates, Inc.
 */
public class Time
{
		private int hour;   // 0 - 23
		private int minute; // 0 - 59
		private int second; // 0 - 59

		/**
		 *  O construtor Time sem argumento inicializa cada vari�vel de inst�ncia
		 *  como zero. Isso assegura que objetos Time iniciem em um estado
		 *  consistente. @throws Exce��o no caso de uma data/hora inv�lida
		 */                                                                
		public Time() throws Exception
		{
			this( 0, 0, 0 ); // invoca o construtor Time com tr�s argumentos
		} // fim do construtor Time sem argumento

		/**                                                 
		 *  Construtor Time
		 *  @param h a hora
		 *  @throws Exce��o no caso de uma data/hora inv�lida
		 */                                                 
		public Time( int h ) throws Exception
		{ 
			this( h, 0, 0 ); // invoca o construtor Time com tr�s argumentos
		} // fim do construtor Time de um argumento.

		/** 
		 *  Construtor Time
		 *  @param h a hora
		 *  @param m o minuto
		 *  @throws Exce��o no caso de uma data/hora inv�lida
		 */
		public Time( int h, int m ) throws Exception
		{ 
			this( h, m, 0 ); // invoca o construtor Time com tr�s argumentos
		} // fim do construtor Time de tr�s argumentos

		/** 
		 *  Construtor Time
		 *  @param h a hora
		 *  @param m o minuto
		 *  @param s o segundo
		 *  @throws Exce��o no caso de uma data/hora inv�lida
		 */
		public Time( int h, int m, int s ) throws Exception
		{ 
			setTime( h, m, s ); // invoca setTime para validar a data/hora
		} // fim do construtor Time de tr�s argumentos

		/** 
		 *  constructor Time
		 *  @param time Um objeto Time com o qual inicializar
		 *  @throws Exce��o no caso de uma data/hora inv�lida
		 */
		public Time( Time time ) throws Exception
		{
			// invoca o construtor Time com tr�s argumentos
			this( time.getHour(), time.getMinute(), time.getSecond() );
		} // fim do construtor Time com o argumento Time 

		/**                                                         
		 * Configura um novo valor de usando hora universal. Verifica
		 *  validade dos dados. Configura valores inv�lidos como zero.
		 *  @param h a hora
		 *  @param m o minuto
		 *  @param s o segundo
		 *  @see com.deitel.jhtp6.appenH.Time#setHour                 
		 *  @see Time#setMinute      
		 *  @see #setSecond  
		 *  @throws Exce��o no caso de uma data/hora inv�lida
		 */                                                         
		public void setTime( int h, int m, int s ) throws Exception
		{
			setHour( h );   // configura hour
			setMinute( m ); // configura minute
			setSecond( s ); // configura second
		} // fim do m�todo setTime

		/**
		 *  Configura a hora.
		 *  @param h a hora
		 *  @throws Exce��o no caso de uma data/hora inv�lida
		 */
		public void setHour( int h ) throws Exception
		{ 
			if ( h >= 0 && h < 24 ) 
				hour = h;
			else 
				throw( new Exception() );
		} // fim do m�todo setHour

		/**
		 *  Configura o minuto.
		 *  @param m o minuto
		 *  @throws Exce��o no caso de uma data/hora inv�lida
		 */
		public void setMinute( int m ) throws Exception
		{
			if ( m >= 0 && m < 60 ) 
				minute = m;
			else 
				throw( new Exception() );
		} // fim do m�todo setMinute

		/**
		 *  Configura o segundo.
		 *  @param s o segundo.
		 *  @throws Exce��o no caso de uma data/hora inv�lida
		 */
		public void setSecond( int s ) throws Exception
		{ 
			if ( s >= 0 && s < 60 ) 
				second = s;
			else 
				throw( new Exception() );
		} // fim do m�todo setSecond

		/**                                                     
		 *  Obt�m a hora.                                      
		 *  @return um <code>integer</code> especificando a hora.
		 */                                                   
		public int getHour() 
		{ 
			return hour; 
		} // fim do m�todo getHour

		/**
		 *  Obt�m o minuto.
		 *  @return um <code>integer</code> especificando o minuto.
		 */
		public int getMinute() 
		{ 
			return minute; 
		} // fim do m�todo getMinute

		/**
		 *  Obt�m o segundo.
		 *  @return um <code>integer</code> especificando o segundo.
		 */
		public int getSecond() 
		{ 
			return second; 
		} // fim do m�todo getSecond

		/** 
		 *  Converte para String no formato de data/hora universal
		 *  @return uma representa��o de <code>string<code>
		 *  da data/hora no formato de data/hora universal
		 */   
		public String toUniversalString()
		{
			return String.format( 
					"%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
		} // fim do m�todo do toUniversalString

		/** 
		 *  Converte para String no formato de data/hora padr�o
		 *  @return uma representa��o de <code>string<code>
		 *  da data/hora no formato padr�o de data/hora
		 */   
		public String toStandardString()
		{
			return String.format( "%d:%02d:%02d %s", 
					( ( getHour() == 0 || getHour() == 12 ) ? 12 : getHour() % 12 ),
					getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
		} // fim do m�todo toStandardString
} // fim da classe Time


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
