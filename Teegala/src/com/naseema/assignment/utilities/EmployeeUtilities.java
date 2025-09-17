package com.naseema.assignment.utilities;

import com.naseema.assignment.employees.Developer;
import com.naseema.assignment.employees.Manager;

public class EmployeeUtilities {
	/**
	 * Represents a Developer, which is a subclass of Employee.
	 * It includes an additional attribute for the primary programming language.
	 */
	    
	    private String programmingLanguage;

	    /**
	     * Constructs a new Developer object.
	     *
	     * @param name The name of the developer.
	     * @param employeeId The unique ID of the developer.
	     * @param salary The salary of the developer.
	     * @param programmingLanguage The developer's primary programming language.
	     */
	    public EmployeeUtilities(String name, int employeeId, double salary, String programmingLanguage) {
	        super();
	        this.programmingLanguage = programmingLanguage;
	    }

	    public EmployeeUtilities() {
			// TODO Auto-generated constructor stub
		}

		/**
	     * Gets the primary programming language of the developer.
	     *
	     * @return The developer's programming language.
	     */
	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }

	    /**
	     * Sets the primary programming language of the developer.
	     *
	     * @param programmingLanguage The new programming language for the developer.
	     */
	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }

		public void displayEmployeeDetails(Developer developer1) {
			// TODO Auto-generated method stub
			
		}

		public void giveBonus(Manager manager1, double d) {
			// TODO Auto-generated method stub
			
		}

		public void displayEmployeeDetails(Manager manager1) {
			// TODO Auto-generated method stub
			
		}

		public void giveBonus(Developer developer1, double d) {
			// TODO Auto-generated method stub
			
		}
	}


