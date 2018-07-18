package secao6;

public class FlourPack {
    private static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int sumTotal = 0;
        int idealQtyOfBig = 0;
        int idealQtyOfSmall;
        if (bigCount == 1 && smallCount == 0) {
            return goal == 5;
        }
        for (int i = bigCount; i > 0 && sumTotal < goal; i--) {
            sumTotal += 5;
            idealQtyOfBig++;
        }
        if (idealQtyOfBig > 0 && (goal % (idealQtyOfBig * 5) != 0) && (idealQtyOfBig * 5 > goal)) {
            idealQtyOfBig = idealQtyOfBig - 1;
        }
        if (idealQtyOfBig * 5 == goal) {
            return true;
        }
        System.out.println(idealQtyOfBig);
        int isLeft = goal - (idealQtyOfBig * 5);
        return isLeft <= smallCount;

    }

    public static void main(String[] args) {
        System.out.println(canPack(2, 2, 12));


    }
}
