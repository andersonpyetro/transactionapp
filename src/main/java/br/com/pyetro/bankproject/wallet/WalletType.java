package br.com.pyetro.bankproject.wallet;

public enum WalletType {
    CLIENT(1), VENDOR(2);

    private int value;

    private WalletType(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
