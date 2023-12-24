package demo;

import org.testng.annotations.Test;

public class Q18Group_TestNg {

@Test(groups = {"Vegetable"})	
public void Potato() {
System.out.println("This is a potato & it is a vegetable");	
}	
@Test(groups = {"Fruit"})
public void Mango() {
System.out.println("This is a Mango & it is a Fruit");	
}
@Test(groups = {"Vegetable"})
public void Tomato() {
System.out.println("This is a Totato & it is a vegetable");	
}
@Test(groups = {"Fruit"})
public void Apple() {
System.out.println("This is an Apple & it is a Fruit");	
}
@Test(groups = {"Vegetable" , "Fruit"})
public void Jackfruit() {
System.out.println("This is a vegetable but it has fruit in his name");	
}
	
	
}
