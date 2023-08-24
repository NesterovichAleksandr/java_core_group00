package hometasks.getman.lesson1.b2.task3;

public class Run {

    public static void main(String[] args) {
        KeelBirds goose = new Goose();
        KeelBirds seagull = new Seagull();
        KeelBirds stork = new Stork();
        goose.voice();
        seagull.voice();
        stork.voice();

        KeellessBirds ostrich = new Ostrich();
        KeellessBirds emu = new Emu();
        KeellessBirds kiwi = new Kiwi();
        ostrich.voice();
        emu.voice();
        kiwi.voice();

        Penguins emperor = new TheEmperorPenguin();
        Penguins kind = new TheKindPenguin();
        Penguins galapagos = new GalapagosPenguin();
        emperor.voice();
        kind.voice();
        galapagos.voice();
    }

}
