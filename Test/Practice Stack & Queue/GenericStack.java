public class GenericStack<T> {
        public int _top;
        public int _size;

        public T[] _list;
    
    public GenericStack(int size){
        _top = 0;
        _size = (size > 0) ? size : 0;

        _list = (T[]) new Object[_size];
    }

    public boolean isStackFull(){
        return _top >= _size-1;
    }

    public boolean isStackEmpty(){
        return _top < 0;
    }

    public boolean push(T value){
        if (isStackFull()){
            System.err.println("Error: Stack is full");
            return false;
        }
        _top += 1;
        _list[ _top ] = value;
        return true;
    }
    
}
