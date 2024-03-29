package Behavioral.Interpreter;

import java.util.HashSet;
import java.util.Set;

public class TerminalExpression implements AbstractExpression {
	private Set<String> set = new HashSet<String>();

	public TerminalExpression(String[] data) {
		for (int i = 0; i < data.length; i++)
			set.add(data[i]);
	}

	public Boolean interpret(String info) {
		if (set.contains(info)) {
			return true;
		}
		return false;
	}
}
