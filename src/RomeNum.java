public enum RomeNum {
    I(1, "I"),
    II(2, "II"),
    III(3, "III"),
    IV(4, "IV"),
    V(5, "V"),
    VI(6, "VI"),
    VII(7, "VII"),
    VIII(8, "VIII"),
    IX(9, "IX"),
    X(10, "X"),

    XX(20, "XX"),
    XXX(30, "XXX"),
    XL(40, "XL"),
    L(50, "L"),
    LX(60, "LX"),
    LXX(70, "LXX"),
    LXXX(80, "LXXX"),
    XC(90, "XC"),
    C(100, "C");

    private int num;
    private String rome;


    RomeNum(int num, String rome) {
        this.num = num;
        this.rome = rome;
    }

    public int getNum() {
        return this.num;
    }

    public String getRome() {
        return this.rome;
    }

    public static String arabicToRoman(int num) {
        String romanNum = "";
        if (num > 0) {
            int ed, dec;
                ed = num % 10;
                dec = num - ed;

                for (RomeNum x : RomeNum.values()) {
                    if (dec == x.num)
                        romanNum += x.rome;
                }
                for (RomeNum x : RomeNum.values()) {
                    if (ed == x.num)
                        romanNum += x.rome;
                }

            } else {
                return null;
            }
        return romanNum;
    }
}
