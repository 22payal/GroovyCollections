class Question8 {

    public static void main(String[] args)
    {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("payal",22,2000))
        list.add(new Employee("abc",21,4000))
        list.add(new Employee("xyz",20,3000))


        println("employees who earn less than 5000 :")

        List<Employee> p=[]
        p<<list.findAll {it.salary<5000}
        p.each {
            println(p.name)
        }
        p=[]

        println("name of the youngest employee : ")

        p<<list.min{it.age}
        println(p.name)

        p=[]

        println("name of the oldest employee :")
        p<<list.max{it.age}
        println(p.name)

        p=[]

        println("name of the employee with the maximum salary :")
        p<<list.max{it.salary}
        println(p.name)

        p=[]

        println("list of names of all the employees ->")

        p<<list.findAll{println(it.name)}
        p=[]


    }
}

class Employee
{
    String name;
    int Age;
    int salary;String getName() {
    return name
}

    void setName(String name) {
        this.name = name
    }

    int getAge() {
        return Age
    }

    void setAge(int age) {
        Age = age
    }

    int getSalary() {
        return salary
    }

    void setSalary(int salary) {
        this.salary = salary
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                ", salary=" + salary +
                '}';
    }

    Employee(String name, int age, int salary) {
        this.name = name
        Age = age
        this.salary = salary
    }
}
