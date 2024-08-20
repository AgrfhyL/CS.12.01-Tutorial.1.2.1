public class StepTracker {
    private int ADays;
    private int Days;
    private int tot;
    private int goal;

    public StepTracker(int goal) {
        this.goal = goal;
    }
    public int getDays(){
        return Days;
    }
    public int getTotalSteps() {
        return tot;
    }
    public int getActiveDays() {
        return ADays;
    }
    public int activeDays() {
        return ADays;
    }
    public int getStepsForActiveDay() {
        return goal;
    }
    public int averageSteps() {
        if (Days != 0 && tot >= 0) {
            return tot/Days;
        } else {
            return 0;
        }
    }
    public void addDailySteps(int step) {
        if (step >= goal) {
            goal = step;
            ADays+=1;
        }
        tot += step;
        Days += 1;
    }
}
