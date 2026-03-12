public class MemberCard{


private static int counter=1;
private static final String PREFIX = "LIB-";
private String cardNo;
private String studentName;
private String department;
private int semester;
private double feePaid;
private boolean active;

private static String generateCardNo() {
        return PREFIX + String.format("%04d", counter++);
}

public MemberCard() {
	this("Default MemberCard");
	System.out.println("Default constructor called");
}

public MemberCard(String studentName) {
	this(studentName, "BSSE" , 1 , 0.0 , true);
}

public MemberCard(String studentName, String department) {
	this(studentName, department , 1 , 0.0 ,true );
}

public MemberCard(String studentName, String department, int semester) {
	this(studentName, department , semester , 1 , true );

}
public MemberCard(String studentName, String department, int semester , double feePaid) {
	this(studentName, department , semester , 0.0 , true );

}
public MemberCard(String studentName, String department, int semester, double feePaid, boolean active) {
	this.cardNo=generateCardNo();      
	setStudentName(studentName);
	setDepartment(department);
	setSemester(semester);
	setFeePaid(feePaid);
	setActive(active);
}

public MemberCard(MemberCard other) {
	this(other.studentName,other.department,other.semester,other.feePaid,other.active);
}

public void setStudentName(String studentName) {
        if (studentName == null || studentName.trim().isEmpty()) {
            this.studentName = "Unnamed Product";
        } 
	else {
            this.studentName = studentName.trim();
        }
    }

public void setDepartment(String department) {
        if (department == null || department.trim().isEmpty()) {
            this.department = "BSSE";
        } else {
            this.department = department.trim();
        }
    }

    public void setSemester(int semester) {
    	if (semester > 0) {
        	this.semester = semester;
    	} else {
        System.out.println("Invalid semester!");
        
    }
}

    public void setFeePaid(double feePaid) {
        if (feePaid >= 0) {
            this.feePaid = feePaid;
        } 
	else {
            System.out.println("Amount cannot be negative.");
        }
    }

    public void setActive(boolean active) {
        if (active == false) {
            System.out.println("System is not active");
            this.active = false ;
        } else {
            this.active = active;
        }
    }
public String getStudentName() {
        return studentName;
    }

    public String getDepartment() {
        return department;
    }

    public int getSemester() {
        return semester;
    }

    public double getFeePaid() {
        return feePaid;
    }

    public boolean getActive() {
        return active;
    }



public static int getTotalCards() {
	return counter - 1;
}
public void deactivateCard() {
	active = false;
}

public void activateCard() {
	active = true;
}
public void payFee(double amount) {
	if (amount > 0){
		feePaid+=amount;
	}
	else {
		System.out.println("Invalid Input !.Fee cannot be in negative value");
	}

}

public String toString(){
	return cardNo + " " + studentName + " " + department + " " + semester + " " + "Fee: " + feePaid + " " + " Active: " + active;

}
   
}



