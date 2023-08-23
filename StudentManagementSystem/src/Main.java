import Models.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static Validate.StudentValidate.checkStudentValidate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Student[] studentList = new Student[100];
    static Scanner input = new Scanner(System.in);
    static int index = 0;

    public static void main(String[] args) throws ParseException {
        start();
    }

    public static void start() throws ParseException {
        boolean isRunning = true;
        while (isRunning) {
            displayMainScreen();
            switch (input.nextInt()) {
                case 1:
                    try {
                        addStudent(createStudent());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        findStudentById();
                    } catch (Exception e) {
                        System.out.println("Không tìm thấy sinh viên phù hợp");
                    }
                    break;
                case 4:
                    try {
                        deleteStudentById();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        displayAllStudent();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }

        }
    }

    public static void displayMainScreen() {
        System.out.println("-------------Hệ thống quản lý sinh viên-------------");
        System.out.println("Nhập lựa chọn");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Tìm sinh viên theo ID");
        System.out.println("3. Sửa sinh viên");
        System.out.println("4. Xóa sinh viên theo id");
        System.out.println("5. Hiển thị toàn bộ sinh viên");
        System.out.println("0. Thoát chương trình");
    }

    //input student
    public static Student createStudent() throws ParseException {
        System.out.println("Họ tên:");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("Ngày sinh(dd/MM/yyyy)");
        Date birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(input.nextLine());
        System.out.println("Địa chỉ");
        String address = input.nextLine();
        System.out.println("Chiều cao(cm)");
        double height = input.nextDouble();
        System.out.println("Cân nặng(kg)");
        double weight = input.nextDouble();
        System.out.println("Tên trường");
        String schoolName = input.nextLine();
        input.nextLine();
        System.out.println("Năm nhập học");
        int startYear = input.nextInt();
        System.out.println("Điểm trung bình");
        Double avgScore = input.nextDouble();

        //check validate
        if (checkStudentValidate(name.length(), address.length(), startYear, weight, height, schoolName.length(), avgScore)) {
            Student student = new Student(name, birthDate, address, height, weight, schoolName, startYear, avgScore);
            return student;
        }
        return null;
    }

    //add student
    public static void addStudent(Student student) {
        if (student == null)
            System.out.println("Thêm sinh viên không thành công");
        else {
            studentList[index] = student;
            index++;
        }

    }

    //find student by id
    public static Student find() {
        System.out.println("Nhập mã sinh viên cần tìm kiếm");
        int id = input.nextInt();
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i].getId() == id) {
                return studentList[i];
            }
        }
        return null;
    }

    //display student by id
    public static void findStudentById() {
        Student student = find();
        if (student == null) {
            System.out.println("Không tìm thấy sinh viên phù hợp");
        } else {
            System.out.println(student.toString());

        }
    }
    //delete student by id
    public static boolean deleteStudentById() {
        System.out.println("Nhập mã sinh viên cần xóa");
        int id = input.nextInt();
        int index;
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i].getId() == id) {
                for (int j = i; j < studentList.length - 1; j++) {
                    studentList[j] = studentList[j + 1];
                }
                return true;
            }
        }
        return false;
    }

    //display all student
    public static void displayAllStudent() {
        System.out.println("Danh sách toàn bộ sinh viên");
        for (int i = 0; i < index; i++) {
            System.out.println(studentList[i].toString());
        }
    }
}