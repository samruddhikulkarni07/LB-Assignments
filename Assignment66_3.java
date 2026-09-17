/*
3. Group Employees Department-Wise

Employee records:

Amit    IT
Rahul   HR
Pooja   IT
Neha    Finance
Kiran   HR
Riya    IT

Expected output:

IT:
Amit
Pooja
Riya

HR:
Rahul
Kiran

Finance:
Neha
*/

import java.util.*;

class Employee
{
    public String name;
    public String department;

    public Employee(String name, String department)
    {
        this.name = name;
        this.department = department;
    }
}

class Assignment66_3
{
    public static void main(String A[])
    {
        Employee e1 = new Employee("Amit","IT");
        Employee e2 = new Employee("Rahul","HR");
        Employee e3 = new Employee("Pooja","IT");
        Employee e4 = new Employee("Neha","Finance");
        Employee e5 = new Employee("Kiran","HR");
        Employee e6 = new Employee("Riya","IT");

        ArrayList <Employee> employee = new ArrayList<Employee>();

        ArrayList <String> IT = new ArrayList<String>(); 
        ArrayList <String> HR = new ArrayList<String>();
        ArrayList <String> Finance = new ArrayList<String>();

        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        employee.add(e4);
        employee.add(e5);
        employee.add(e6);

        for(Employee eobj : employee)
        {
            if(eobj.department.equals("IT"))
            {
                IT.add(eobj.name);

            }
            else if(eobj.department.equals("HR"))
            {
                HR.add(eobj.name);
            }
            else
            {
                Finance.add(eobj.name);
            }
        }

        System.out.println("IT : ");
        for(String name : IT)
        {
            System.out.println(name);
        }
        System.out.println();

        System.out.println("HR : ");
        for(String name : HR)
        {
            System.out.println(name);
        }
        System.out.println();

        System.out.println("Finance : ");
        for(String name : Finance)
        {
            System.out.println(name);
        }
        System.out.println();

    }
}