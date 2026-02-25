class MatrixSubtraction {
    int[][] a = {{8, 6}, {4, 2}};
    int[][] b = {{1, 2}, {3, 4}};
    int[][] c = new int[2][2];

    void subtract() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
    }

    void display() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixSubtraction obj = new MatrixSubtraction();
        obj.subtract();
        System.out.println("Resultant Matrix:");
        obj.display();
    }
}