import java.util.ArrayList;

public class ArrayListStack<E> implements MyStack<E>{
    private ArrayList<E> myList=new ArrayList();
    public ArrayListStack(ArrayList<E>myList){
        this.myList=myList;
    }

    @Override
    public void push(E item) {
        myList.add(0,item);
    }

    public E pop(){
        return myList.remove(0);
    }

    @Override
    public E top() {
        return myList.get(0);
    }

    public boolean isEmpty(){
        if(myList.size()>0){
            return false;
        }
        return true;
    }
}
