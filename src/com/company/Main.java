package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Classname: Main
 *
 * @author Kopach Daria
 * <p>
 * <p>
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

public class Main {

    /**
     * Main method to execute
     *
     * @param args String params.
     */

    public static void main(String[] args) {

        ICompanyServiceImpl service = new ICompanyServiceImpl();

        // create the list of companies and add to it items according our task

        List<Company> listOfCompanies = new ArrayList<>();
        Company chief = new Company(null, 3);
        Company lawyer = new Company(chief, 4);
        Company developer = new Company(chief, 5);
        Company frontEnd = new Company(developer, 6);
        Company backEnd = new Company(developer, 7);
        Company design = new Company(frontEnd, 3);
        Company devOps = new Company(backEnd, 5);
        Company accounting = new Company(null, 4);


        // print out on console the parent company

        System.out.println(service.getTopLevelParent(chief));
        System.out.println(service.getTopLevelParent(lawyer));
        System.out.println(service.getTopLevelParent(developer));
        System.out.println(service.getTopLevelParent(frontEnd));
        System.out.println(service.getTopLevelParent(backEnd));
        System.out.println(service.getTopLevelParent(design));
        System.out.println(service.getTopLevelParent(devOps));
        System.out.println(service.getTopLevelParent(accounting));

        // print out on console the number of employees

        System.out.println(service.getEmployeeCountForCompanyAndChildren(chief,
                listOfCompanies));
        System.out.println(service.getEmployeeCountForCompanyAndChildren(lawyer,
                listOfCompanies));
        System.out.println(service.getEmployeeCountForCompanyAndChildren(developer,
                listOfCompanies));
        System.out.println(service.getEmployeeCountForCompanyAndChildren(frontEnd,
                listOfCompanies));
        System.out.println(service.getEmployeeCountForCompanyAndChildren(backEnd,
                listOfCompanies));
        System.out.println(service.getEmployeeCountForCompanyAndChildren(design,
                listOfCompanies));
        System.out.println(service.getEmployeeCountForCompanyAndChildren(devOps,
                listOfCompanies));
        System.out.println(service.getEmployeeCountForCompanyAndChildren(accounting,
                listOfCompanies));

    }
}
