
package inheritance;


public class Inheritance {

  
    public static void main(String[] args) {
        //object create for Software Engineer
       SoftwareEngineer se = new  SoftwareEngineer();
        System.out.println(" Software Engineer ");
        float basicSalary = se.basicSalary;
        float bounus = se.bonus;
        float salary =se.salary;
        float total =basicSalary+bounus+salary;
        
        System.out.println(" Department -: "+se.department);
        System.out.println(" Section -: "+se.section);
        System.out.println(" Salary  -: Rs." +total );
//        
        System.out.println("-----------------------");
       //object create for QA
       QA qa = new QA();
        System.out.println(" Qulity Assurance ");
        float basicSal = qa.basicSalary;
        float bounu= qa.bonus;
        float sal =qa.salary;
        float totalSal =basicSal+bounu+sal;
        
        System.out.println(" Department -: "+qa.department);
        System.out.println(" Section -: "+qa.section);
        System.out.println(" Salary  -: Rs." +totalSal );
       
    }
    
}
