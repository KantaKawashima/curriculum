package leesson1022;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {

		String[] fluits  = {"みかん", "りんご", "ぶどう", "メロン"};

		for (int f = 0; f < fluits.length; f++) {
			System.out.println(fluits[f]);
		}

		int i = 0;
		do {
		i += 1;
		}while(i >= 100);{
			System.out.println(i);
			i++;
		}

		String[] tabemono = {"おにぎり", "カレー", "焼き魚"};
		Scanner scanner = new Scanner(System.in);
		String inputw;
		while (true) {
			inputw =  scanner.next();
		if (inputw.equals(tabemono[0])) {
			System.out.println("おにぎり");
			break;
		}else if (inputw.equals(tabemono[1])){
			System.out.println("カレー");
			break;
		}else if (inputw.equals(tabemono[2])){
			System.out.println("焼き魚");
			break;
		}else {
		System.out.println("再度入力してください");
		}

		}


	}

}


