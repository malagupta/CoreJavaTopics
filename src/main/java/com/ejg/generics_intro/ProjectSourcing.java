package com.ejg.generics_intro;
import java.util.ArrayList;
import java.util.List;

interface WritingDevices {}
record UsedPen(String penType) implements WritingDevices {}
record UsedPencil(String name, double price) implements WritingDevices {}

public class ProjectSourcing {
    public static void main(String[] args) {
        List<WritingDevices> writingDevices = new ArrayList<>();
        writingDevices.add(new UsedPen("Ink Pen"));
        writingDevices.add(new UsedPencil("Apsara", 10.0));

        writingDevices.forEach(System.out::println);
    }
}