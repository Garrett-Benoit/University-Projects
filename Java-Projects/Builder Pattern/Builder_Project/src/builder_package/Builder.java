/*	Project:	Assignment 2
 * 	Programmer:	Garrett Benoit
 * 	Due Date:	11/17/16
 */

package builder_package;

public class Builder
{
	public static void main(String[] args)
	{
		Builder_Model model1 = new Builder_Model.ModelBuilder("Filet", "Minyon")
		.age(30)
		.phone("(337) 475-5000")
		.address("1776 Abbey Road")
		.build();
		
		System.out.println(model1);
		
		Builder_Model model2 = new Builder_Model.ModelBuilder("Gowen", "Getter")
		.age(40)
		.phone("(337) 475-5000")
		//no address
		.build();
		
		System.out.println(model2);
		
		Builder_Model model3 = new Builder_Model.ModelBuilder("Hardy", "Harr")
		//No age
		//No phone
		//no address
		.build();
		System.out.println(model3);
		
		Builder_Model model4 = new Builder_Model.ModelBuilder("Alfred L.", "Tennison")
		.age(21)
		.phone("(337) 475-5000")
		//no address
		.build();
		System.out.println(model4);
		
		Builder_Model model5 = new Builder_Model.ModelBuilder("Bud", "Leight")
		//No age
		.phone("(337) 475-5000")
		//no address
		.build();
		System.out.println(model5);
	}
}


