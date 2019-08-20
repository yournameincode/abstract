package AbstractTest;

import java.util.*;
/*
 *抽象类：可以有实际方法、有抽象方法则一定是抽象类
 * 抽象类由后代继承，实现具体方法所有不能用final、private修饰
 * 抽象类不能实例化，只能作为后代实例化的引用类型
 * 抽象类可以有实例域和静态方法
 * */

public class AbstractTest {
	public static void main(String args[]) {
		dailyLifeList wys=new  students();
		dailyLifeList wk=new worker();
		wys.select(dailyLifeList.EAT);
		wys.select(dailyLifeList.SLEEP);
		wys.select(dailyLifeList.WORK);
		wk.select(dailyLifeList.EAT);
		wk.select(dailyLifeList.SLEEP);
		wk.select(dailyLifeList.WORK);
		
	}
}


abstract class dailyLifeList{
	static final int EAT=1;
	static final int SLEEP=2;
	static final int WORK=3;
	public void select(int a) {
		switch(a) {
		case EAT:eat();break;
		case SLEEP:sleep();break;
		case WORK:work();break;
		default:break;
		
		}
	}
	abstract void eat();
	abstract void sleep();
	abstract void work();
	
}

class students extends dailyLifeList {
	@Override
	void eat() {
		System.out.println("breakfast costed 6 yuan , lunch costed 10 yuan ,dinner costed 10 yuan , in all costed 26 yuan ");
	}
	@Override
	void sleep() {
		System.out.println("students general go to bed in twenty-two clock , and wake up at 7 clock");
	}
	@Override
	void work() {
		System.out.println("As we all kown the students only task is study so they basely spend their time in learning");
	}
}

class worker extends dailyLifeList{
	@Override
	void eat() {
		System.out.println("worker need a bear");
	}
	@Override
	void sleep() {
		System.out.println("they are hard so good dream");
	}
	void work() {
		System.out.println("only this sweat stream the cloth");
	}
}
