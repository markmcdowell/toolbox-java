// automatically generated by the FlatBuffers compiler, do not modify

package com.reactivemarkets.encoding.fbs;

public final class MarketDataFlag {
    public static final short Level3 = 1;
    public static final short Bucketed = 2;
    public static final short NonSweepable = 4;
    public static final short Tradeable = 8;
    public static final short FullAmountLadder = 16;
    public static final String[] names = {"Level3", "Bucketed", "", "NonSweepable", "", "", "", "Tradeable", "", "", "", "", "", "", "", "FullAmountLadder",};

    private MarketDataFlag() {
    }

    public static String name(int e) {
        return names[e - Level3];
    }
}

