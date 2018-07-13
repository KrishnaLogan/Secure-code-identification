import java.io.*;
import java.util.*;
import java.lang.*;

public class Public_	{


public ArrayList Get_Public(ArrayList<String> Public_Variables,String[] words,String[] a,int i){ i++;

if(Arrays.toString(a).contains(words[i])) // look out for the data type

{ i++; //System.out.println(words[i]);

Public_Variables.add(words[i]); // data type mached then add the variable i++;

while(!words[i].matches(";")) // until and unless end of the line

{

if(words[i].matches(","))

{ i++; //System.out.println(words[i]);

 Public_Variables.add(words[i]);

}

i++;

}

}

return(Public_Variables);

}

}
