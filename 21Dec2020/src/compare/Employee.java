package compare;

 

public class Employee implements Comparable<Employee>
 {
   private int eno;
   private String name;
   private double salary;
   private String city;
   
   public Employee() {}

 

   public Employee(int eno, String name, double salary, String city) {
    super();
    this.eno = eno;
    this.name = name;
    this.salary = salary;
    this.city = city;
    }

 

@Override
public String toString() {
    return "Employee [eno=" + eno + ", name=" + name + ", salary=" + salary + ", city=" + city + "]\n";
}

 

public int getEno() {
    return eno;
}

 

public void setEno(int eno) {
    this.eno = eno;
}

 

public String getName() {
    return name;
}

 

public void setName(String name) {
    this.name = name;
}

 

public double getSalary() {
    return salary;
}

 

public void setSalary(double salary) {
    this.salary = salary;
}

 

public String getCity() {
    return city;
}

 

public void setCity(String city) {
    this.city = city;
}

 

@Override
public int hashCode() {
    return eno+32;
}

 

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Employee other = (Employee) obj;
    if (eno != other.eno)
        return false;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    return true;
}

 

   @Override
   public int compareTo(Employee e)
   {
//       if(eno>e.getEno())
//           return -1;
//       else if(eno<e.getEno())
//           return 1;
//       else
//           return 0;
	   //return name.compareTo(e.name); //name alphabetical order
	   return -name.compareTo(e.name); //reverse alphabetical order
   }
   
 } 