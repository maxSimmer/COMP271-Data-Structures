package linkedLists;
import java.io.ObjectInputStream.GetField;

import javax.sound.midi.Soundbank;

public class Node {
    // node fundmentally has two parts, the pointer (next, to another of its kind)
    // and it has the payload (all other class variables)
    // payload = address, hours of operation, machine for tickets

    Node next; // point to another of its kind
    //String data;
    //int key;
    //double brownLittleFox;
    //You can put whatever into a node, as long as the building block can point to another of its kinds
    String data; //payload can be as many variables as can be

    public Node(String data) throws NullPointerException{
        if (data = null){
            this.data = "CMON, ENTER DATA";
        } else {
            this.data = data;
            this.next = null; //superflous, because .next is null by default // this line is by choice
            // Node newNode = newNode('TEST'); java assigns the next to null
        }
    }

    // we want to create a node first, then decide where we want it to go
    public void setNext(Node nextNode){
        this.next = nextNode;

    }
    
    public String getData(){
        return this.data;
    }

    // is there data?, give me the data
    public boolean hasData(){
        return this.data != null;
    }

    public Node getNext(){
        return this.next;
    }
    public boolean hasNext(){
        return this.next != null; // return this not next is NOT null
    }
    public static void main(String[] args) {
        Node test1 = new Node(null);
        Node test2 = new Node("hello");
        System.out.println("Object 1 %s: ");
    }

}

