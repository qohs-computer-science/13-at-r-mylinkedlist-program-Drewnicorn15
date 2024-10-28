// Code in this file will be similar to the 1st practice worksheet
// watch the video to help explain more of what the code will look
// like for this file.  (Link to video in Canvas) 
public class MyLinkedList {
  private ListNode theList;
  private int listsize;
  public MyLinkedList()
  {
    theList = null;
    listsize = 0;
  }//end constructor
  public int size()
  {
    return listsize;
  }//end size
  public boolean isEmpty()
  {
      return (theList == null);
  }// end isEmpty 
  public boolean add(Object obj)
  {
    if(isEmpty()){
      theList = new ListNode(obj,null);
    }else{ // end if 
      ListNode next = theList;
      ListNode newnode = new ListNode(obj,null);
      while(next.getNext() != null)
      {
        next = next.getNext();
      } // end while 
      next.setNext(newnode);
    }//end if 
    listsize++;
    return true;
  }//end add 
  
  public boolean addFirst(Object obj)
  {
    if(isEmpty()){
      theList = new ListNode(obj,null);
    }else //end if 
    {
    ListNode newFirst = new ListNode(obj,theList);
    theList = newFirst;
    }//end if
    listsize++;
    return true;
  }//end addFirst
  public boolean addLast(Object obj)
  {
    add(obj);
    return true;
  }//end addLast
  public Object set(int i ,Object obj)
  {
    if(i>=listsize-1){return null;}else{
    Object oldvalue;
    ListNode next = theList;
    for(int k=0;k<i;k++)
    {
      next = next.getNext();
    }//end for
    oldvalue = next.getValue();
    next.setValue(obj);
    return oldvalue;
    }
  }//end set 
  public Object get(int i)
  {
    if(i>=listsize-1){return null;}else{
    ListNode next = theList;
    for(int k=0;k<i;k++)
    {
      next = next.getNext();
    }//end for
    
    return next.getValue();
    }
  }//end get
  
  public Object remove(int i)
  {
    if(i>=listsize-1){return null;}else{
    if(!isEmpty()){
    ListNode before = theList;
    for(int k=0;k<i-1;k++)
    {
      before = before.getNext();
    }//end for
    ListNode elementI = before.getNext();
    before.setNext(elementI.getNext());
    listsize--;
    return elementI.getValue();
    } else // end if
    {
      return null;
    }//end else
    }
  }//end remove
  
  public Object removeFirst()
  {
    if(!isEmpty()){
    Object old = theList.getValue();
    theList = theList.getNext();
    listsize--;
    return old;
    }else // end if
    {
      return null;
    }//end else
  }//end removeFirst
  
  public Object removeLast()
  {
    if(!isEmpty()){
    ListNode before = theList;
    for(int k=0;k<listsize-1;k++)
    {
      before = before.getNext();
    }//end for
    Object old = before.getValue();
    before.setNext(null);
    listsize--;
    return old;
    }else // end if
    {
      return null;
    }//end else
  }// end removeLast
  public String toString()
  {
    ListNode next = theList;
    String output = "";
    
    for(int i =0;i<listsize;i++)
    {
      output += ((i+1)+ ": "+next.getValue()+ "\n");
      next = next.getNext();
      
    } //end for
    return output;
  }//end toString
}//end class