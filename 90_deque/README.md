# Watermelon's implementation of Deque
---
## Deque:
- Uses a LinkedList to essentially make sure that everything is O(1)
- We will work down the interface, implementing all of the methods necessary in that order
- Our Deque should act as a wrapper class for LinkedList, with most of the methods being recycled from there
- We are using the methods from LinkedList that return a special value: null or false. We are doing this to prevent errors being thrown, which requires extra implementation via a try-catch block.
-
