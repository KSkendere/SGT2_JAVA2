package lesson9;

public final class FinalClasses {
//    initialized during declaration
    final int CONSTANT_PI = 3;
//    not initialized during declaration
//    has to be initialized in ALL of constructors
    final int CONSTANT_NOINIT;

    private int someInt;

    public FinalClasses() {
        CONSTANT_NOINIT = 5;
    }

    public FinalClasses(int constant_noinit, int someInt) {
        CONSTANT_NOINIT = constant_noinit;
        this.someInt = someInt;
    }

    public FinalClasses(int CONSTANT_NOINIT) {
        this.CONSTANT_NOINIT = CONSTANT_NOINIT;
    }

    public int multiplyBySomeInt(int anotherInt){
        return someInt* anotherInt;
    }
}

//FINAL CLASS CAN NOT BE EXTENDED
//class ExtendedFinalClasses extends FinalClasses
