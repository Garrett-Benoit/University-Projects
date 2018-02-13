/*	Project:	Assignment 2
 * 	Programmer:	Garrett Benoit
 * 	Due Date:	11/17/16
 */

package builder_package;

public class Builder_Model
{
	private final String firstName; // required
	private final String lastName; // required
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional
	
	private Builder_Model(ModelBuilder builder)
	{
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public int getAge()
	{
		return age;
	}
	public String getPhone()
	{
		return phone;
	}
	public String getAddress()
	{
		return address;
	}
	
	@Override
	public String toString()
	{
		return "Hero: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
	}
	
	public static class ModelBuilder
	{
		private final String firstName;
		private final String lastName;
		private int age;
		private String phone;
		private String address;
		
		public ModelBuilder(String firstName, String lastName)
		{
			this.firstName = firstName;
			this.lastName = lastName;
		}
		public ModelBuilder age(int age)
		{
			this.age = age;
			return this;
		}
		public ModelBuilder phone(String phone)
		{
			this.phone = phone;
			return this;
		}
		public ModelBuilder address(String address)
		{
			this.address = address;
			return this;
		}
		
		public Builder_Model build()
		{
			Builder_Model model = new Builder_Model(this);
			validateBuilderObject(model);
			return model;
		}
		private void validateBuilderObject(Builder_Model model)
		{
			
		}
	}
}
