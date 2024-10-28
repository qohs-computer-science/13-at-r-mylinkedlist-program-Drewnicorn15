public class MyLLTester//.java
{
  public static void main(String [] args)
  {
    // code in this file will be similar to the 2nd practice worksheet
    MyLinkedList myList = new MyLinkedList();
    System.out.println(myList.isEmpty());
    System.out.println("removeLast: " + myList.removeLast());
    myList.add("i");
    myList.add("t");
    myList.addFirst("l");
    myList.addLast("t");
    myList.addLast("t");
    myList.addLast("e");
    myList.addLast("r");
    myList.addLast("7");
    myList.addLast("8");
    myList.addLast("9");
    System.out.print("myList: "+ myList);
    System.out.println("Set: "+myList.set(2,"a"));
    System.out.print("myList: "+ myList);
    System.out.println("Get: "+ myList.get(2));
    System.out.println("remove: "+myList.remove(4));
    System.out.print("myList: "+ myList);
    System.out.println("removeFirst: "+myList.removeFirst());
    System.out.println("removeLast: "+myList.removeLast());
    System.out.print("myList: "+ myList);
    System.out.println("removeLast: "+ myList.removeLast());
    System.out.println("size: "+ myList.size());
    System.out.println("is empty: "+ myList.isEmpty());
  } // end main
  
} // end class
