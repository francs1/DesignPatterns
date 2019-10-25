package Behavioral.Strategy;

public class Client {

	/*
	 * 例子：通用类库DBHelper
	 * 无论连接SQLServer/Oracel/MySql数据库
	 * 不同的对象，具有相同的使用方式Context
	 */
	public static void main(String[] args) {
		//多个类有相似的功能，客户将具体的类传入Context，调用Context统一的方法实现具体功能
		Strategy strategy;//扩展点
		
		//使用策略A
		strategy = new ConcreteStrategyA();
		
		//扩展点(封装了变化点)->切换策略B
		//strategy = new ConcreteStrategyB();
		
		//稳定代码
		Context context = new Context();
		context.setStrategy(strategy);
		context.strategyMethod();

	}	

}
