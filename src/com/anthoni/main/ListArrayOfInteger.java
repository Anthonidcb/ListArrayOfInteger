public class ListArrayOfInteger {
    private static final int INITIAL_SIZE = 10;
    private Integer[] data;
    private int count;

    public ListArrayOfInteger(int tam) {
        if (tam <= 0) {
            tam = INITIAL_SIZE;
        }
        data = new Integer[tam];
        count = 0;
    }

    public ListArrayOfInteger() {
        this(INITIAL_SIZE);
    }

    public void clear() {
        data = new Integer[INITIAL_SIZE];
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void add(Integer element) {
        if (count == data.length) {
            setCapacity(data.length * 2);
        }
        data[count] = element;
        count++;
    }

    public Integer get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("ERRO: " + index);
        }
        return data[index];
    }

    private void setCapacity(int newCapacity) {
        if (newCapacity != data.length) {
            int min = Math.min(data.length, newCapacity);
            Integer[] newData = new Integer[newCapacity];
            for (int i = 0; i < min; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < count; i++) {
            s.append(data[i]);
            if (i != (count - 1)) {
                s.append(",");
            }
        }
        s.append("\n");
        return s.toString();
    }
    public class App{
        public static void main(String []args) {
            ListArrayOfInteger lista = new ListArrayOfInteger();
            lista.add(8);
            System.out.println(lista);
        }
    }

    
} 