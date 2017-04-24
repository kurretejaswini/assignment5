package world;

public class BinarySearch {
	public boolean search(int a[],int element)
	{
	   int first  = 0;
	   int last   = a.length - 1;
	   int middle = (first + last)/2;
	   int count=0;
	   while( first <= last )
	    {
	      if ( a[middle] < element )
	        first = middle + 1;    
	      else if ( a[middle] == element ) 
	        {
	          count++;
	          break;
	        }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	    }
	  if(count==0)
		return false;
	  else
		return true;
	  }
	}





