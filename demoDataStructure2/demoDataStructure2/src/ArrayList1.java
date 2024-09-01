public class ArrayList1 {
    private Integer[] integers;

    public ArrayList1() {
        this.integers = new Integer[0];
    }

    public Integer[] getIntegers() {
        return this.integers;
    }

    public void remove(int index) {
        Integer[] arr = new Integer[this.integers.length - 1];
        int idx = 0;
        for (int i = 0; i < this.integers.length - 1; i++) {
            if (i != index) {
                arr[idx++] = this.integers[i];
            }
        }

    }

    public int size() {
        return this.integers.length;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void add(Integer i) {
        Integer[] arr = new Integer[this.integers.length + 1];
        int idx = 0;
        for (Integer j : this.integers) {
            arr[idx++] = j;
        }
        arr[idx] = i;
        this.integers = arr;
    }
}
