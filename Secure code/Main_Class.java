import java.io.*;

import java.util.*;

import java.lang.*;

/**

*

*/

//	main class to call the all the functions public class Main_Class {

public static void main(String[] args) throws Exception  {	

ArrayList<String>	Private_Variables = new ArrayList<String>();	// to store private variables
ArrayList<String>	Public_Variables = new ArrayList<String>();	// to store public variables
ArrayList<String>	Protected_Variables = new ArrayList<String>();	// to store protected variables
ArrayList<String>	All_Variables = new ArrayList<String>(); // All variables
FileInputStream fstream = new FileInputStream("C:\\D\\Test.java"); // open a file
BufferedReader br	= new BufferedReader(new InputStreamReader(fstream)); // read a file
String strLine;

String[] a = new String[]{ // array to find the data type

"String",

"double",

"int",

"char",

"float",

"boolean",

"byte",

"long",

"signed",

"unsigned",

};
 

int lineCount=0;

//Read File Line By Line

while ((strLine = br.readLine()) != null)

// Print the content on the console

//System.out.println (strLine);
 





{
 

strLine = strLine.replaceAll("[;]", " ; "); // detaching the special characters from a line

strLine = strLine.replaceAll("[,]", " , ");

strLine = strLine.replaceAll("[(]", " ( ");

strLine = strLine.replaceAll("[)]", " ) ");

strLine = strLine.replaceAll("[.]", " . ");

strLine = strLine.replaceAll("[{]", " { ");

strLine = strLine.replaceAll("[}]", " } ");

strLine = strLine.replaceAll("[=]", " = ");

String[] words = strLine.split("\\s+");

strLine=strLine.trim();

//	System.out.println(words.length);
 for(int i=0;i < words.length;i++)

{

words[i]=words[i].trim();

}

//System.out.println(Arrays.toString(words));
 int i=0;

if(strLine.length()>0)

{

if(words[words.length-1].matches(";"))

{

if(words[i].matches("private")) //to find the private variables {

Private_ PriObj = new Private_();

Private_Variables = PriObj.Get_Private(Private_Variables,words,a,i);

}

if(words[i].matches("public")) // to find the public variables {

Public_ PubObj = new Public_();

Public_Variables=PubObj.Get_Public(Public_Variables,words,a,i);

}

if(words[i].matches("protected")) // to find the protected variables {

Protected_ ProObj = new Protected_();

Protected_Variables=ProObj.Get_Protected(Protected_Variables,words,a,i);
}

}

}

lineCount++;

}

// System.out.println(Private_Variables);

All_Variables.addAll(Private_Variables); // merging the variables into one 
All_Variables.addAll(Protected_Variables); 
All_Variables.addAll(Public_Variables);

int No_Of_Private = Private_Variables.size(); // getting each size 
int No_Of_Public = Public_Variables.size();
int No_Of_Protected = Protected_Variables.size();

System.out.println(All_Variables);

Lines L = new Lines() ; // calling line class to display sensitive lines

L.Lines_Display(All_Variables,No_Of_Private,No_Of_Protected,No_Of_Public,lineCount);



//Close the input stream

br.close();

}

}
