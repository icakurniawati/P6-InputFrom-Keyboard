import javax.swing.JOptionPane;

public class DemoJOptionPane{
	public static void main(String[] args ) {
		String nama, nim, tempat, tgllahir;
		nama = JOptionPane.showInputDialog("Masukkan nama anda : ");
		nim = JOptionPane.showInputDialog("masukkan NIM anda : ");
		tempat = JOptionPane.showInputDialog("Masukkan tempat lahir anda : ");
		tgllahir =JOptionPane.showInputDialog ("Masukkan Tanggal Lahir Anda : ");
		String msg = "Hello " + nama + "!\nnim : "+nim+"\nTempat Lahir : "+tempat+"\nTanggal Lahir : "+tgllahir;
		JOptionPane.showMessageDialog(null, msg);
	}
}