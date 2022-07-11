package goodvsevil;

public class GoodVsEvil {
    public static String battle(String goodAmounts, String evilAmounts) {
        int[] goodWorth = {1, 2, 3, 3, 4, 10};
        int goodPower = 0;
        int[] evilWorth = {1, 2, 2, 2, 3, 5, 10};
        int evilPower = 0;
        for (int i = 0; i < goodWorth.length; i++) {
            goodPower += Integer.parseInt(goodAmounts.split(" ")[i]) * goodWorth[i];
        }
        for (int i = 0; i < evilWorth.length; i++) {
            evilPower += Integer.parseInt(evilAmounts.split(" ")[i]) * evilWorth[i];
        }
        return (goodPower > evilPower ? "Battle Result: Good triumphs over Evil" :
                (goodPower < evilPower ? "Battle Result: Evil eradicates all trace of Good" :
                        "Battle Result: No victor on this battle field"));
    }

    public static void main(String[] args) {
        System.out.println(battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
    }
}
