package InheritanceAssignment;

public class elements {
	public static void main(String args[]) {
	//Button object
	button button = new button();
	button.submit();
	button.click();
	button.setText("hie");
	System.out.println("-------");
	
	
	textfield txt=new textfield();
	txt.getText();
	txt.click();
	txt.setText("Test");
	System.out.println("-------");
	
	checkboxbutton checkBox = new checkboxbutton();
    checkBox.click();
    checkBox.submit();
    checkBox.setText("hola amigo");
    checkBox.clickCheckButton();
    System.out.println("-------");
    
    
    radiobutton rad=new radiobutton();
    rad.click();
    rad.submit();
    rad.setText("hi hlo");
    rad.selectRadioButton();
    System.out.println("-------");

}
}