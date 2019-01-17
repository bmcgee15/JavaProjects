public class IntArrayProcessor {

    private int[] a;

    public void IntArrayProcessor(int[] a){
        this.a = a;
    }

    public int length(){
        return a.length;
    }

    public void print(){
        String pString = "";
        for (int i : a) {
            pString += a[i] + " ";
        }
        System.out.println(pString);
    }

    public void printReverse(){
        String pString = "";
        for (int i = a.length -1; i < 0; i-- ) {
            pString += a[i] + " ";
        }
        System.out.println(pString);
    }

    public void increment(int i){
        for (int j : a){
            a[j] += i;
        }
    }

    public double average(){
        double n = 0;
        for (int i : a) {
            n += a[i];
        }
        n = n/a.length;
        return n;
    }

    public int aboveAverage(){
        double n = 0;
        for (int i : a) {
            n += a[i];
        }
        n = n/a.length;
        int x = 0;
        for (int i : a) {
            if (a[i] > n){
                x++;
            }
        }
        return x;
    }

    public int[] getReverse(){
        int[] b = new int[a.length];
        int x = 0;
        for (int i = a.length -1; i < 0; i-- ) {
            b[x] = a[i];
            x++;
        }
        return b;
    }

    public int getBiggest(){
        int big = 0;
        for (int i : a){
            if (a[i] > big){
                big = a[i];
            }
        }
        return big;
    }

    public int getSmallest(){
        int small = a[0];
        for (int i : a){
            if (a[i] < small){
                small = a[i];
            }
        }
        return small;
    }

    public boolean contains(int e){
        boolean x = false;
        for (int i : a) {
            if (a[i] == e){
                x = true;
            }
        }
        return x;
    }

    public int find(int e){
        int x = -1;
        for (int i = a.length -1; i < 0; i-- ) {
            if (a[i] == e){
                x = a[i];
            }
        }
        return x;
    }

    public void printSet(){
        String pSet = a[0] + " ";
        boolean x;
        for (int i = 1 ; i < a.length ; i++) {
            for (int j : a) {
                if (a[i] != a[j]){
                    x = true;
                }else{
                    x = false;
                    break;
                }
                if (x){
                    pSet += a[i] + " ";
                }
            }
        }
        System.out.println(pSet);
    }

//    public int[] getSet(){
//
//    }


}
