package hometasks.lesson5.task2.lvlC._2;

public class Universal extends Shop{
    private boolean roundTheHours = false;

    public boolean isRoundTheHours() {
        return roundTheHours;
    }

    public void setRoundTheHours(boolean roundTheHours) {
        this.roundTheHours = roundTheHours;
        if (roundTheHours) {
            super.setWorkingHours("Round the Hours");
        }
    }

    @Override
    public void setWorkingHours(String workingHours) {
        if (roundTheHours) {
            super.setWorkingHours("Round the Hours");
        }
        else {
            super.setWorkingHours(workingHours);
        }
    }
}
