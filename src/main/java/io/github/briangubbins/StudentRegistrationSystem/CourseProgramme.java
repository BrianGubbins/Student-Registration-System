/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.briangubbins.StudentRegistrationSystem;

/**
 *
 * @author brian
 */
import java.util.ArrayList;
import org.joda.time.LocalDate;

public class CourseProgramme {
	private String name;
	private ArrayList<Module> modules;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public CourseProgramme(String name,ArrayList<Module> modules, LocalDate startDate, LocalDate endDate) {
            this.name = name;
            this.modules = modules;
            this.startDate = startDate;
            this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}
	
	public void addModule(Module module) {
		modules.add(module);
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
}