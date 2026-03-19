// ============================================
// OOP Complete Example ~ Company System
// Author ~ Vikas Kumar
// Topics ~ Encapsulation ~ Inheritance
// ============================================

// Parent class ~ Boss
class Boss {
    // Private fields ~ Encapsulation
    private int salary;
    private String name;

    // Setter ~ Salary validation
    public void setSalary(int s) {
        if (s >= 10000 && s <= 1000000) {
            salary = s;
        }
    }

    // Setter ~ Name
    public void setName(String n) {
        name = n;
    }

    // Getters
    public int getSalary() { return salary; }
    public String getName() { return name; }
}

// Child class 1 ~ CEO inherits Boss
class CEO extends Boss {
    // Override ~ CEO specific info
    public void info() {
        System.out.println("CEO controls the company");
    }
}

// Child class 2 ~ Employee inherits Boss
class Employee extends Boss {
    // Override ~ Employee specific info
    public void info() {
        System.out.println("Employee works for the company");
    }
}

// Main class ~ Program entry point
class Company {
    public static void main(String[] args) {

        // Boss object ~ Encapsulation demo
        Boss b1 = new Boss();
        b1.setName("Alex");
        b1.setSalary(20000);
        System.out.println("Boss name : " + b1.getName());
        System.out.println("Boss salary : " + b1.getSalary());

        // CEO object ~ Inheritance demo
        CEO c1 = new CEO();
        c1.info();

        // Employee object ~ Inheritance demo
        Employee e1 = new Employee();
        e1.info();
    }
}
```

---

**GitHub Description~**
```
Java OOP ~ Complete example combining 
Encapsulation and Inheritance using 
a Company system with Boss, CEO and 
Employee classes.
