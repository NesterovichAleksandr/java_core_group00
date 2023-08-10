package hometasks.Getman.lesson1.c2.task3;

public abstract class Shop {
    private String name;
    private int id;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "name-"+getName()+", address-"+getAddress()+", Id-"+getId();
    }

    public abstract void sales();
    public abstract void purchases();
}
