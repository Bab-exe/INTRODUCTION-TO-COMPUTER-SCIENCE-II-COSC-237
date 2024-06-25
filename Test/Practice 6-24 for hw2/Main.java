
public class Main{
    public static void main(String[] args) {
    

        Integer[] list = {16};
        
        
        System.out.println("length: " + list.length);
        System.out.println("min data: " + minArray(list));
        System.out.println("max data: " + maxArray(list));
        
    }

    
    static <T extends Comparable<T>> T max(T x, T y){ 
        return (
            (x.compareTo(y) > 0)
            ? x
            : y
        );

    }

    static <T extends Comparable<T>> T maxArray(T[] list){

        T current_max = (list.length == 0) ? null : list[0];
        for (T value: list)
            current_max = max(current_max, value);
        
        return current_max;

    }
    
    static <T extends Comparable<T>> T minArray(T[] list){
        T current_min = (list.length == 0) ? null : list[0];
        for (T value: list)
            current_min = (current_min.compareTo(value) > 0) ? value : current_min;
        

        return current_min;
    }

    static <T> Integer Find(T[] list,T key){
        
        for (int i = 0 ; i < list.length ; i++){
            if (key.equals(list[i])) return i;   
        }

        return null;
    }
}

