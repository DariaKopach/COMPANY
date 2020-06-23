package com.company;

import java.util.Objects;

/**
 * Classname: Company
 *
 * @author Kopach Daria
 * <p>
 * 2. COMPANY Service implementation
 * <p>
 * The following text is a real  approbation task for
 * Java Juniors in the EPAM company. No more explanation.
 * <p>
 * IMPLEMENT THE FOLLOWING INTERFACE.
 * <p>
 * public class Company {
 * // parent for this company nullable, when there is no parent for this company
 * private Company parent;
 * private long employeesCount;
 * }
 * <p>
 * public interface ICompanyService {
 * /**
 * * @param child - company for which we are searching the top level parent
 * *                  (parent of parent of ...)
 * * @return top level paren
 * <p>
 * Company getTopLevelParent(Company child);
 * <p>
 * <p>
 * <p>
 * * @param company  - company for which we are searching the count of employees
 * * (count of this company employees +
 * * count employees of all children and their children employees )
 * * @param companies  - list of all available companies
 * *
 * * @return count of employees
 * *
 * *long getEmployeeCountForCompanyAndChildren(Company company,List<Company> companies);
 * @version 23.06.2020
 **/

public class Company {

    // parent for this company nullable, when there is no parent for this company
    private Company parent;
    private long employeesCount;

    // 1. Constructor:
    // a) generate an empty constructor using Java

    public Company() {
    }

    /**
     * b) generate the full constructor using Java
     * with the following parameters:
     *
     * @param parent,        which will be the parent company
     * @param employeesCount long, which will be set total number of employee
     */

    public Company(Company parent, long employeesCount) {
        this.parent = parent;
        this.employeesCount = employeesCount;
    }

    // generate getters and setters for the above parameters

    public Company getParent() {
        return parent;
    }

    public void setParent(Company parent) {
        this.parent = parent;
    }

    public long getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(long employeesCount) {
        this.employeesCount = employeesCount;
    }


    /**
     * Method to get formatted Parallelogram object
     *
     * @return Returns info about Parallelogram object
     */

    @Override
    public String toString() {
        return "Company{" +
                "parent=" + parent +
                ", employeesCount=" + employeesCount +
                '}';
    }

    /**
     * Method to check whether object equals by value
     *
     * @param o Object as parameter
     * @return Return boolean value as a result
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return employeesCount == company.employeesCount &&
                Objects.equals(parent, company.parent);
    }

    /**
     * Method to get object hash
     *
     * @return hash of Company
     */

    @Override
    public int hashCode() {
        return Objects.hash(parent, employeesCount);
    }
}
