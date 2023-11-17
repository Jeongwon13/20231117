package pkg;

import java.util.*;
class Solution
{
public int solution(String s)
{
int answer = 1;

Stack<Character> stack = new Stack<>();

for(char x : s.toCharArray()) {
   if(!stack.isEmpty() && x==stack.peek()) stack.pop();
   else stack.push(x);
}

if(!stack.isEmpty()) answer = 0;

return answer;
}
}
 
