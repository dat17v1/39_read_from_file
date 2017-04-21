public class Person
{
    private String name; 
    private String lastName;
    private String age;
    private String cpr;

    public Person(String name, String lastName, String age, String cpr)
    {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.cpr = cpr;
    }

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }
    public String getAge(){
        return age;
    }
    public String getCpr(){
        return cpr;
    }
}