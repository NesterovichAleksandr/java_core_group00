package hometasks.appendix;

public interface Buyer {
    void enterToMarket(); // вошёл в магазин (мгновенно)

    void chooseGoods(); // выбрал товар (0,5-2с)

    void goOut(); // направился на выход (мгновенно)
}
