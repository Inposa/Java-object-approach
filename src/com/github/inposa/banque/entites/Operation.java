package com.github.inposa.banque.entites;

public abstract class Operation {
    private String dateOperation;
    private int montantOperation;

    public Operation() {
    }

    public Operation(String dateOperation, int montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Operation{" +
                "dateOperation='" + dateOperation + '\'' +
                ", montantOperation=" + montantOperation + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public int getMontantOperation() {
        return montantOperation;
    }

    public void setMontantOperation(int montantOperation) {
        this.montantOperation = montantOperation;
    }
}
