import java.io.*;

public class CharArrReader{
	public static void main(String[] args) throws Exception
	{
		

		char c[] = {'a','b','c','d','e','f','g','h'};
		CharArrayReader car = new CharArrayReader(c);

		int x;
		while((x=car.read())!=-1){
			System.out.print((char)x);
		}

		car.close();
	}
}