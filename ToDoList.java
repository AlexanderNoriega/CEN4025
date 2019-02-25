package week07;

import java.util.ArrayList;
import java.util.List;

/**
 * toDoList object. It privately stores a list of items. Can add items, remove
 * items, and output all current items.
 * 
 * @author Alexander Noriega
 * @version 1.0 January 15 2019
 */
public class ToDoList
{
	List<String> toDo;// Private string list. Instantiates as an
								// arrayList. Holds all the items in it.

	/**
	 * Default constructor. Instantiates the list as an ArrayList.
	 */
	public ToDoList()
	{
		toDo = new ArrayList<String>();
	}

	/**
	 * A constructor. If one wanted to past to pass a list of strings, this read
	 * them, separates them by line, and adds them to the new list on
	 * construction
	 * 
	 * @param listItems
	 *            A string of items to include in the new list
	 */
	public ToDoList(String listItems)
	{
		String[] lines = listItems.split(System.getProperty("line.separator"));
		toDo = new ArrayList<String>();
		for(int i = 0; i < lines.length; i++)
		{
			toDo.add(lines[i]);
		}
	}

	/**
	 * A simple void method that adds a string as a new item to the todoList
	 * 
	 * @param newItem
	 *            the String being added to the list
	 */

	public void addItem(String newItem)
	{
		toDo.add(newItem);
	}

	/**
	 * The first removeItem method. This one intakes String and checks if the
	 * object exists in the list. If it does, it is deleted
	 * 
	 * @param removeItem
	 *            the String to be removed from the current list
	 * @return boolean. Returns true if the item has been properly removed and
	 *         false otherwise
	 */
	public boolean removeItem(String removeItem)
	{
		return toDo.remove(removeItem);
	}

	/**
	 * The second removeItem method. This one removes the item based on an
	 * integer input. It removes that item via index.
	 * 
	 * @param itemNumber
	 *            the index number of the item to be removed
	 * @return returns the String of the item that was just removed
	 */
	public String removeItem(int itemNumber)
	{
		return toDo.remove(itemNumber);
	}

	/**
	 * Prints the items directly to console. The first output method of this
	 * object.
	 */
	public void printItems()
	{
		String list = "";
		for(int i = 0; i < toDo.size(); i++)
		{
			System.out.println(toDo.get(i));
		}
	}

	/**
	 * The other output method of this object. It uses a loop to put all items
	 * of the list into a single String, with different items divided by new
	 * line characters
	 * 
	 * @return String returns a single string containing all the characters of
	 *         the toDo list
	 */
	public String outputItems()
	{
		String outputString = "";
		for(int i = 0; i < toDo.size(); i++)
		{
			outputString += toDo.get(i) + "\n";
		}
		return outputString;
	}

}