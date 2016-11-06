package first;
import java.util.*;
public class stjdb {
	 public static void main(String[] args) {
			System.out.println("请出拳（1石头2剪刀3布）");
			int p;
			Scanner in=new Scanner(System.in);
			p=in.nextInt();
			int c=(int)(Math.random()*2)+1;
			switch(c){
			case 1:System.out.println("我出石头"); break;
			case 2:System.out.println("我出剪刀");break;
			case 3:System.out.println("我出布");break;}
			int x=p-c;
			if(x==-1){System.out.println("你赢了");}
			else if(x==1){System.out.println("你输了");}
			else if(x==0){System.out.println("平局");}
			else if(x==-2){System.out.println("你输了");}
			else if(x==2){System.out.println("你输了");}
			}
			}


