package ch04.Exer04_36;

public class Decripto
{
	int descriptografa(int i)
	{
		int a = (i < 1000 ? 0 : (i/1000)%10),
			b = (i < 100  ? 0 : (i/100)%10),
			c = (i < 10   ? 0 : (i/10)%10),
			d = i%10,
			aux = 0;

		a += 3;
		b += 3;
		c += 3;
		d += 3;

		a = a%10;
		b = b%10;
		c = c%10;
		d = d%10;

		aux = a;
		a = c;
		c = aux;

		aux = b;
		b = d;
		d = aux;

		a = a*10;
		a = a+b;
		a = a*10;
		a = a+c;
		a = a*10;
		a = a+d;

		return a;
	}
}
