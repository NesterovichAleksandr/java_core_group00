package hometasks.getman.lesson2.task_b4;

public enum OperatorsOfBelarus {
    VELCOM_A1("VELCOM",44,29),
    MTS("MTS",33,29),
    LIFE("MTS",25);

    private String nameOfOperator;
    private int prefix;
    private int prefix2;

    OperatorsOfBelarus(String nameOfOperator, int prefix, int prefix2) {
        this.nameOfOperator = nameOfOperator;
        this.prefix = prefix;
        this.prefix2 = prefix2;
    }

    OperatorsOfBelarus(String nameOfOperator, int prefix) {
        this.nameOfOperator = nameOfOperator;
        this.prefix = prefix;
    }

    public String getNameOfOperator() {
        return nameOfOperator;
    }

    public void setNameOfOperator(String nameOfOperator) {
        this.nameOfOperator = nameOfOperator;
    }

    public int getPrefix() {
        return prefix;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    public int getPrefix2() {
        return prefix2;
    }

    public void setPrefix2(int prefix2) {
        this.prefix2 = prefix2;
    }
}
