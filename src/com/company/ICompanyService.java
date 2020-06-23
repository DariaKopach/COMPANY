package com.company;

import java.util.List;

/**
 * Interface ICompanyService
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

public interface ICompanyService {

    /**
     * @param child - company for which we are searching the top level parent
     *              (parent of parent of ...)
     * @return top level parent
     */
    Company getTopLevelParent(Company child);

    /**
     * @param company   - company for which we are searching the count of employees
     *                  (count of this company employees +
     *                  count employees of all children and their children employees )
     * @param companies - list of all available companies
     * @return count of employees
     */
    long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies);
}



