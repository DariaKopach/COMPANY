package com.company;

import java.util.Objects;

/**
 * Classname: Company
 *
 * @version 23.06.2020
 * @author Kopach Daria
 *
 * 2. COMPANY Service implementation
 *
 * The following text is a real  approbation task for
 * Java Juniors in the EPAM company. No more explanation.
 *
 * IMPLEMENT THE FOLLOWING INTERFACE.
 *
 * public class Company {
 * // parent for this company nullable, when there is no parent for this company
 * private Company parent;
 * private long employeesCount;
 * }
 *
 * public interface ICompanyService {
 * /**
 *  * @param child - company for which we are searching the top level parent
 *  *                  (parent of parent of ...)
 *  * @return top level paren
 *
 * Company getTopLevelParent(Company child);
 *
 *
 *
 *  * @param company  - company for which we are searching the count of employees
 *  * (count of this company employees +
 *  * count employees of all children and their children employees )
 *  * @param companies  - list of all available companies
 *  *
 *  * @return count of employees
 *  *
 *  *long getEmployeeCountForCompanyAndChildren(Company company,List<Company> companies);
 *
 *
 *
 **/

public class Company {

    // parent for this company nullable, when there is no parent for this company
    private Company parent;
    private long employeesCount;

    public Company() {
    }

    public Company(Company parent, long employeesCount) {
        this.parent = parent;
        this.employeesCount = employeesCount;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return employeesCount == company.employeesCount &&
                Objects.equals(parent, company.parent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parent, employeesCount);
    }
}
