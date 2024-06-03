package Bank__Accoint;

public class Account {
    private int diposit, withdrow,mainBalance,TotalBalance=5000;

    public void setAll(int diposit, int withdrow, int mainBalance) {
        this.diposit = diposit;
        this.withdrow = withdrow;
        this.mainBalance = mainBalance;

    }

    public int getDiposit() {
        return diposit;

    }

    public int getWithdrow() {
        return withdrow;
    }

    public int getMainBalance() {
        return mainBalance=diposit-withdrow;

    }

}