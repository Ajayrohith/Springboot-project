package com.project.RestApi.Components;



import org.springframework.stereotype.Component;

@Component
public class CreateUserRequest {

    private String firstName;
    private String lastName;
    private int age;
    private String company;

    

    public CreateUserRequest(String firstName, String lastName, int age, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.company = company;
    }
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    @Override
    public String toString() {
        return "CreateUserRequest [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", company="
                + company + "]";
    }
    public static CreateUserRequest get(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
    


}
