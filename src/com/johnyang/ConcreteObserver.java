package com.johnyang;
/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保存一致
 * @author yangyuan
 *
 */
public class ConcreteObserver implements Observer {
	
	private String observerName;
	private String weatherContent;
	private String remindThing;
	
	/**
	 * 将获取目标类的状态同步到观察者的状态中
	 */
	@Override
	public void update(String content) {
		weatherContent = content;
		System.out.println(observerName+"收到了"+weatherContent+","+remindThing);
		
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}

	public String getRemindThing() {
		return remindThing;
	}

	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}
	
	

}
