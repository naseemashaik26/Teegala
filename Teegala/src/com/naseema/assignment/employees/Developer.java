package com.naseema.assignment.employees;

public class Developer {
	    /**
	     * The primary programming language of the developer.
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
	    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
	        super();
	        this.programmingLanguage = programmingLanguage;
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
	}


