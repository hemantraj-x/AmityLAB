class OuterClass {

    void showOuter() {
        System.out.println("This is outer class method");
    }

    class InnerClass {
        void showInner() {
            System.out.println("This is inner class method");
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.showOuter();

        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.showInner();
    }
}