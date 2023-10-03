package java_hometask_2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;

public class Main
{	
	public static void main(String[] args)
	{
		//Setting up an array of type Car with ten cars
		Car[] cars = new Car[10];
		cars[0] = new Car(0, "BMW", "320d", 2012, "white", 50000, "ME-MH-2012");
		cars[1] = new Car(1, "VW", "Passat", 2002, "silver", 30000, "E-LH-2002");
		cars[2] = new Car(2, "Opel", "Corsa", 2012, "blue", 8000, "RS-LW-2012");
		cars[3] = new Car(3, "Skoda", "Yeti", 2012, "black", 20000, "E-LF-2012");
		cars[4] = new Car(4, "VW", "Golf", 1999, "white", 18000, "E-GL-1999");
		cars[5] = new Car(5, "VW", "Golf", 2005, "black", 5000, "E-MN-2005");
		cars[6] = new Car(6, "VW", "Golf", 2013, "silver", 10000, "M-DD-2013");
		cars[7] = new Car(7, "VW", "Golf", 2022, "green", 30000, "DO-AD-2022");
		cars[8] = new Car(8, "BMW", "120i", 2023, "gold", 17000, "M-BM-2023");
		cars[9] = new Car(9, "Mercedes Benz", "S500", 2012, "blacl", 60000, "S-MB-2012");
		
		//Using a FileWriter object to write the .txt-files
		FileWriter filew;
		
		//Exercise a) --> All cars of a given brand
		String brand = "BMW";
		try
		{
			//Initializing the FileWriter and writing a header to the .txt-file
			filew = new FileWriter("carsOfGivenBrand.txt");
			filew.write("All cars of the brand \"" + brand + "\":\n");
			
			//Iterating over the whole array and writing all matching cars to the .txt-file
			for(int i = 0; i < cars.length; i++)
			{
				if(cars[i].getBrand() == brand)
				{
					filew.write("ID: " + cars[i].getId() + ", ");
					filew.write("brand: " + cars[i].getBrand() + ", ");
					filew.write("model: " + cars[i].getModel() + ", ");
					filew.write("year of manufacture: " + cars[i].getYear_of_manufacture() + ", ");
					filew.write("color: " + cars[i].getColor() + ", ");
					filew.write("price: " + cars[i].getPrice() + ", ");
					filew.write("registration number: " + cars[i].getRegistration_number() + "\n");
				}
			}
			
			//Closing the .txt-file
			filew.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Exercise b) --> All cars of a given model and age
		String model = "Golf";
		int age = 5;
		try
		{
			//Re-initializing the FileWriter and writing a header to the .txt-file
			filew = new FileWriter("carsOfGivenModelAndAge.txt");
			filew.write("All cars of the model \"" + model + "\" and the age of " + age + " years or older:\n");
			
			//Iterating over the whole array and writing all matching cars to the .txt-file
			for(int i = 0; i < cars.length; i++)
			{
				if(cars[i].getModel() == model && (Year.now().getValue() - cars[i].getYear_of_manufacture()) >= age)
				{
					filew.write("ID: " + cars[i].getId() + ", ");
					filew.write("brand: " + cars[i].getBrand() + ", ");
					filew.write("model: " + cars[i].getModel() + ", ");
					filew.write("year of manufacture: " + cars[i].getYear_of_manufacture() + ", ");
					filew.write("color: " + cars[i].getColor() + ", ");
					filew.write("price: " + cars[i].getPrice() + ", ");
					filew.write("registration number: " + cars[i].getRegistration_number() + "\n");
				}
			}
			
			//Closing the .txt-file
			filew.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Exercise c) --> All cars of a year of manufacture and more expensive than a given price
		int year_of_manufacture = 2012;
		int priceLimit = 9000;
		try
		{
			//Re-initializing the FileWriter and writing a header to the .txt-file
			filew = new FileWriter("carsOfGivenYearOfManufactureAndLowerPriceLimit.txt");
			filew.write("All cars manufacured in the year " + year_of_manufacture + " that are more expensive than " + priceLimit + ":\n");
			
			//Iterating over the whole array and writing all matching cars to the .txt-file
			for(int i = 0; i < cars.length; i++)
			{
				if(cars[i].getYear_of_manufacture() == year_of_manufacture && cars[i].getPrice() > priceLimit)
				{
					filew.write("ID: " + cars[i].getId() + ", ");
					filew.write("brand: " + cars[i].getBrand() + ", ");
					filew.write("model: " + cars[i].getModel() + ", ");
					filew.write("year of manufacture: " + cars[i].getYear_of_manufacture() + ", ");
					filew.write("color: " + cars[i].getColor() + ", ");
					filew.write("price: " + cars[i].getPrice() + ", ");
					filew.write("registration number: " + cars[i].getRegistration_number() + "\n");
				}
			}
			
			//Closing the .txt-file
			filew.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
