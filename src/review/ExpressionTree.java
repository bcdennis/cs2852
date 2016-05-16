/**
 * CS2852
 * Spring 2016
 * Week 10
 */
package review;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Specialized BinaryTree to evaluate expression trees.
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class ExpressionTree {
    private BinaryTree<String> tree;


    /**
     * Constructs the Expression Tree using the binary tree.
     *
     * @param tree  the binary tree containing the expression.
     */
    public ExpressionTree(BinaryTree<String> tree) {
        this.tree = tree;
        ;
    }

    /**
     * Method to return the preorder traversal of the binary tree
     * as a sequence of strings each separated by a space.
     * @return A preorder traversal as a string
     */
    public String preorderToString() {
        StringBuilder stb = new StringBuilder();
        preorderToString(stb, tree.root);
        return stb.toString();
    }

    private void preorderToString(StringBuilder stb, BinaryTree.Node root) {
        //TODO implement me
    }

    /**
     * Method to return the postorder traversal of the binary tree
     * as a sequence of strings each separated by a space.
     * @return A postorder traversal as a string
     */
    public String postorderToString() {
        StringBuilder stb = new StringBuilder();
        postorderToString(stb, tree.root);
        return stb.toString();
    }

    private void postorderToString(StringBuilder stb, BinaryTree.Node root) {
        //TODO implement me
    }

    /**
     * A method to display the inorder traversal of a binary tree
     * placing a left parenthesis before each subtree and a right
     * parenthesis after each subtree. For example the expression
     * tree shown in Figure 6.12 from the book would be represented as
     * (((x) + (y)) * ((a) / (b))).
     * @return An inorder string representation of the tree
     */
    public String inorderToString() {
        StringBuilder stb = new StringBuilder();
        inorderToString(stb, tree.root);
        return stb.toString();
    }

    private void inorderToString(StringBuilder stb, BinaryTree.Node root) {
        //TODO implement me
    }

    /**
     * Evaluates the expression tree.  Supports +,-,*,/
     *
     * @return the result of the expression stored in the tree.
     */
    public int evaluate() {
        return evaluateWithRecursion(tree.root);
        //return evaluateWithStack(tree.root);
    }

    private int evaluateWithStack(BinaryTree.Node root) {
        //TODO implement me
        return 0;
    }

    private int evaluateWithRecursion(BinaryTree.Node root) {
        //TODO implement me
        return 0;
    }

    /**
     * Pretty prints the expression tree.
     */
    public void print() {
        tree.print();
    }

    public static void main(String[] args) throws Exception {
        BinaryTree<String> tree = BinaryTree.readBinaryTree(new BufferedReader(new FileReader("expression.txt")));
        ExpressionTree expression = new ExpressionTree(tree);

        expression.print();

        System.out.println("INORDER:\n" + expression.inorderToString());
        System.out.println("POSTORDER:\n" + expression.postorderToString());
        System.out.println("PREORDER:\n" + expression.preorderToString());

        System.out.println("EVALUATION: \n" + expression.evaluate());

    }


}
