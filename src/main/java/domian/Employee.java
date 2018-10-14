package domian;


import javax.persistence.*;

@Entity
@Table(name = "pracownicy")
public class Employee {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "imie",nullable = false, length = 20)
    private String firstname;
    @Column(name = "nazwisko", columnDefinition = "VARCHAR(10) NOT NULL")
    private String lastname;
    @Column(name = "pensja")
    private  double salary;
    @Column(precision = 10, scale = 2)
    private  double salary2;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
