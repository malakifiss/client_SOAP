package client;

import stu.EtudiantWService;
import stu.Student;
import stu.StudentService;

import java.util.List;

public class ClientSoap {
    public static void main(String[] args) {
        EtudiantWService wsdl=new StudentService().getEtudiantWServicePort();
        List<Student> liste=wsdl.getEtudiants();
        for(Student s:liste){
            System.out.println(s.getNom()+" "+s.getPrenom()+" "+s.getGenre());
        }
    }
}