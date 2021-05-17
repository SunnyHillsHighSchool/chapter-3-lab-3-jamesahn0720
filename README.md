# Chapter-3-Lab-3

**Lab Goal :** This lab was designed to teach you more about stacks and queues.

**Lab Description :** Take a a list of Strings and store the Strings in a Queue and in a Stack. Use the Stack and Queue to determine if the list of Strings is a palindrome.  A palindrome list would be a list that had the same words going forward as going backwards. A B A would be a palin list. A B C would not be a palin list.

**Sample Data :** 

      one two three two one

1 2 3 4 5 one two three four five

a b c d e f g x y z g f h

racecar is racecar

1 2 3 a b c c b a 3 2 1

chicken is a chicken

**Sample Output :**

[one, two, three, two, one] is a palinlist.

[1, 2, 3, 4, 5, one, two, three, four, five] is not a palinlist.

[a, b, c, d, e, f, g, x, y, z, g, f, h] is not a palinlist.

[racecar, is, racecar] is a palinlist.

[1, 2, 3, a, b, c, c, b, a, 3, 2, 1] is a palinlist.

[chicken, is, a, chicken] is not a palinlist.

          

**_BASIC QUEUE CODE_**

Queue<Integer> q = new LinkedList<Integer>();

q.add(67);

q.add(34);

q.add(12):

out.println(q); //outs [67, 34, 12 ]

out.println(q.remove()); //outs     67

out.println(q.remove()); //outs     34
