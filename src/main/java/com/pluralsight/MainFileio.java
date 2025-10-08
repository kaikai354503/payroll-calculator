package com.pluralsight;

import java.io.*;

public class MainFileio {
    public static void main(String[] args){

        try (FileWriter writer = new FileWriter("src/main/resources/payroll.csv")){

            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //writes a new file
            //FileWriter writer = new FileWriter("src/main/resources/payroll.csv");

            //read the header line
            //id|name|hours| payrate
           bufferedReader.readLine();

            //Read the rest of the file
            String input;
            while((input = bufferedReader.readLine()) != null){

                //seperates at the "|"
               String[] sections = input.split("\\|");
                //System.out.println(sections);

                //employee constructor              passes in data from file
                Employee employee = new Employee(Integer.parseInt(sections[0]),sections[1],(Double.parseDouble(sections[2])),(Double.parseDouble(sections[3])));

                System.out.printf("Employee ID: %d | Name: %s | Gross Pay: $%.2f%n",employee.getId(), employee.getName(),  employee.calculateGrossPay());
                //writes into new file
                writer.write("Employee ID: " + employee.getId() + "| " + "Name: " + employee.getName() + "| " + "Gross Pay: " +employee.calculateGrossPay() + "\n");
            }

            bufferedReader.close();

        }

        catch (FileNotFoundException e){
            System.out.println("File not found" + e);

        }
        catch (IOException e){
            System.out.println("IO exception");
        }
    }

}
