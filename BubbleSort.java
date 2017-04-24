package world;

public class BubbleSort {

		public int[] sort(int a[])
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=1;j<=j-i;j++)
				{
					if(a[j-1]>a[j])
					{
						a[j-1]=a[j-1]+a[j];
						a[j]=a[j-1]-a[j];
						a[j-1]=a[j-1]-a[j];
					}
				}
			}
			return a;
		}

}
