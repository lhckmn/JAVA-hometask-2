package java_hometask_2;

public class Car
{
	//Setting up the attributes as private variables
	private int id;
	private String brand;
	private String model;
	private int year_of_manufacture;
	private String color;
	private int price;
	private String registration_number;
	
	
	//Implementing a constructor without and with arguments
	
	public Car()
	{
		this.id = 0;
		this.brand = "";
		this.model = "";
		this.year_of_manufacture = 0;
		this.color = "";
		this.price = 0;
		this.registration_number = "";
	}
	
	public Car(int id, String brand, String model, int year_of_manufacture, String color, int price, String registrarion_number)
	{
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year_of_manufacture = year_of_manufacture;
		this.color = color;
		this.price = price;
		this.registration_number = registrarion_number;
	}
	
	
	//Getters and setters for all attributes
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getModel()
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public int getYear_of_manufacture()
	{
		return year_of_manufacture;
	}
	public void setYear_of_manufacture(int year_of_manufacture)
	{
		this.year_of_manufacture = year_of_manufacture;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public String getRegistration_number()
	{
		return registration_number;
	}
	public void setRegistration_number(String registration_number)
	{
		this.registration_number = registration_number;
	}
}
