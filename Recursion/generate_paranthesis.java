package Recursion;

import java.util.ArrayList;
import java.util.List;

public class generate_paranthesis {
    private void generate (List<String> result, String current, int open, int close, int n ){
    if(open==close && open +close == 2*n){
      result.add(current);
      return;
    }
    if(open<n){
      generate(result,current+'(', open+1, close,n );

    }
    if(close<open){
      generate(result,current+')', open, close+1,n );

   

    }
    
  }
    public List<String> generateParenthesis(int n) {
        //your code goes here
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);
        return result;
    }
    
}
