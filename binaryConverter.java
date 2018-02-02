//Elton Tran & Michael Pfeiffer
import java.util.Scanner;
public class binaryConverter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = 1;
		System.out.println("Binary Converter: Type \"0\" to quit.");
		while(num != 0){
			num = in.nextInt();
			binaryConverter(num);
			System.out.println("");
		}
	}
	public static void binaryConverter (int num){
		int i = 0;
		for(i = 0; i > -1; i++){
			if(num < Math.pow(2, i)){
				i = i - 1;
				break;
			}
		}	
		for(int j = i; j >= 0; j--){
			if(num >= Math.pow(2, j)){
				System.out.print("1");
				num = (int) (num - Math.pow(2, j));
			}
			else if(num < Math.pow(2, j)){
				System.out.print("0");
			}
		}
	}
}
