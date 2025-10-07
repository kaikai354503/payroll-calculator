package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainFileio {
    public static void main(String[] args){

        try {

            FileReader fileReader = new FileReader("src/main/resorces/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //read the header line
            //id|name|hours| payrate
           bufferedReader.readLine();

            //Read the rest of the file
            String input;
            while((input = bufferedReader.readLine()) != null){
                System.out.println(input);
               String[] sections = input.split("\\|");
                System.out.println(sections);

                //employee constructor              passes in data from file
                Employee employee = new Employee(Integer.parseInt(sections[0],sections[1],(Float.parseFloat(sections[2]),(Float.parseFloat(sections[3])));

                System.out.println("Employee named %s made %f", employee.getName, employee.calculateGrossPay());
            }

        }

        catch (FileNotFoundException e){
            System.out.println("File not found" + e);

        }
        catch (IOException e){
            System.out.println("IO exception");
        }
    }

}
