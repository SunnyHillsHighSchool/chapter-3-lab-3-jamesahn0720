//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
 private Queue<String> queue;
 private Stack<String> stack;

 public PalinList()
 {
  setList("");
 }

 public PalinList(String list)
 {
  setList(list); 
 }

 public void setList(String list)
 {
   queue = new LinkedList<String>();
   stack = new Stack<String>();
   String[] s = list.split("\\s+");

   for(int i = 0; i < s.length; i++)
   {
     queue.add(s[i]);
     stack.push(s[i]);
   }
 }

 public boolean isPalin()
 {
   Queue<String> q = new LinkedList<String>(queue);
   while(!stack.isEmpty())
   {
     String s1 = q.remove();
     String s2 = stack.pop();
   
     if(!s1.equals(s2))
     {
       return false;
     }
   }
  return true;
 }


 //write a toString method
  public String toString()
 {
   if(this.isPalin())
   {
      return queue + " is a palinlist";
   }
   return queue + " is not a palinlist";
 }
}
