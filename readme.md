#Java HTML List
We'll read a *.list* file which will have line separated list items.
Upon reading the list file, we'll create an HTML list file out of it.

**BufferedReader** is for reading in chunks instead of taking the whole stream into memory.  
It takes in a **Reader** from which it'll buffer.  
Here, we'll provide it a **FileReader** which is a type of **Reader**.

We'll have an **ArrayList** of Strings.  
**ArrayList** is used here instead of **Array** because we need dynamic addition of items.

For writing the HTML list file, we'll use **BufferedWriter** and **FileWriter**.