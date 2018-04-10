package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean stop = false;
        boolean doneSpeaker = false;
        String exit, name, titleSearch, speakerAns;
        int eventID;
        Event anEvent;
        ArrayList<Event> eventList = new ArrayList<>();
        String answer = " ";

        do{
            System.out.println("Select an action from the menu");
            System.out.println("1. Create an event");
            System.out.println("2. Add a speaker to an event");
            System.out.println("3. Show all the speakers for all events:");
            System.out.println("4. Show all the speakers for a given event");
            System.out.println("5. Exit");
            System.out.println("ENTER: 1 -5");
            answer=keyboard.nextLine();
            if (answer.equalsIgnoreCase("1")){
                anEvent = new Event();
                System.out.println("Enter an event title");
                anEvent.setTitle(keyboard.nextLine());
                System.out.println("Enter an event start date (yyyy-MM-dd)");
                anEvent.setStartDate(keyboard.nextLine());
                System.out.println("Enter an event end date (yyyy-MM-dd)");
                anEvent.setEndDate(keyboard.nextLine());
                eventList.add(anEvent);
            }else if (answer.equalsIgnoreCase("2")) {
//                Search event titles
                System.out.println("Search for event titles to add event speakers");
                titleSearch=keyboard.nextLine();
                for (Event eachEvent : eventList) {
                    if (eachEvent.getTitle().contains (titleSearch)) {
                        System.out.println("Event ID: "+eventList.indexOf(eachEvent)+", Event Title: "+eachEvent.getTitle());
                    }
                }
//                Call event and add speakers
                System.out.println("Enter the event ID for event you would like to add speakers to");
                eventID = keyboard.nextInt();
                keyboard.nextLine();
                eventList.get(eventID);

//                Loop
                do {
                    System.out.println("Enter speaker for "+eventList.get(eventID).getTitle());
                    name=keyboard.nextLine();
                    anEvent = eventList.get(eventID);
                    anEvent.setSpeakers(name);
                    eventList.add(anEvent);

                    System.out.println("Would you like to add another speaker?");
                    speakerAns = keyboard.nextLine();
                    if (speakerAns.equalsIgnoreCase("no")||speakerAns.equalsIgnoreCase("n")){
                        doneSpeaker=true;
                    }
                }while (!doneSpeaker);


            }else if (answer.equalsIgnoreCase("3")){
                for (Event eachEvent: eventList){
                System.out.println("EVENT DETAILS");
                System.out.println("Event Title: "+eachEvent.getTitle());
                System.out.println("Event Start Date: "+eachEvent.getStartDate());
                System.out.println("Event End Date: "+eachEvent.getEndDate());
                System.out.println("_________________");
                System.out.println("Event Speaker: ");
                for(Speaker eachSpeaker: eachEvent.getSpeakerList()){
                    System.out.println(eachSpeaker);
                }
                System.out.println("*********************************************");
                }


            }else if(answer.equalsIgnoreCase("4")){
                System.out.println("Which Speaker would you like to access ? : ");
                name=keyboard.nextLine();
//                anEvent.getSpeakerList();

            }else if(answer.equalsIgnoreCase("5")){
                stop=true;
            }
        }while (!stop);
    }
}
