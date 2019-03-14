/** Description of OrderedIntList: adding several method for orderedIntList
 * Id: 435
 * @author Nabeel Asif
 * @version Mar 13, 2019
 */

import java.util.Arrays;

public class OrderedIntList
{
	private int[] data;
	private int count;
	
	/** Create an empty list */
	OrderedIntList()
	{
		data = new int[10];
		count = 0;
	}
	
	/** Insert unique integer 
	 *  @param value	integer added to array
	 */
	public void insert(int value) 
	{
		int insertIndex = getInsertIndex(value);
		
		if (insertIndex > 9 || data[insertIndex] == value)
		{
			//do nothing if insertIndex is larger than array 
			// or if value is not unique
			return;
		}
		else if (count < 10)
		{
			//shift memory only for what is in the array
			shift(insertIndex, count);
						
			//increment count
			count = count + 1;
		}
		else if(count == 10)
		{
			//shift all memory
			shift(insertIndex, 9);
		}

		//store data
		data[insertIndex] = value;
	}

	private int getInsertIndex(int value) {
		int insertIndex = 0;
		for (int index = 0; index < count && value > data[index]; index++)
		{
			insertIndex++;
		}
		return insertIndex;
	}

	private void shift(int insertIndex, int count) {
		for (int index = count; index > insertIndex; index--)
		{
			data[index] = data[index - 1];
		}
	}
	/*description of insert method: get the array size
	 *@param [no param] [no description] 
	 */
	public int size()
	{
	return data.length;
		
	}
	/*description of insert method: get the number of elements in array
	 *@param [no param] [no description] 
	 */
	public int length()
	{
		return count;
	}
	/*description of insert method: search the element and return a index number
	 *@param [int data[], int start, int end, int key] [array name, start index, end index,the element name that we need to search] 
	 */
	public int BinarySearch(int data[], int start, int end, int key)
	{
	if(start < end)
	{
		int mid = start+(end - start) / 2;
		if(key < data[ mid ])
		{
			return BinarySearch (data, mid, end, key);
		}
		else if(key > data[ mid ])
		{
			return BinarySearch( data, mid+1, end, key);
		}
		else
		{
			return mid;
		}
	}
	return -1;
	}
	/*description of insert method: search the element and delete it if it is exist
	 *@param [key] [the element we need to delete] 
	 */
	public void delete (int key) 
	{ int count=BinarySearch( data, 0, data.length, key);
	int oringinal= data.length;
		if(BinarySearch( data, 0 , data.length, key)!=-1)
		{
			for (int newCount=count-1; newCount<data.length-1; newCount++)
			{
				data[newCount]=data[newCount+1];
			}
			if (length()/size()<0.5)
				
			{
				for(int count3 = 0;count/oringinal==0.4;count3++)
				{
			int[]data2 = Arrays.copyOf(data, data.length-1);
			data = data2;
				}
			
			}
		}
	}
	
	/** Displays the list */
	/*description of insert method: a method to print the element in the list
	 *@param [none] [no description] 
	 */
	public String toString()
	{

		for (int index = 0; index < count; index++)
		{
		
            if(index < count-1)
            {
			return "data[index]"+"";
            }
            if(index >=count)
            {
            	return "data[index]";
            }
		}
		return null;
		
	}
	/*description of insert method: a method to overload the constructor 
	 *@param [size] [used to redefined the size of the array list] 
	 */
	OrderedIntList (int size)
	{
		data = new int[ size ];
		count = 0;
	}
	
}