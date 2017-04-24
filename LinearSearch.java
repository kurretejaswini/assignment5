package world;

public class LinearSearch {
	public boolean search(int a[],int element)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				count++;
				break;
			}
		}
		if(count==0)
			return false;
		else
			return true;
	}


}
