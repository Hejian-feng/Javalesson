import java.util.Scanner;

public class FamilyAccount{

	public static void main(String[] args ){
		boolean flag = true;
		FamilyAccount contrl = new FamilyAccount();
		int money = 0,moren = 10000;
		String info , singal;
		String title = "---�˻����---��֧---��֧˵��---\n";
		while(flag){
			System.out.println("1����ϸ��֧");
			System.out.println("2����¼����");
			System.out.println("3����¼��֧");
			System.out.println("4���˳�����");
			int num = contrl.read();

			switch(num){
				case 1:
					System.out.print(title);
				    break;
				case 2:
					money = contrl.readmoney();
					info = contrl.readinfo();
				    title += "    "+ (money+moren) + "   +" + money + "    " + info +"  \n";
					break;
				case 3:
					money = contrl.readmoney();
					info = contrl.readinfo();
				    title += "    "+ (moren-money) + "   -" + money + "    " + info +"  \n";
					break;
				case 4:
					singal = contrl.exit();
					if(singal.equals("Y")){  //String����бȽ�ʹ�� String����.equals(String����)ʵ��
						flag = false;
						System.out.println("��л����ʹ�ã�");
					}
					break;
				default:
					System.out.println("������������ȷ����ţ�");
					break;
			}
			
		}

	}

	public int read(){
		System.out.print("��������ţ�");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num;
	}

    public int readmoney(){
		System.out.print("�������");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num;
	}

	public String readinfo(){
		System.out.print("��������ϸ˵��: ");
		Scanner s = new Scanner(System.in);
		String info = s.next();
		return info;
	}

	public String exit(){
		System.out.print("�Ƿ�Ҫ�˳���Y|N��: ");
		Scanner s = new Scanner(System.in);
		String res = s.next();
		return res;
	}

}