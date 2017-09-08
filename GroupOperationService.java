import java.util.Date;
import java.util.function.Predicate;

public interface GroupOperationService {

	Student[] getStudents();

	/**
	 * if students == null method should throw IllegalArgumentException
	 *
	 * @param students
	 */
	void setStudents(Student[] students);

	/**
	 * if index lower than 0 or index higher/equal students.length method should
	 * throw IllegalArgumentException
	 *
	 * @param index
	 */
	Student getStudent(int index);

	/**
	 * if student == null method should throw IllegalArgumentException if index
	 * lower than 0 or index higher/equal students.length method should throw
	 * IllegalArgumentException
	 *
	 * @param student
	 */
	void setStudent(Student student, int index);

	/**
	 * if student == null method should throw IllegalArgumentException
	 *
	 * @param student
	 */
	void addFirst(Student student);

	/**
	 * if student == null method should throw IllegalArgumentException
	 *
	 * @param student
	 */
	void addLast(Student student);

	/**
	 * if student == null method should throw IllegalArgumentException if index
	 * lower than 0 or index higher/equal students.length method should throw
	 * IllegalArgumentException
	 *
	 * @param student
	 * @param index
	 */
	void add(Student student, int index);

	/**
	 * if index lower than 0 or index higher/equal students.length method should
	 * throw IllegalArgumentException
	 *
	 * @param index
	 */
	void remove(int index);

	/**
	 * if student == null method should throw IllegalArgumentException
	 *
	 * @param student
	 */
	void remove(Student student);

	/**
	 * if index lower than 0 or index higher/equal students.length method should
	 * throw IllegalArgumentException
	 *
	 * @param index
	 */
	void removeFromIndex(int index);

	/**
	 * if student == null method should throw IllegalArgumentException
	 *
	 * @param student
	 */
	void removeFromElement(Student student);

	/**
	 * if index lower than 0 or index higher/equal students.length method should
	 * throw IllegalArgumentException
	 *
	 * @param index
	 */
	void removeToIndex(int index);

	/**
	 * if student == null method should throw IllegalArgumentException
	 *
	 * @param student
	 */
	void removeToElement(Student student);

	/**
	 * perform Bubble Sort by student name
	 *
	 */
	void bubbleSort();

	/**
	 * if date == null, method should throw IllegalArgumentException
	 * 
	 * @param date
	 */
	Student[] getByBirthDate(Date date);

	/**
	 * if firstDate == null or lastDate == null, method should throw
	 * IllegalArgumentException
	 * 
	 * @param firstDate
	 * @param lastDate
	 */
	Student[] getBetweenBirthDates(Date firstDate, Date lastDate);

	/**
	 * if date == null, method should throw IllegalArgumentException
	 * 
	 * @param date
	 * @param days
	 *            near date
	 */
	Student[] getNearBirthDate(Date date, int days);

	/**
	 * if indexOfStudent == 0, method should throw IllegalArgumentException
	 * 
	 * @param indexOfStudent
	 */
	int getCurrentAgeByDate(int indexOfStudent);

	Student[] getStudentsByAge(int age);

	Student[] getStudentsWithMaxAvgMark();

	/**
	 * if student == null, method should throw IllegalArgumentException
	 * 
	 * @param student
	 */
	Student getNextStudent(Student student);

}
