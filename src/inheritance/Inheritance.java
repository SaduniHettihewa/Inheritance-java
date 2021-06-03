
package inheritance;


public class Inheritance {

  
    public static void main(String[] args) {
       SoftwareEngineer se = new  SoftwareEngineer();
        System.out.println(" Software Engineer ");
        float basicSalary = se.basicSalary;
        float bounus = se.bonus;
        float salary =se.salary;
        float total =basicSalary+bounus+salary;
        
        System.out.println(" Department -: "+se.department);
        System.out.println(" Section -: "+se.section);
        System.out.println(" Salary  -: Rs." +total );
       
    }
    
}
