package com.neo.lesson01;
import java.util.Scanner;
public class DVDMgr {
	DVDSet s = new DVDSet();
	int n = 3;
	public void intt() {
		s.name[0] = "速度与激情8";
		s.state[0] = 0;
		s.d[0] = "2017-10-5";
		
		s.name[1] = "加勒比海盗5";
		s.state[1] = 1;
		s.d[1] = "2017-10-5";
		
		s.name[2] = "神偷奶爸3";
		s.state[2] = 2;
		s.d[2] = "2017-10-5";
		n=3;
	}
	public void startMenu() {
		Scanner scan = new Scanner(System.in);
		boolean isexit=false;
		do {
			System.out.println("欢迎使用迷你DVD管理器");
			System.out.println("------------------------");
			System.out.println("1.新增DVD");
			System.out.println("2.查看DVD");
			System.out.println("3.删除DVD");
			System.out.println("4.借出DVD");
			System.out.println("5.归还DVD");
			System.out.println("6.退出");
			System.out.println("------------------------");
			System.out.println("请选择");
			int sel = scan.nextInt();
			switch (sel) {
			case 1:
				System.out.println("此处实现新增DVD");
				System.out.println("***************************");
				break;
			case 2:
				search();
				System.out.println("****************************");
				break;
			case 3:
				System.out.println("此处实现删除DVD");
				System.out.println("****************************");
				break;
			case 4:
				System.out.println("此处实现借出DVD");
				System.out.println("*****************************");
				break;
			case 5:
				System.out.println("此处实现归还DVD");
				System.out.println("******************************");
				break;
			case 6:
				System.out.println("退出");
				isexit=true;
				System.out.println("******************************");
				break;
			}
			if (isexit) break;
		} while (true);
	}
	/**
	 * 查看DVD信息
	 */
	private void search() {
		System.out.println("序号\t状态\t名称\t借出日期");
		for(int i=0;i<n;i++){
			System.out.println((i+1)+"\t");
			if (s.state[i]==0){
				System.out.println("已借出\t");
			} else {
				System.out.println("可借\t");
			}
			System.out.println("《"+s.name[i]+"》\t");
			System.out.println(s.d[i]);
		}
	}

}
