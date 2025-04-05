/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlistproject;

/**
 *
 * @author rowele
 */
public class CircularLinkedList {
    Node curr;
    int count;
    
    public CircularLinkedList(){
        curr = null;
        count = 0;
    }
    public boolean isEmpty(){
        return curr == null;
        //returns if the linked list is empty
    }
    public int current(){
        return curr.data;
        //returns value of current node
    }
    public int size(){
        return count;
        //returns size
    }
    public void insert(int item){
        Node n = new Node(item);
        if(isEmpty()){
            curr = n;
            curr.next = curr;
            //makes node that points to itself
        }
        else{
        Node temp = curr.next;
        curr.next = n;
        curr = curr.next;
        curr.next = temp;
        //move current
        //0(1) inserts after the current does not need to go through the linked list
        }
        count++;
    }
    public int search(int item){
        if(isEmpty()){
            return -1;
        }
        int cnt = -1;
        while(curr.data != item){
            if(cnt < size()){
            curr = curr.next;
            cnt++;
            }
            else
                return -1;
        //O(n) has to go through the linked list with while loop to see if the item you are searching for is there
        }
        // found item
        return curr.data;
    }
    public int delete(){
        if(isEmpty()){
            return -1;
        }
        else{
            Node temp = curr.next;
            curr.next = temp.next;
            count--;
            return temp.data;
            //move current
        }
        //0(1) complexity because you delete the item after current you do not need to go through the linked list
    }
    public void display(){
        int cnt = 0;
        while(cnt < size()){
            System.out.print(curr.data + "->");
            curr = curr.next;
            cnt++;
}
            System.out.print(curr.data);
            System.out.println();
            //O(n) a for loop is used that goes through the n elements of the linked list
    }
    public void step(){
        if(!isEmpty())
        curr = curr.next;
        //O(1) just moves the current forward
    }         
}
