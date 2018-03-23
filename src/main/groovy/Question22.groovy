import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader

class Question22
{
    public static void main(String[] args)
    {
      List <Employe>list = new ArrayList<>()

        list.add(new Employe("Payal","IT",30,2821,4000))
        list.add(new Employe("ITperson","IT",23,2727,8000))
        list.add(new Employe("ABC","HR",22,2827,10000))
        list.add(new Employe("XYZ","SALES",26,2818,18000))
        list.add(new Employe("PQR","IT",25,2008,5000))
        list.add(new Employe("Pia","HR",28,2118,11000))
        list.add(new Employe("salesperson","SALES",30,2998,3000))

        println("PART 1 : Grouping the employees on the basis of the bracket in which their salary falls")

        def firstSlab = 0..5000
        def secondSlab = 5001..10000
        def thirdSlab = 100001..15000

        List<Employee> p=[]

        p<<list.findAll { it.salary in  firstSlab}
                        println("employees having salary in the slab 0-5000 are ->")
                    p.each {
                        println(p.name)
                    }
        p=[]

        p<<list.findAll { it.salary in secondSlab }
                        println("employees having salary in the slab 5001-10000 are ->")
                    p.each {
                        println(p.name)
                    }

        p=[]

        p<<list.findAll { it.salary in thirdSlab }
                println("employees having salary in the slab 10001-15000 are ->")
                p.each {
                     println(p.name)
                   }
        p=[]


        println("PART 3 : name of employees having age between 18-35 ->")
        def ageRange=18..35
        p<<list.findAll {it.age in ageRange}
                        p.each {println(p.name)}
        p=[]

        println("PART 2: No. of employees in each department -> ")

        Map map = new HashMap()
        list.each {
            if (map.containsKey(it.deptname))
            {

                map.put(it.deptname,map.get(it.deptname)+1)
            }
            else
            {
                map.put(it.deptname,1)
            }
        }

        println(map)

        println("PART 5: Grouping of employees according to their department ->")

        Map<String, List<String>> newMap = new HashMap<String, List<String>>()

        List<String> newList1 = new ArrayList<String>()
        List<String> newList2 = new ArrayList<String>()

        list.each {
            if (newMap.containsKey(it.deptname))
           {
                newList1<<it.name
                newList1+= newMap.get(it.deptname)
                newMap.put(it.deptname,newList1)
               newList1=[]
            }
            else
            {
                newList1.add(it.name)
                newMap.put(it.deptname,newList1)
                newList2<<newList1
                newList1=[]
            }
        }

        println(newMap)

        println("\n PART 4: Grouping of employee by first letter of first name having age greater then 25:-> ")

        def b=list.findAll{ it.age>25}
        b=b.groupBy({it.name.charAt(0)})
        println(b)


    }

}

class Employe
{
    String name
    String deptname
    Integer age
    Integer empno
    Integer salary

    Employe(String name, String deptname, Integer age, Integer empno, Integer salary)
    {
        this.name = name
        this.deptname = deptname
        this.age = age
        this.empno = empno
        this.salary = salary
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", deptname='" + deptname + '\'' +
                ", age=" + age +
                ", empno=" + empno +
                ", salary=" + salary +
                '}';
    }
}
