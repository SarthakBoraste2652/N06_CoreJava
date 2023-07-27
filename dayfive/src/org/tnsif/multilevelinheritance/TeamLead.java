package org.tnsif.multilevelinheritance;

public class TeamLead extends Manager {

	private String leadName;
	private String projectName;
	
	//parameterised constructor
	
	public TeamLead(String deptName, String name, int empID, String leadName, String projectName) {
		super(deptName, name, empID);
		this.leadName = leadName;
		this.projectName = projectName;
	}

	public String getLeadName() {
		return leadName;
	}

	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	// toString method
	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", projectName=" + projectName + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
