public class Stack{
    private int _size;
    private int _top;
    private int[] _list;

    
    public Stack(){
        _top = 0;
        _size = 0;
    }

    public Stack(int size){
        _size = (size > 0) ? size : 0;
        _list = new int[_size];

        
    }
    //get
    public int getSize(){
        return _size;
    }

    public int[] getList(){
        return _list;
    }

    //set

    public void setSize(final int SIZE){
        _size = (SIZE > 0) ? SIZE : _size;

    }

    public void setList(int ... list){

        this._list = new int[_size];

        _top = _size - 1;
        for (int value : list){
            push(value); 
        }

        
    }

    public boolean isStackFull(){
        return _top >= _size-1;
    }

    public boolean isStackEmpty(){
        return _top < 0;
    }

    public boolean push(int value){
        if (isStackFull()){
            System.err.println("Error: Stack is full");
            return false;
        }
        
        _list[ _top+=1 ] = value;

        return true;

    }

    public boolean pop(){
        if (isStackEmpty()) return false;


        _top -= 1;

        return true;
    }
    public int peek(){
        if (isStackEmpty()) return 0;

        return _list[_top];




    }
    public String toString(){
        if (isStackEmpty() || _list == null)  return "Stack is empty";
        
        final int TOP = _list[_top];
        String output = "size: \t" + _size + "\ntop index: \t[" + _top + "]\ntop value: \t" + TOP;
        
        output += "\nList:\n[";
        for (int i = 0; i < _top - 1; i++)
            output += _list[i] + ", ";
        
        return output + TOP + "]";
    }
}
