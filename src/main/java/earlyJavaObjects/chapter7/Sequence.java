package earlyJavaObjects.chapter7;

public class Sequence {
    private int[] values;

    public Sequence(int size) {
        values = new int[size];
    }

    public void set(int i, int n) {
        values[i] = n;
    }

    public int get(int i) {
        return values[i];
    }

    public int size() {
        return values.length;
    }

    public boolean equals(Sequence other) {
        int count = 0;
        for (int i = 0; i < other.size(); i++) {
            if (values[i] == other.get(i)) {
                count++;
            }
        }
        if (count == other.size()) {
            return true;
        }
        return false;
    }

    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public int[] removeDuplicates(int[] arr) {
        return arr;
    }

    public boolean sameValues(Sequence other) {
        return false;
    }

}
