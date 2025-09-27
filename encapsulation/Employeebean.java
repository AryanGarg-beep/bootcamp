import java.io.Serializable;
import java.util.Date;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

public class EmployeeBean implements Serializable {
  // TODO: Create private fields following JavaBean conventions:
  // - employeeId (String)
  // - firstName (String)
  // - lastName (String)
  // - salary (double)
  // - department (String)
  // - hireDate (java.util.Date)
  // - isActive (boolean)
  private String employeeId;
  private String firstName;
  private String lastName;
  private double salary;
  private String department;
  private Date hireDate;
  private boolean isActive;

  // TODO: Create default no-argument constructor (JavaBean requirement)
  public EmployeeBean() {
  }

  // TODO: Create parameterized constructor for convenience
  public EmployeeBean(String employeeId, String firstName, String lastName, double salary, String department,
      Date hireDate, boolean isActive) {
    this.employeeId = employeeId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.department = department;
    this.hireDate = hireDate;
    this.isActive = isActive;
  }

  // TODO: Generate standard JavaBean getter methods:
  // - getEmployeeId(), getFirstName(), getLastName(), etc.
  // - Follow naming convention: get + PropertyName
  // - For boolean: isActive() instead of getIsActive()
  public String getEmployeeId() {
    return employeeId;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public double getSalary() {
    return salary;
  }

  public String getDepartment() {
    return department;
  }

  public Date getHireDate() {
    return hireDate;
  }

  public boolean isActive() {
    return isActive;
  }

  // TODO: Generate standard JavaBean setter methods:
  // - setEmployeeId(String id), setFirstName(String name), etc.
  // - Follow naming convention: set + PropertyName
  // - Include validation where appropriate
  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setSalary(double salary) {
    if (salary >= 0)
      this.salary = salary;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public void setHireDate(Date hireDate) {
    this.hireDate = hireDate;
  }

  public void setActive(boolean isActive) {
    this.isActive = isActive;
  }

  // TODO: Create computed properties (getters without corresponding fields):
  // - getFullName() - returns firstName + " " + lastName
  // - getYearsOfService() - calculates years since hireDate
  // - getFormattedSalary() - returns salary with currency formatting
  public String getFullName() {
    return firstName + " " + lastName;
  }

  public int getYearsOfService() {
    if (hireDate == null)
      return 0;
    long diff = new Date().getTime() - hireDate.getTime();
    return (int) (diff / (1000L * 60 * 60 * 24 * 365));
  }

  public String getFormattedSalary() {
    return NumberFormat.getCurrencyInstance(Locale.US).format(salary);
  }

  // TODO: Create derived properties with validation:
  // - setFullName(String fullName) - splits into firstName/lastName
  // - setSalary(double salary) - validates positive amount
  public void setFullName(String fullName) {
    String[] parts = fullName.split(" ", 2);
    if (parts.length == 2) {
      this.firstName = parts[0];
      this.lastName = parts[1];
    }
  }

  // TODO: Override toString() to display all properties
  @Override
  public String toString() {
    return "EmployeeBean{" +
        "employeeId='" + employeeId + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", salary=" + salary +
        ", department='" + department + '\'' +
        ", hireDate=" + hireDate +
        ", isActive=" + isActive +
        '}';
  }

  // TODO: Override equals() and hashCode() based on employeeId
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    EmployeeBean that = (EmployeeBean) o;
    return Objects.equals(employeeId, that.employeeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId);
  }

  public static void main(String[] args) {
    // TODO: Create EmployeeBean using default constructor + setters
    // TODO: Create EmployeeBean using parameterized constructor
    // TODO: Demonstrate all getter methods
    // TODO: Test computed properties
    // TODO: Test validation in setter methods
    // TODO: Show JavaBean in action with collections (sorting, searching)
    // TODO: Create an array of EmployeeBeans and demonstrate:
    // - Sorting by salary using computed properties
    // - Filtering active employees
    // - Bulk operations using JavaBean conventions
  }
}

// TODO: Create a JavaBean utility class:
class JavaBeanProcessor {
  // TODO: Create static method printAllProperties(EmployeeBean emp)
  // - Uses reflection to find all getter methods
  // - Calls each getter and prints property name and value
  // - Demonstrates JavaBean introspection capabilities
  public static void printAllProperties(EmployeeBean emp) {
    try {
      var methods = emp.getClass().getMethods();
      for (var method : methods) {
        if ((method.getName().startsWith("get") || method.getName().startsWith("is"))
            && method.getParameterCount() == 0) {
          System.out.println(method.getName() + " = " + method.invoke(emp));
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // TODO: Create static method copyProperties(EmployeeBean source, EmployeeBean
  // target)
  // - Uses reflection to copy all properties from source to target
  // - Demonstrates JavaBean framework integration potential
  public static void copyProperties(EmployeeBean source, EmployeeBean target) {
    try {
      var methods = source.getClass().getMethods();
      for (var method : methods) {
        if ((method.getName().startsWith("get") || method.getName().startsWith("is"))
            && method.getParameterCount() == 0) {
          String propName = method.getName().startsWith("get")
              ? method.getName().substring(3)
              : method.getName().substring(2);
          try {
            var setter = target.getClass().getMethod("set" + propName, method.getReturnType());
            setter.invoke(target, method.invoke(source));
          } catch (NoSuchMethodException ignored) {
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
