import java.io.*;

import java.util.*;

import java.lang.*;


//	LOGIC IS SAME AS Public_.java public class Protected_ {

public ArrayList Get_Protected(ArrayList<String> Protected_Variable,String[] words,String[] a,int i){ i++;

if(Arrays.toString(a).contains(words[i]))

{ i++; //System.out.println(words[i]); 

Protected_Variable.add(words[i]);
 i++;

while(!words[i].matches(";"))

{

if(words[i].matches(","))

{	i++;

//System.out.println(words[i]);

Protected_Variable.add(words[i]);

}

i++;

}

}

return(Protected_Variable);

}

}
 