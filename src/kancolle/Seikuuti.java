package kancolle;
import java.util.Scanner;

public class Seikuuti {

	public static void main(String[] args) {
		String yorn = "no";
		Scanner stdIn = new Scanner(System.in);
		int sum = 0;
		int taikuuti = 0;
		int tousaisuu = 0;
		while(yorn == "n" || yorn == "no"){
			System.out.println("����l���v�Z���܂��B");

			while(true){
				System.out.println("�͍ڋ@�̑΋�l����͂��Ă��������B");
				taikuuti = stdIn.nextInt();
				if(taikuuti<0)
					break;
				System.out.println("�͍ڋ@�̓��ڐ�����͂��Ă��������B");
				tousaisuu = stdIn.nextInt();
				if(tousaisuu<0)
					break;
				sum += taikuuti * Math.sqrt(tousaisuu);
				System.out.println("���݂̐���l��"+sum+"�ł��B(�[���؎̂�)");

			}
			while(true){
				System.out.println("�I�����܂����H[y/n]");
				yorn = stdIn.next();
				System.out.print(yorn + "�����͂���܂����B");
				if(yorn == "y" || yorn == "n" || yorn == "yes" || yorn == "no" )
					break;
				System.out.print("�Ȃ�ł����H");
			}

		}

	}
}
