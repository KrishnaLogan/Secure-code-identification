import java.io.*;

import java.util.*;

import java.lang.*;

//Logic is same as Public_.java and Private_.java

public class Private_	{


public ArrayList Get_Private(ArrayList<String> Private_Variables,String[] words,String[] a,int i){ i++;

if(Arrays.toString(a).contains(words[i]))

{ i++; //System.out.println(words[i]);
 Private_Variables.add(words[i]); i++; while(!words[i].matches(";"))
{

if(words[i].matches(",")) { i++;

//	System.out.println(words[i]);
 Private_Variables.add(words[i]);
}

i++;

}

}

return(Private_Variables);

}

}
 
