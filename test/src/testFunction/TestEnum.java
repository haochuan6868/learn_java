package testFunction;

enum Car
{
	lamborghini(900),tata(2),audi(50),fiat(15),honda(12);
	private int price;
	Car(int p){
		price = p;
	}
	int getPrice(){
		return price;
	}
}

public class TestEnum {
	public static void main(String arsg[])
	{
		System.out.println("���������ļ۸�");
		for( Car c : Car.values())
			System.out.println(c + " ��Ҫ " + c.getPrice() + " ǧ��Ԫ��");
	}
}
