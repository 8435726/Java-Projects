package paket1;
import java.util.Scanner;
//import java.util.Scanner;

public class Game {
	private Scanner input=new Scanner(System.in);
	public void start() {
		
		System.out.println("hoşgeldin"); 
		System.out.println("isim gir"); 
		//Scanner isimAl =new Scanner(System.in);
		//String ad1=isimAl.next();
		//System.out.println(ad1); 
		
		String playerName = input.nextLine();
		Player player=new Player(playerName);
		System.out.println(player.getName()+" Hoş geldiniz ");
		System.out.println("lütfen bir karakter seçin");
		player.selectChar();
// yer location seçme
		Location location=null;
	while (true) {
		player.printInfo();
		System.out.println();
		System.out.println("########### Bölgeler ###########");
		System.out.println();
		System.out.println("1-Güveli Ev-->burada düşman yok");
		System.out.println("2-Eşya Dükkanı-->Silah ya da zırh satın alabilirsiniz");
		System.out.println("3-Mağara--> Ödül <Yemek> , dikkatli ol karşına zombi çıkabilir");
		System.out.println("4-Orman--> Ödül <odun> , dikkatli ol karşına vampir çıkabilir");
		System.out.println("5-Nehir--> Ödül <su> , dikkatli ol karşına ayı çıkabilir");
		System.out.println("0-Çıkış Yap-->Oyunu sonlandır.");

		System.out.println("Lütfen gitmek istediğin bölgeyi seç");
		int selectLoc=input.nextInt();
		switch(selectLoc) {
		case 0:
			location = null;
			break;
		case 1:
			location=new SafeHause(player);
			break;
		case 2:
			location=new ToolStore(player);
			break;
		case 3:
			location=new Cave(player);
			break;
		case 4:
			location=new Forest(player);
			break;
		case 5:
			location=new River(player);
			break;
		default:
			System.out.println("geçerli bir sayı gir!");
		}
		
	if(location==null) {
		System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtin !");
		break;
	}
	if(!location.onLocation()){
		System.out.println("Game Over");
	}
	}
	}

}
