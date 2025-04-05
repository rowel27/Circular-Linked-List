/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlistproject;

/**
 *
 * @author rowele
 */
public class LinkedListAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircularLinkedList a = new CircularLinkedList();
        a.insert(10);
        a.insert(20);
        a.insert(30);
        a.insert(40);
        a.display();
        System.out.println(a.current());
        System.out.println(a.search(10));
        System.out.println(a.current());
        System.out.println(a.delete());
        a.step();
        System.out.println(a.current());
        a.display();
        a.step();
        a.insert(27);
        a.step();
        a.step();
        a.display();

    }
    
}
