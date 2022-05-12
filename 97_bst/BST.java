/**
  Team Cookie (Justin Mohabir, Lawrence Joa, Lior Polischouk)
  APCS pd7
  HW97 -- Prune Your Tree
  2022-05-11
  time spent: 1.5 hrs
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  public TreeNode _root;

  /**
   * default constructor
   */
  BST()
  {
    _root = null;
    /*** YOUR IMPLEMENTATION HERE ***/
  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );
    /*** YOUR IMPLEMENTATION HERE ***/
    if(_root==null){
      _root=newNode;
    } else {
      insert(_root,newNode);
    }
  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    if (newNode.getValue()>stRoot.getValue()){
      if (stRoot.getRight()==null){
        stRoot.setRight(newNode);
      } else {
        insert(stRoot.getRight(),newNode);
      }
    } else if (newNode.getValue()<stRoot.getValue()){
      if (stRoot.getLeft()==null){
        stRoot.setLeft(newNode);
      } else {
        insert(stRoot.getLeft(),newNode);
      }
    }
    /*** YOUR IMPLEMENTATION HERE ***/
  }//end insert()




  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }

  public void preOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if(currNode==null){return;}
    System.out.print(currNode.getValue());
    preOrderTrav(currNode.getLeft());
    preOrderTrav(currNode.getRight());
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    inOrderTrav(_root);
  }
  public void inOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if(currNode==null){return;}
    preOrderTrav(currNode.getLeft());
    System.out.print(currNode.getValue());
    preOrderTrav(currNode.getRight());
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    postOrderTrav(_root);
  }
  public void postOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if(currNode==null){return;}
    preOrderTrav(currNode.getLeft());
    preOrderTrav(currNode.getRight());
    System.out.print(currNode.getValue());
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


      /*****************************************************
       * TreeNode search(int)
       * returns pointer to node containing target,
       * or null if target not found
       *****************************************************/
      public TreeNode search( int target )
      {
      	/*** YOUR IMPLEMENTATION HERE ***/
        return searchHelp( _root, target);
      }

      public TreeNode searchHelp(TreeNode currNode, int target){
        if (currNode == null){
          return null;
        }
        if(currNode.getValue() < target){
          return searchHelp(currNode.getRight(), target);
        }
        else if(currNode.getValue() > target){
          return searchHelp(currNode.getLeft(), target);
        }
        else {
          return currNode;
        }
      }



      /*****************************************************
       * int height()
       * returns height of this tree (length of longest leaf-to-root path)
       * eg: a 1-node tree has height 1
       *****************************************************/
      public int height()
      {
      	/*** YOUR IMPLEMENTATION HERE ***/
        return heightHelp(_root);
      }

      public int heightHelp(TreeNode currNode){
        if(currNode == null){
          return 0;
        } else {
          return Math.max(heightHelp(currNode.getLeft()), heightHelp(currNode.getRight()))+1;
        }
      }


      /*****************************************************
       * int numLeaves()
       * returns number of leaves in tree
       *****************************************************/
      public int numLeaves()
      {
      	/*** YOUR IMPLEMENTATION HERE ***/
        return numLeavesHelp(_root);
      }

      public int numLeavesHelp(TreeNode currNode){
        if(currNode == null){
          return 0;
        }
        if(currNode.getLeft()==null && currNode.getRight()==null){
          return 1;
        } else {
          return numLeavesHelp(currNode.getLeft()) + numLeavesHelp(currNode.getRight());
        }
      }

      /*
      Find parent node of node we want to remove
      CASE1:removed has no children
      - if removed is root, root = null, otherwise whichever subtree of parent has the child, set it null
      CASE2:removed has left child
      - if root, set root to left node of root, otherwise whichever subtree of parent has the child, set it to left node of removed
      CASE3:removed has right child
      - if root, set root to right node of root, otherwise whichever subtree of parent has the child, set it to right node of removed
      CASE4:removed has both(full)
      - find rightmost node of the left subtree of removed, call it x, call the left node of removed as y, set the right node of removed as x.setLeft(__)
      - if root, root = y, otherwise whichever subtree of parent has the child, set it to y
      */
      public void remove(int target){
        TreeNode prev = _root;
        TreeNode rem = _root;
        boolean leftOfPrev = false;
        while(rem.getValue()!=target){
          prev = rem;
          if(rem.getValue() < target){
            rem = rem.getRight();
            leftOfPrev = false;
          } else {
            rem = rem.getLeft();
            leftOfPrev = true;
          }
        }
        //Node getting removed has no children
        if(rem.getLeft()==null && rem.getRight()==null){
          if(rem==_root){
            _root = null;
          } else if(leftOfPrev){
            prev.setLeft(null);
          } else {
            prev.setRight(null);
          }
        }
        //Node getting removed has left child only
        if(rem.getLeft()!=null && rem.getRight()==null){
          if(rem==_root){
            _root = rem.getLeft();
          } else if(leftOfPrev){
            prev.setLeft(rem.getLeft());
          } else {
            prev.setRight(rem.getLeft());
          }
        }
        //Node getting removed has right child only
        if(rem.getLeft()==null && rem.getRight()!=null){
          if(rem==_root){
            _root = rem.getRight();
          } else if(leftOfPrev){
            prev.setLeft(rem.getRight());
          } else {
            prev.setRight(rem.getRight());
          }
        }
        //Node getting removed has 2 children
        if(rem.getLeft()!=null && rem.getRight()!=null){
          if(rem==_root){
            TreeNode right = _root.getRight();
            TreeNode left = farthestRight(_root.getLeft());
            left.setRight(right);
            _root = _root.getLeft();
          }
          else {
            TreeNode right = rem.getRight();
            TreeNode left = farthestRight(rem.getLeft());
            left.setRight(right);
            if(leftOfPrev){
              prev.setLeft(left);
            } else {
              prev.setRight(left);
            }
          }
        }
      }

      public TreeNode farthestRight(TreeNode t){
        while(t.getRight()!=null){
          t = t.getRight();
        }
        return t;
      }

      public String toString(){
        preOrderTrav();
        System.out.println('\n');
        postOrderTrav();
        System.out.println('\n');
        inOrderTrav();
        System.out.println('\n');
        return "Height: " + height() + "; num leaves: " + numLeaves();
      }

      //main method for testing
  public static void main( String[] args ) {

   	BST arbol = new BST();

   	System.out.println( "tree init'd: " + arbol );

   	//inserting in this order will build a perfect tree
   	arbol.insert( 3 );
   	arbol.insert( 1 );
   	arbol.insert( 0 );
   	arbol.insert( 2 );
   	arbol.insert( 5 );
   	arbol.insert( 4 );
   	arbol.insert( 6 );
   	/*
   	*/

   	//insering in this order will build a linked list to left
   	/*
   	arbol.insert( 6 );
   	arbol.insert( 5 );
   	arbol.insert( 3 );
   	arbol.insert( 4 );
   	arbol.insert( 2 );
   	arbol.insert( 1 );
   	arbol.insert( 0 );
   	*/

   	System.out.println( "tree after insertions:\n" + arbol );
   	System.out.println();

   	System.out.println();
   	for( int i=-1; i<8; i++ ) {
   	    System.out.println(" searching for "+i+": " + arbol.search(i) );
   	}

   	System.out.println();
   	System.out.println( arbol );

   	arbol.remove(6);
   	System.out.println();
   	System.out.println( arbol );

   	arbol.remove(5);
   	System.out.println();
   	System.out.println( arbol );

   	arbol.remove(4);
   	System.out.println();
   	System.out.println( arbol );

   	arbol.remove(3);
   	System.out.println();
   	System.out.println( arbol );

   	arbol.remove(2);
   	System.out.println();
   	System.out.println( arbol );

   	arbol.remove(1);
   	System.out.println();
   	System.out.println( arbol );

   	arbol.remove(0);
   	System.out.println();
   	System.out.println( arbol );
      /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class
