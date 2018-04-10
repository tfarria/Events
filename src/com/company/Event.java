package com.company;

import java.util.ArrayList;

public class Event {
    private String title;
    private String startDate;
    private String endDate;
    private ArrayList<Speaker> speakerList;

    public Event() {

    }

    public Event(String title, String startDate, String endDate) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        speakerList = new ArrayList<>();
    }

    public void setSpeakers (String name){
        Speaker newSpeaker = new Speaker();
        newSpeaker.setName(name);
        speakerList.add(newSpeaker);
        setSpeakerList(speakerList);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Speaker> getSpeakerList() {
        return speakerList;
    }

    public void setSpeakerList(ArrayList<Speaker> speakerList) {
        this.speakerList = speakerList;
    }
}
//    Create an application to keep track of events and speakers.
//        Each event can have multiple speakers.
//        Each event has a start date, end date and a title.
//        Each speaker has a name.
//
//        Your application should allow a user to:
//
//        1. Create an event
//        2. Add a speaker to an event
//        3. Show all the speakers for all events
//        4. Show all the speakers for a given event (selected by the user)
//
//        Your application should be menu driven, so when you first enter the application, you should see the list above.
//        When you select a number, you should be able to perform the action that the number references.
//
//
//        For items 2 and 4, you should be able to select the name of the event that you want to display details of.
//
//        Done already?
//
//        Make it possible to search for upcoming and past events.
//
//        Add additional menu items for each.