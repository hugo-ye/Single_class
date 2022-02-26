package com.company;

public class Course {
    private String name;
    private String topic;
    private String nameOfTeacher;
    private int numberOfParticipants;

    public Course(String name, String topic, String nameOfTeacher, int numberOfParticipants) {
        this.name = name;
        this.topic = topic;
        this.nameOfTeacher = nameOfTeacher;
        this.numberOfParticipants = numberOfParticipants;
    }

    public boolean hasParticipants() {
        return numberOfParticipants > 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameOfTeacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        if (numberOfParticipants > 0) {
            this.numberOfParticipants = numberOfParticipants;
        } else {
            System.out.println("The number of participant is negative. NumberOfParticipants is not changed");
        }

    }
}
