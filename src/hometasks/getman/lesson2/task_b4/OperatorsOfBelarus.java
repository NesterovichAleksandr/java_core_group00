package hometasks.getman.lesson2.task_b4;

public enum OperatorsOfBelarus {
    VELCOM_A1("VELCOM","44","29"),
    MTS("MTS","33","29"),
    LIFE("MTS","25");

    private String nameOfOperator;
    private String prefix;
    private String prefix2;

    OperatorsOfBelarus(String nameOfOperator, String prefix, String prefix2) {
        this.nameOfOperator = nameOfOperator;
        this.prefix = prefix;
        this.prefix2 = prefix2;
    }

    OperatorsOfBelarus(String nameOfOperator, String prefix) {
        this.nameOfOperator = nameOfOperator;
        this.prefix = prefix;
    }

    public String getNameOfOperator() {
        return nameOfOperator;
    }

    public void setNameOfOperator(String nameOfOperator) {
        this.nameOfOperator = nameOfOperator;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix2() {
        return prefix2;
    }

    public void setPrefix2(String prefix2) {
        this.prefix2 = prefix2;
    }
}
