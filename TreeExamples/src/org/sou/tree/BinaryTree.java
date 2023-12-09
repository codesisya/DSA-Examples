package org.sou.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {
  Node<T> head;

  public void levelOrder(Node<T> root) {
    Queue<Node<T>> q = new LinkedList<Node<T>>();
    q.add(root);
    q.add(null);
    while (!q.isEmpty()) {
      Node current = q.poll();
      if(current==null) {
        System.out.println();
        continue;
      }
      System.out.print(current.getData()+"  ");
      if (current.getLeft() != null)
        q.add(current.getLeft());
      if (current.getRight() != null)
        q.add(current.getRight());
    }
  }

  public static void inorder(Node root) {
    if (root == null)
      return;
    inorder(root.getLeft());
    System.out.println(root.getData());
    inorder(root.getRight());
  }

  public static void main(String[] args) {
    Node<Integer> head = new Node<Integer>(0);
    head.setLeft(new Node<>(1));
    head.setRight(new Node<>(2));
    inorder(head);
    BinaryTree bt = new BinaryTree();
    bt.head = head;
    bt.levelOrder(head);
  }

}
