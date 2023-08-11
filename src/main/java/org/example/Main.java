package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello World!");
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader("C:\\Users\\Simplogics\\IdeaProjects\\GSONFileHandalingProject\\src\\allen.json"));
        Student s1 = gson.fromJson(reader,Student.class);
        System.out.println(s1.name);
        System.out.println(s1.age);
        JsonReader numbers = new JsonReader(new FileReader("C:\\Users\\Simplogics\\IdeaProjects\\GSONFileHandalingProject\\src\\numbers.json"));
        Type arrayListsType = new TypeToken<ArrayList<Integer>>(){}.getType();
        ArrayList<Integer> a = gson.fromJson(numbers,arrayListsType);
        for(int i:a){
            System.out.println(i);
        }
        JsonReader stringCollections = new JsonReader(new FileReader("C:\\Users\\Simplogics\\IdeaProjects\\GSONFileHandalingProject\\src\\strings.json"));
        Type arrayListsStringsType = new TypeToken<ArrayList<String>>(){}.getType();
        ArrayList<String> s = gson.fromJson(stringCollections,arrayListsStringsType);
        for(String i:s){
            System.out.println(i);
        }
        Type arrayListStudentsType = new TypeToken<ArrayList<Student>>(){}.getType();
        JsonReader studentsCollections = new JsonReader(new FileReader("C:\\Users\\Simplogics\\IdeaProjects\\GSONFileHandalingProject\\src\\studentsList.json"));
        ArrayList<Student> studentsList = gson.fromJson(studentsCollections,arrayListStudentsType);
        for(Student eachStudent:studentsList){
            System.out.println(eachStudent.name);
            System.out.println(eachStudent.age);
            System.out.println();
        }
    }
}