package corejavapracticetest;
//What will be the output of the following program?
//for (int i = 1; i <= 10; i++) {
//    if (i == 3) {
//        continue;
//    }
//    if (i == 8) {
//        break;
//    }
//    System.out.print(i + " ");
//}
//Then modify the program so that it prints:
//1 2 4 5 6 7 9 10
//Constraint: You may only modify the conditions/statements inside the loop

public class LoopControl {
    static void main() {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue;//skips 3
            }
            if (i == 8) {
               // break;//stops at 8
                continue;//skips 8
            }
            System.out.print(i + " ");
        }

    }
}
