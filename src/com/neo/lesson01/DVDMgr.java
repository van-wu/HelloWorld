package com.neo.lesson01;
import java.util.Scanner;
public class DVDMgr {
	DVDSet s = new DVDSet();
	int n = 3;
	public void intt() {
		s.name[0] = "�ٶ��뼤��8";
		s.state[0] = 0;
		s.d[0] = "2017-10-5";
		
		s.name[1] = "���ձȺ���5";
		s.state[1] = 1;
		s.d[1] = "2017-10-5";
		
		s.name[2] = "��͵�̰�3";
		s.state[2] = 2;
		s.d[2] = "2017-10-5";
		n=3;
	}
	public void startMenu() {
		Scanner scan = new Scanner(System.in);
		boolean isexit=false;
		do {
			System.out.println("��ӭʹ������DVD������");
			System.out.println("------------------------");
			System.out.println("1.����DVD");
			System.out.println("2.�鿴DVD");
			System.out.println("3.ɾ��DVD");
			System.out.println("4.���DVD");
			System.out.println("5.�黹DVD");
			System.out.println("6.�˳�");
			System.out.println("------------------------");
			System.out.println("��ѡ��");
			int sel = scan.nextInt();
			switch (sel) {
			case 1:
				System.out.println("�˴�ʵ������DVD");
				System.out.println("***************************");
				break;
			case 2:
				search();
				System.out.println("****************************");
				break;
			case 3:
				System.out.println("�˴�ʵ��ɾ��DVD");
				System.out.println("****************************");
				break;
			case 4:
				System.out.println("�˴�ʵ�ֽ��DVD");
				System.out.println("*****************************");
				break;
			case 5:
				System.out.println("�˴�ʵ�ֹ黹DVD");
				System.out.println("******************************");
				break;
			case 6:
				System.out.println("�˳�");
				isexit=true;
				System.out.println("******************************");
				break;
			}
			if (isexit) break;
		} while (true);
	}
	/**
	 * �鿴DVD��Ϣ
	 */
	private void search() {
		System.out.println("���\t״̬\t����\t�������");
		for(int i=0;i<n;i++){
			System.out.println((i+1)+"\t");
			if (s.state[i]==0){
				System.out.println("�ѽ��\t");
			} else {
				System.out.println("�ɽ�\t");
			}
			System.out.println("��"+s.name[i]+"��\t");
			System.out.println(s.d[i]);
		}
	}

}
