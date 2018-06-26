package com.company.Shopping;

import java.util.ArrayList;

public class PurchasingCharacteristics {

    private String purchaseName;
    private int purchasePrise;

    public PurchasingCharacteristics(String purchaseName, int purchasePrise) {
        setPurchaseName(purchaseName);
        setPurchasePrise(purchasePrise);
    }

    private void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    private void setPurchasePrise(int purchasePrise) {
        this.purchasePrise = purchasePrise;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public double getPurchasePrise() {
        return purchasePrise;
    }

    @Override
    public String toString() {
        return purchaseName + " " + purchasePrise;
    }
}
