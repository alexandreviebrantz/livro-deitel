package ch03.exercicios;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice i = new Invoice("011.527.080-90","Inform�tica",
							500,199.90);
		
		System.out.printf("Numero: %s\nDescri��o: %s\nQuantidade: %d\n" +
				"Pre�o: %s\nTotal: %s\n", i.getNum() , i.getDes() ,
				i.getQuant() , i.getPreco(), i.getInvoiceAmount());
		
		i.setPreco(-1.99);
		i.setQuant(-100);
		
		System.out.println("-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;");
		System.out.printf("Numero: %s\nDescri��o: %s\nQuantidade: %d\n" +
				"Pre�o: %s\nTotal: %s\n", i.getNum() , i.getDes() ,
				i.getQuant() , i.getPreco(), i.getInvoiceAmount());
	}
}
