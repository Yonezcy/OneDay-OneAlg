class Solution {
    public boolean isValid(String s) {
        int len = s.length();
		boolean isvalid = true;
		Stack<Character> stack = new Stack<Character>();
		Character[] all = {'[','(','{',']',')','}'};
		Character[] left = {']',')','}'};
		List<Character> leftlist = Arrays.asList(left);
		List<Character> alllist = Arrays.asList(all);
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('[', ']');
		map.put('(', ')');
		map.put('{', '}');
		map.put('}', '{');
		map.put(')', '(');
		map.put(']', '[');
		
		LinkedList<Character> linked = new LinkedList<Character>();
		for (int i = 0; i < len; i++) {
			if(alllist.contains(s.charAt(i))){
				linked.add(s.charAt(i));
			}
		}
		
		if(linked.size()==0) return  true;
		stack.push(linked.get(0));
		
		for (int i = 1; i < linked.size(); i++) {
			Character str = linked.get(i);
			if(leftlist.contains(str) && stack.size() > 0){
				if(map.get(str).equals(stack.peek())){
					stack.pop();
				}else{
					isvalid = false;
				}
			}else{
				stack.push(str);
			}
		}
		
		if(stack!=null && stack.size()>0){
			isvalid = false;
		}
		
		return isvalid;
    }
}