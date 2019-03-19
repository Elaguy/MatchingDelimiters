package schultz.university.matchingdelimiters;

public class MatchingDelimiters {
	
	ArrayStackChar stack = new ArrayStackChar();
	
	public boolean delimitersMatch(String input) {
		for(int i = 0; i < input.length(); i++) {
			if(isOpeningSymbol(input.charAt(i)))
				stack.push(input.charAt(i));
			
			else if(isClosingSymbol(input.charAt(i))) {
				if(stack.isEmpty())
					return false;
				if(!typeMatches(stack.pop(), input.charAt(i)))
					return false;
			}
		}
		
		return stack.isEmpty();
	}
	
	public boolean isOpeningSymbol(char s) {
		switch(s) {
			case '(':
				return true;
			case '{':
				return true;
			case '[':
				return true;
			default:
				return false;
		}
	}
	
	public boolean isClosingSymbol(char s) {
		switch(s) {
			case ')':
				return true;
			case '}':
				return true;
			case ']':
				return true;
			default:
				return false;
		}
	}
	
	public boolean typeMatches(char a, char b) {
		if(a == '(' && b == ')')
			return true;
		else if(a == '{' && b == '}')
			return true;
		else if(a == '[' && b == ']')
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		MatchingDelimiters matchingDelimiters = new MatchingDelimiters();
		
		String input = "((2x(a-1))+(3xb))";
		
		System.out.println(matchingDelimiters.delimitersMatch(input));
	}
}
