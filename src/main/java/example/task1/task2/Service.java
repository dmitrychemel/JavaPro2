package example.task1.task2;

public class Service {

    private  OuterService outerService;

    public void setOuterServiceService(OuterService outerService) {
        this.outerService = outerService;
    }

    public int calculate(int value) {
        int outerValue = outerService.getNumber();
        int result;
        if (outerValue == 0) {
            result = 7;
        } else {
            result = value + outerValue;
        }

        return result;
    }
}
