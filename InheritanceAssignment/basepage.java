package InheritanceAssignment;

public class basepage {
	
	public void findElement() {
        System.out.println("Finding web element");
    }

    public void clickElement() {
        System.out.println("Clicking web element");
    }

    public void enterText(String text) {
        System.out.println("Entering text: " + text);
    }

    public void performCommonTasks() {
        System.out.println("Performing common tasks from BasePage");
    }

}