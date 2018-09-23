package sanz.git.project.stack;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class GenericStack<T>{
    Node top;
    private class Node{
        T data;
        Node pre;

        public Node(T data, Node o) {
            this.data = data;
            this.pre = o;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getPre() {
            return pre;
        }

        public void setPre(Node pre) {
            this.pre = pre;
        }
    }

    boolean isEmpty(){
        if(null==top){
            return true;
        }else {
            return false;
        }
    }

    T peek() {
        if (null != top) {
            return top.data;
        }else{
            throw new RuntimeException("stack is empty");
        }
    }

    T pop() throws RuntimeException {
        T res = this.peek();
        top = top.getPre();
        return res;
    }

    void push(T data){
        if (null != top) {
            Node newtop = new Node(data,top);
            top = newtop;
        }else{
            top = new Node(data,null);
        }
    }

    int search(T data){
        int found = -1;
        int count = 0;
        Node temp = top;
        while(temp != null){
            count++;
            if (data.toString().equals(temp.getData().toString())){
                found = count;
                break;
            }
            temp = temp.getPre();
        }
        return found;
    }
}
