/**
  Team Cookie (Justin Mohabir, Lawrence Joa, Lior)
  APCS pd7
  HW96
  2022-05-10m
  time spent: 1 hrs
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

  public TreeNode search(int x) {
    TreeNode currNode = _root;
    while (true) {
      if (currNode == null) {
        return null;
      }
      else if (x < currNode.getValue()) {
        currNode = currNode.getLeft();
      }
      else if (x > currNode.getValue()) {
        currNode = currNode.getRight();
      }
      else {
        return currNode;
      }
    }
  }

  public int height() {
    return height(_root);
  }

  public int height(TreeNode currNode) {
    if (currNode == null) {
      return 0;
    }
    else if (height(currNode.getLeft()) > height(currNode.getRight())) {
      return (1 + height(currNode.getLeft()));
    }
    else {
      return (1 + height(currNode.getRight()));
    }
  }

  public int numLeaves(){
    return numLeaves(_root);
  }

  public int numLeaves(TreeNode currNode) {
    if (currNode == null) {
      return 0;
    }
    else {
      return (1 + numLeaves(currNode.getLeft()) + numLeaves(currNode.getRight()));
    }
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  //main method for testing
  public static void main( String[] args )
  {


      BST arbol = new BST();

      //PROTIP: sketch state of tree after each insertion
      //        ...BEFORE executing these.
      arbol.insert( 4 );
      arbol.insert( 2 );
      arbol.insert( 5 );
      arbol.insert( 6 );
      arbol.insert( 1 );
      arbol.insert( 3 );


      System.out.println( "\n-----------------------------");
      System.out.println( "pre-order traversal:" );
      arbol.preOrderTrav();
      System.out.println( "\n-----------------------------");
      System.out.println( "in-order traversal:" );
      arbol.inOrderTrav();

      System.out.println( "\n-----------------------------");
      System.out.println( "post-order traversal:" );
      arbol.postOrderTrav();

      System.out.println( "\n-----------------------------");
      System.out.println( "height:" );
      System.out.print( arbol.height()); 
  
      System.out.println( "\n-----------------------------");
      System.out.println( "number of leaves:" );
      System.out.print( arbol.numLeaves()); 
  
      System.out.println( "\n-----------------------------");
      System.out.println( "searching for 5" );
      System.out.print( arbol.search(5)); 
  
      System.out.println( "\n-----------------------------");
      System.out.println( "searching for 10" );
      System.out.print( arbol.search(10)); 
      /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class