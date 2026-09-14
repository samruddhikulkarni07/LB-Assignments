/*
A hospital receives patients with severity levels:

Rahul 2
Amit 5
Pooja 1
Neha 4

Higher severity should be treated first.

Expected order:

Amit
Neha
Rahul
Pooja

Create a Patient class containing:

String name;
int severity;
*/

import java.util.*;

class Patient
{
    public String name;
    public int severity;

    public Patient(String a, int b)
    {
        this.name = a;
        this.severity = b;
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}

class Assignment65_3
{
    public static void main(String A[])
    {
        Patient p1 = new Patient("Rahul",2);
        Patient p2 = new Patient("Amit",5);
        Patient p3 = new Patient("Pooja",1);
        Patient p4 = new Patient("Neha",4);

        ArrayList<Patient> aobj = new ArrayList<Patient>();

        aobj.add(p1);
        aobj.add(p2);
        aobj.add(p3);
        aobj.add(p4);

        Collections.sort(aobj, new Comparator<Patient>()
        {
            public int compare(Patient p1, Patient p2)
            {
                return p2.severity - p1.severity;
            }

        });

        for(Patient p : aobj)
        {
            System.out.println(p);
        }
    }
}