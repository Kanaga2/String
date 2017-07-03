# String
import java.io.*;
import java.util.*;
public class String
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str="goodmorning";
char[] strArray=str.tocharArray();
for(int i=strArray.length-1;i>=0;i--)
System.out.println(strArray[i]);
}
}
