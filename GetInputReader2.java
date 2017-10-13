import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputReader2{
	public static void main(String[] args ) throws IOException{
		BufferedReader dataln = new BufferedReader (new InputStreamReader(
		System.in));
		
		String nim="", nama="", tempat="", tgllahir="";
		System.out.print("Masukkan nama anda : ");
			nama = dataln.readLine();
		System.out.print("masukkan NIM anda : ");
			nim = dataln.readLine();
		System.out.print("Masukkan tempat lahir anda : ");
			tempat = dataln.readLine();
		System.out.print("Masukkan Tanggal Lahir Anda : ");
			tgllahir = dataln.readLine();
			
		System.out.println("");
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("Selamat datang " + nama);
		System.out.println("NIM 	: " + nim);
		System.out.println("Tempat lahir : " + tempat);
		System.out.println("Tanggal lahir : " + tgllahir);
		
	}
}