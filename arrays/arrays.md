# Arrays

Arrays may be the simplest data structure we'll discuss in this course, but that does not make them any less important!

An array is an ordered list of data that we access with a numerical index. Generally speaking, an array is allocated upfront as a single block of memory based on the number of elements and type of data we want the array to hold. This allows us to read and write elements into the array efficiently, since our program knows exactly where each element is stored in memory.

# On the other hand,

removing, inserting, or finding arbitrary values in an array can be a linear-time operation. Removing (or “splicing”) requires shifting all elements over by one to fill the gap; inserting a new element requires shifting or allocating a larger array to hold the elements; and finding values requires iterating over the entire array in the worst case.

# Dynamic Arrays

It's worth noting that in many statically typed programming languages (e.g. Java, C/C++), an array is limited to its initially declared size. All modern languages support (or simply default to) dynamically sized arrays, which automatically increase or decrease their size by allocating a new copy of the array when it begins to run out of space. Dynamic arrays guarantee better amortized performance by only performing these costly operations when necessary.

Calculating Memory Usage
To calculate the memory footprint of an array, simply multiply the size of the array with the size of the data type.

Question: What is the memory usage of an array that contains one thousand 32-bit integers?

Answer: 1,000 _ 32 bits = 1,000 _ 4 bytes = 4 Kb

Question: What is the memory usage of an array that contains one hundred 10-character strings?

Answer: 100 _ 10 chars = 100 _ 10 \* 1 byte = 1 Kb

# When to use an array in an interview

Use an array when you need data in an ordered list with fast indexing or compact memory footprint. Don’t use an array if you need to search for unsorted items efficiently or insert and remove items frequently.

Common Array Operations
Here are some common array operations that you should know how to perform during an interview in your language of choice:

Insert an item
Remove an item
Update an item
Find an item
Loop over array
Copy an array
Copy part of an array
Sort an array
Reverse an array
Swap two items
Filter an array

# Array’s size

In C language, array has a fixed size meaning once the size is given to it, it cannot be changed i.e. you can’t shrink it neither can you expand it. The reason was that for expanding, if we change the size we can’t be sure ( it’s not possible every time) that we get the next memory location to us as free. The shrinking will not work because the array, when declared, gets memory statically allocated, and thus compiler is the only one can destroy it.

# Advantages of using arrays:

Arrays allow random access to elements. This makes accessing elements by position faster.
Arrays have better cache locality that makes a pretty big difference in performance.
Arrays represent multiple data items of the same type using a single name.

# Disadvantages of using arrays:

You can’t change the size i.e. once you have declared the array you can’t change its size because of static memory allocation. Here Insertion(s) and deletion(s) are difficult as the elements are stored in consecutive memory locations and the shifting operation is costly too.

# Applications on Array

Array stores data elements of the same data type.
Arrays can be used for CPU scheduling.
Used to Implement other data structures like Stacks, Queues, Heaps, Hash tables, etc.
