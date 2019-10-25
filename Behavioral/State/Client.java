package Behavioral.State;

public class Client {

	/*
	 * 当控制一个对象状态转换的条件表达式过于复杂时， 
	 * 把相关“判断逻辑”提取出来， 放到一系列的状态类当中， 
	 * 这样可以把原来复杂的逻辑判断简单化。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//可以先画一个"状态转移图"，根据图形设定"状态类"和"转移条件"
		Context context = new Context();
		
		//经过t个时间(所达到的状态)
		for (int t = 0; t < 4; t++) {
			context.Handle();
		}
	}
}
