import java.io.*;

public class CopyData{
	public static void main(String[] args) throws Exception
	{
		
        // FileOutputStream fos = new FileOutputStream("result.txt");
        // FileInputStream  fis = new FileInputStream("main.html");
         

        // int b;
        // while((b=fis.read())!=-1){
        // 	if(b>=65 && b<= 90)fos.write(b-32);
        // 	// b+32 convert is lowercase
        // 	else fos.write(b);
        // } 

        // fis.close();
        // fos.close();



        FileOutputStream fos = new FileOutputStream("result.txt");
        FileInputStream  fis1 = new FileInputStream("main.html");
        FileInputStream  fis2 = new FileInputStream("OutputStream.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
         
 
        int b;
        while((b=sis.read())!=-1){
        	if(b>=65 && b<= 90)fos.write(b-32);
        	// b+32 convert is lowercase
        	else fos.write(b);
        } 

        fis1.close();
        fis2.close();
        fos.close();
        sis.close();

        

	}
}