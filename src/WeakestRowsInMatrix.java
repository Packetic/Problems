import java.util.*;

public class WeakestRowsInMatrix {
    public static void main(String[] args) {
        List<Element> matlenn = new ArrayList<>();
        int k = 3;
        int[][] mat = {{1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0}, {1,1,0,0,0}, {1,1,1,1,1}};
        for (int i = 0; i < mat.length; i++) {
            matlenn.add(new Element(i, Arrays.stream(mat[i]).sum()));
        }
        Collections.sort(matlenn);
        List<Integer> li = new ArrayList<>();
        for (Element el : matlenn) {
            li.add(el.index);
        }
        int[] slice = li.subList(0, k).stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(slice));
    }
}

class Element implements Comparable<Element> {

    public int index, value;

    Element(int index, int value){
        this.index = index;
        this.value = value;
    }

    @Override
    public int compareTo(Element e) {
        return this.value - e.value;
    }

    @Override
    public String toString() {
        return "(" +
                  index +
                ", " + value +
                ')';
    }
}
