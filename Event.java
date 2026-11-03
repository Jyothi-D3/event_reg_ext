package com.example.demo_lab_ext;

public class Event {
 private String eventName;
 public Event(){
	 
 }
 public Event(String eventName) {
	 this.eventName=eventName;
	 
 }
 public String getEvent() {
	 return eventName;
 }
 
 public void setEventName(String eventName) {
	 this.eventName=eventName;
 }
}
