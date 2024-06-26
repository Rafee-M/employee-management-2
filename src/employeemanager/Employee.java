package employeemanager;

/**
 *
 * @author Raafee-M
 */

public class Employee extends User{
    
    private String name;
    private int id;
    private int age;
    private int gender; //0 == male, 1 == female. Maybe add other genders in the future
    private String position;
    private int salary;
    private int assignedTask = 0;
    private int completedTask = 0;

    public int getAssignedTask() {
        return assignedTask;
    }

    public int getCompletedTask() {
        return completedTask;
    }

    public void setAssignedTask(int assignedTask) {
        this.assignedTask = assignedTask;
    }

    public void setCompletedTask(int completedTask) {
        this.completedTask = completedTask;
    }
    
    

    public Employee(){}
    
    public Employee(String name, int id, int age, int gender, String position, int salary) {
        
        
        super(name, "password", false);
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
    }
    
    //for defined username
    public Employee(String name, String username, int id, int age, int gender, String position, int salary) {
        
        
        super(username, "password", false);
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
    }
    
    //for defined password
    public Employee(String name, String username, String password, int id, int age, int gender, String position, int salary) {
        
        
        super(username, password, false);
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
    }
    
    
    
    
    //Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    
    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void taskCount(){
        this.assignedTask++;
    }
    
}
