package com.johnyang;
/**
 * 目标对象，它知道观察它的观察者，并提供注册，添加和删除观察者的接口
 * @author yangyuan
 *
 */

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject {
	//用来保存注册的观察者对象
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void dettach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers(String content) {
		for (Observer observer : observers) {
			observer.update(content);
		}
	}
	

}
