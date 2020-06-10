import java.util.Scanner;

public class FamilyAccount{

	public static void main(String[] args ){
		boolean flag = true;
		FamilyAccount contrl = new FamilyAccount();
		int money = 0,moren = 10000;
		String info , singal;
		String title = "---账户余额---开支---开支说明---\n";
		while(flag){
			System.out.println("1、详细收支");
			System.out.println("2、记录收入");
			System.out.println("3、记录开支");
			System.out.println("4、退出记账");
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
					if(singal.equals("Y")){  //String类进行比较使用 String对象.equals(String对象)实现
						flag = false;
						System.out.println("感谢您的使用！");
					}
					break;
				default:
					System.out.println("请重新输入正确的序号！");
					break;
			}
			
		}

	}

	public int read(){
		System.out.print("请输入序号：");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num;
	}

    public int readmoney(){
		System.out.print("请输入金额：");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num;
	}

	public String readinfo(){
		System.out.print("请输入详细说明: ");
		Scanner s = new Scanner(System.in);
		String info = s.next();
		return info;
	}

	public String exit(){
		System.out.print("是否要退出【Y|N】: ");
		Scanner s = new Scanner(System.in);
		String res = s.next();
		return res;
	}

}