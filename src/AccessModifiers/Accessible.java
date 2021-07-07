package AccessModifiers;

//Challenge:
//In the following interface declaration, what i the visibility of:
//
//1. the Accessible interface?
//2. the int variable SOME_CONSTANT?
//3. metgodA?
//4. methodB and methodC?

interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();

}

//1.
//4. public because it's interface