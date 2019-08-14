package book.cleancode.chapter12;

abstract public class VacationPolicy {
    public void accrueVacation() {
        calculateBaseVacationHours();
        alterForLegalMinimums();
        applyToPayroll();
    }

    private void alterForLegalMinimums() { }
    abstract protected void calculateBaseVacationHours();
    private void applyToPayroll() { }
}
