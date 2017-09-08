import java.util.Date;

public class Student implements Comparable {

	private int id;
	private String fullName;
	private Date birthDate;
	private double avgMark;

	public Student(int id, String fullName, Date birthDate, double avgMark) {
		ID = id;
		this.fullName = fullName;
		DOB = birthDate;
		Marks = avgMark;
	}

	public int getId() {
	return id;
	}

	public void setId(int id) {
	ID = id;
	}

	public String getFullName() {
	return fullName;
	}

	public void setFullName(String fullName) {
	this.fullName = fullName;
	}

	public Date getBirthDate() {
	return birthDate;
	}

	public void setBirthDate(Date birthDate) {
	DOB= birthDate;
	}

	public double getAvgMark() {
	return avgMark;
	}

	public void setAvgMark(double avgMark) {
	Marks=avgMark;
	}

	@Override
	public boolean equals(Object o) {
	        
     if (this == o) {
        return true;
    }
    if (o == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    Advertisement o = (Advertisement) o;
    return this.getId().equals(o.getId());
}
}
	

	@Override
	public int hashCode() {
	return getId().hashCode();
	}

	@Override
	public int compareTo(Object o) {
	int cmp = getFullName().compareToIgnoreCase(g.getFullName());
       if (cmp != 0) return cmp;
        return (getId() < g.getId() ? -1 : getId() == g.getId() ? 0 : 1);
	}
}

//

//////
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nstudents;
		String stName;
		int stID;
		double stmarks;
		Date stdob;

		System.out.print("How many students would you like to enter?");
		nstudents = sc.nextInt();
		sc.nextLine();
		ArrayList studentArray = new ArrayList(nstudents);
		
		for (int i = 0; i < nstudents; i++) {
			System.out.print("Enter name: ");
			stName = sc.nextLine();
			System.out.print("Enter ID: ");
			stID = sc.nextInt();
			System.out.print("Enter marks:");
			stMarks = sc.nextDouble();
			sc.nextInt();
			System.out.print("Enter dob:");
			stDob = sc.nextLine();
			studentArray.add(new Student( stID, stName,stDob,stMarks));
		}
		
		
		//System.out.println("Average is: " + Student.getAverage(studentArray));
		for (ListIterator stIterator = studentArray.listIterator(); stIterator.hasNext(); ) {
			Student st = (Student)stIterator.next();
			System.out.println(st);
		}
		
		ListIterator studentIterator = studentArray.listIterator();
		
		while (studentIterator.hasNext()) {
			Student st = (Student)studentIterator.next();
			System.out.println(st);
		}
		
		System.out.print("Who would you like to delete?");
		String nameToRemove = sc.nextLine();
	
		Student tempStudent = new Student();
		tempStudent.setName(nameToRemove);
		int stIndex = studentArray.indexOf(tempStudent);
		studentArray.remove(stIndex);
		
//		for (int i = 0; i < studentArray.size(); i++) {
//			Student tempStudent = (Student)studentArray.get(i);
//			if (tempStudent.getName().equals(nameToRemove)) {
//				studentArray.remove(i);
//			}
//		}
		
		studentIterator = studentArray.listIterator();
		
		while (studentIterator.hasNext()) {
			Student st = (Student)studentIterator.next();
			System.out.println(st);
		}
		
		
		
//		for (int j = 0; j < studentArray.size(); j++) {
//			System.out.println(studentArray.get(j));
//			
//		}
		
		// compute and print out average GPA
		// print out all students' name, ID and GPA
		
	}

}

