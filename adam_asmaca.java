
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class adam_asmaca {

	public static void main(String[] args) {
		
		
		String sihirliSoz, sihirliSozTreli, darAgaciTam="", tahminEdilen, yanlisTahminEdilen, yanlisTahminler="";
		int harfSayisi, kalanHak=6, kontrol=0;
		boolean kontrolTahmin=false;
		
		String[] d = new String[7];
		String[] v = new String[7];
		String[] c = new String[8];

		
		/*
		d[0] = "  |-|==========";
		d[1] = "  |-|        ()";
		d[2] = "  |-|";
		d[3] = "  |-|";
		d[4] = "  |-|";
		d[5] = "  |-|";
		d[6] = " _|_|_";
				
		v[0] = "O";
		v[1] = "\\";
		v[2] = "/";
		v[3] = "|";
		v[4] = "|";
		v[5] = "\\";
		v[6] = "/";
		*/
		
		c[0] = "  |-|==========         \r\n"
				+ "  |-|        $         \r\n"
				+ "  |-|        \r\n"
				+ "  |-|       \r\n"
				+ "  |-|         \r\n"
				+ "  |-|       \r\n"
				+ " _|_|_   ";
		
		c[1] = "  |-|==========         \r\n"
				+ "  |-|        $         \r\n"
				+ "  |-|        o\r\n"
				+ "  |-|         \r\n"
				+ "  |-|         \r\n"
				+ "  |-|         \r\n"
				+ " _|_|_   ";
		
		c[2] = "  |-|==========         \r\n"
				+ "  |-|        $         \r\n"
				+ "  |-|        o\r\n"
				+ "  |-|        |\r\n"
				+ "  |-|         \r\n"
				+ "  |-|       \r\n"
				+ " _|_|_   ";
		
		c[3] = "  |-|==========         \r\n"
				+ "  |-|        $         \r\n"
				+ "  |-|        o\r\n"
				+ "  |-|        |\\ \r\n"
				+ "  |-|         \r\n"
				+ "  |-|         \r\n"
				+ " _|_|_   ";
		
		c[4] = "  |-|==========         \r\n"
				+ "  |-|        $         \r\n"
				+ "  |-|        o\r\n"
				+ "  |-|       /|\\ \r\n"
				+ "  |-|          \r\n"
				+ "  |-|       \r\n"
				+ " _|_|_   ";
		
		c[5] = "  |-|==========         \r\n"
				+ "  |-|        $         \r\n"
				+ "  |-|        o\r\n"
				+ "  |-|       /|\\ \r\n"
				+ "  |-|        | \r\n"
				+ "  |-|          \r\n"
				+ " _|_|_   ";
		
		c[6] = "  |-|==========         \r\n"
				+ "  |-|        $         \r\n"
				+ "  |-|        o\r\n"
				+ "  |-|       /|\\ \r\n"
				+ "  |-|        | \r\n"
				+ "  |-|         \\ \r\n"
				+ " _|_|_   ";
		
		c[7] = "  |-|==========         \r\n"
				+ "  |-|        $         \r\n"
				+ "  |-|        o\r\n"
				+ "  |-|       /|\\\r\n"
				+ "  |-|        | \r\n"
				+ "  |-|       / \\ \r\n"
				+ " _|_|_   ";
		
		
		
		System.out.println("Adam asmaca oyununa ho?? geldiniz!");
		System.out.println("Sihirli s??z??n??z nedir? : ");
		
		Scanner soz = new Scanner(System.in);
		sihirliSoz = soz.nextLine();
		
		harfSayisi = sihirliSoz.length();
		
		System.out.println("Tamamdir, ba??lamaya haz??r??z!\n");
		
		sihirliSozTreli = sihirliSoz.replaceAll("[a-zA-Z]","-");
		
		
		while (kalanHak!=-1) {
		
			System.out.println("=========================================================================== \n\n");
			System.out.println("Sihirli s??z:  "+sihirliSozTreli);
			System.out.print("Yanl???? tahmin edilen harfler:  ");
			
			System.out.println(yanlisTahminler);
			
			kontrolTahmin=false;
			System.out.println("\n");
			System.out.println(c[kontrol]+"\n");
			System.out.println("L??tfen bir harf tahmin edin ya da \"Sihirli S??z\" i??in tahmininizi yazin : ");
			
			tahminEdilen = soz.nextLine();
			
			
			
			if (tahminEdilen.length()<harfSayisi && tahminEdilen.length()!=1) {
				System.out.println("Ya tek bir harf yaz??n ya da t??m \"Sihirli S??z\"?? tahmin edin !!");
				continue;}
					
			if (tahminEdilen.equals(sihirliSoz)) {											//s???z??? bilerek kazanma durumu
				System.out.println("Tebrikler, sihirli s??z?? do??ru tahmin ederek oyunu kazand??n??z !!");
				System.exit(0);}
			
	
			if (sihirliSoz.contains(tahminEdilen)) {										
				System.out.println("Tebrikler harfi bildiniz!\n ");
						
				for (int i=0; i<harfSayisi; i++) {
						
					if (sihirliSoz.charAt(i)==tahminEdilen.charAt(0))
					sihirliSozTreli = sihirliSozTreli.substring(0,i)+tahminEdilen+sihirliSozTreli.substring(i+1,harfSayisi);
				}
					
			//System.out.println("Sihirli s??z: "+sihirliSozTreli);
						
			}
					
			else {
				if (kalanHak==0) {
					System.out.println("Hakk??n??z kalmad??, kaybettiniz !! ");
					kontrol++;
					System.out.println(c[kontrol]);
					System.exit(0);}
				else {
					
					if (yanlisTahminler.contains(tahminEdilen)) {
							continue;}
						else {
							yanlisTahminler+=tahminEdilen+",";
							kalanHak--;
							kontrol++;}
					
					System.out.println("\""+tahminEdilen+"\" harfi, \"Sihirli S??z\" i??inde bulunmamaktad??r. ");
					System.out.println(kalanHak+1 +" hakk??n??z kald??. \n");
					//System.out.println("Sihirli s??z:  "+sihirliSozTreli);
					
						
				}
			}	
				
					
			if (sihirliSozTreli.equals(sihirliSoz)) { 														//harfleri yazarak kazanma durumu
				System.out.println("Tebrikler, sihirli s??z?? tamamlayarak oyunu kazandiniz !!");   
				System.exit(0);}
				
			System.out.println(darAgaciTam);
					
			}			
	}
}