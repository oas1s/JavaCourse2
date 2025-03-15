public class Main {
    public static void main(String[] args) {
        Matrix m = new Matrix(new int[][]{{1,2,3},{4,5,6}});
        try {
            System.out.println(m.getElement(0,0));
            m.getElement(2,0);
        } catch (Exception e){
            System.out.println("");
        } finally {
            m.printMatrix();
        }
    }
}
